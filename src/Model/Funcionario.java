/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import Persistencia.Banco;
import javax.swing.JOptionPane;
/**
 *
 * @author Sandra
 */
public class Funcionario extends Pessoa implements Login,Relatorio{
    private int codFuncionario;
    private String id;
    private String senha;
    private String categoria;
    ResultSet rst;
    Banco banco=new Banco();
    Quarto quarto=new Quarto();
    Reserva reserva=new Reserva();
    Cliente cliente=new Cliente();
    
    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void gerarRelatorio(int tipo){ 
    }
    
    @Override
    public boolean logar(String usuarioInserido,String senhaInserida){ 
        boolean retorno =banco.loginNoBanco(usuarioInserido, senhaInserida);
        if(retorno){
            banco.conectarAoBanco();
            banco.modificarTabela("INSERT INTO funcionarioatual values('"+usuarioInserido+"','"+senhaInserida+"');");
            banco.desconectarDoBanco();
        }
        banco.desconectarDoBanco();
        return retorno;
    }
    public boolean verificarNivel(){
        if(banco.conectarAoBanco()){
            rst=banco.pesquisarNoBanco("SELECT f.categoria FROM funcionario as f,funcionarioatual as a WHERE a.usuario=f.usuario and a.senha=f.senha;");
            try{
                while(rst.next()){
                    this.setCategoria(rst.getString("f.categoria"));
                    if(this.getCategoria().equals("Gerente")){
                        return true;
                    }
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao encontrar funcionário logado!");
                return false;
            }
            finally{
                banco.desconectarDoBanco();
            }
        }
        banco.desconectarDoBanco();
        return false;
    }
    
    public void limparUsuarioAtual(){
        banco.conectarAoBanco();
        banco.modificarTabela("DELETE FROM funcionarioatual;");
        banco.desconectarDoBanco();
    }
    
    public void exibirRelatorios(String tipoRelatorio){       
    }
    
    public void cadastrarQuarto(int numero,String tipo,String status,double valorDiario,int ar,int wifi,int frigobar){
        quarto.cadastrarQuarto(numero, tipo, status, valorDiario, ar, wifi, frigobar);
    }
    
    public String[] exibirQuarto(int numero){
        return quarto.exibirQuarto(numero);
    }
    
    public String[][] listarQuartos(){
        return quarto.listarQuartos();
    }
    
    public void excluirQuarto(int numero){
        quarto.excluirQuarto(numero);
    }
    
    public void realizarCheckOut(int numero){
        quarto.realizarCheckOut(numero);
    }
    
    public int[] exibirSelecionados(String selecionados[]){
        return quarto.exibirSelecionados(selecionados);
    }
    
    public String[][] exibirSelecionadosReserva(String selecionados[]){
        return reserva.exibirSelecionadosReserva(selecionados);
    }
    
    public void cadastrarFuncionario(String nome,String cpf,String rua,String bairro,int numero,String cidade, String estado,
        String dataNascimento,String telefone,String usuario,String senha,String categoria){
        banco.conectarAoBanco();
        try{
            if(categoria.equals("Gerente")){
                banco.gerenciarUsuarioNoBanco("CREATE USER '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
                banco.modificarTabela("INSERT INTO funcionario(nome,cpf,rua,bairro,numero,cidade,estado,dataNascimento,telefone,"
                        + "usuario,senha,categoria) values('"+nome+"','"+cpf+"','"+rua+"','"+bairro+"','"+numero+"','"+cidade+
                    "','"+estado+"','"+dataNascimento+"','"+telefone+"','"+usuario+"','"+senha+"','"+categoria+"')");
            }
            else{
                banco.gerenciarUsuarioNoBanco("CREATE USER '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
                banco.modificarTabela("INSERT INTO funcionario(nome,cpf,rua,bairro,numero,cidade,estado,dataNascimento,telefone,"
                        + "usuario,senha,categoria) values('"+nome+"','"+cpf+"','"+rua+"','"+bairro+"','"+numero+"','"+cidade+
                    "','"+estado+"','"+dataNascimento+"','"+telefone+"','"+usuario+"','"+senha+"','"+categoria+"')");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar funcionário!");
        }
        finally{
            banco.desconectarDoBanco();
        }
    }
    
    public String[][] listarFuncionarios(){
        String resultados[][];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM funcionario;");
        try{
            while(rst.next()){
                cont++;
            }
            resultados=new String[cont][13];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT * FROM funcionario;");
            while(rst.next()){
                resultados[cont][0]=rst.getString("nome");
                resultados[cont][1]=rst.getString("cpf");
                resultados[cont][2]=rst.getString("rua");
                resultados[cont][3]=String.valueOf(rst.getInt("numero"));
                resultados[cont][4]=rst.getString("bairro");
                resultados[cont][5]=rst.getString("cidade");
                resultados[cont][6]=rst.getString("estado");
                resultados[cont][7]=rst.getString("dataNascimento");
                resultados[cont][8]=rst.getString("telefone");
                resultados[cont][9]=rst.getString("usuario");
                resultados[cont][10]=rst.getString("senha");
                resultados[cont][11]=rst.getString("categoria");
                resultados[cont][12]=String.valueOf(rst.getInt("codFuncionario"));
                cont++;
            }
            return resultados;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro interno ao listar funcionários!");
        }
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public void excluirFuncionario(int codFuncionario){
        String usuario;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT usuario FROM funcionario WHERE codFuncionario="+codFuncionario+";");
        try{
            rst.next();
            usuario=rst.getString("usuario");
            banco.modificarTabela("DELETE FROM funcionario WHERE codFuncionario="+codFuncionario+";");
            banco.gerenciarUsuarioNoBanco("DROP USER '"+usuario+"'@'localhost';");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro interno ao excluir funcionário!");
        }
        finally{
            banco.desconectarDoBanco();
        }
    }
    
    public void reservarQuarto(int numero){
        this.quarto.reservarQuarto(numero);
    }
    
    public void cadastrarClienteResp(String nome,String cpfrg,String rua,String bairro,int numero,String cidade,String estado,String dataNasc,String telefone,int numQuarto){
        this.cliente.cadastrarClienteResp(nome, cpfrg, rua, bairro, numero, cidade, estado, dataNasc, telefone,numQuarto);
    }
    
    public void cadastrarClienteNormal(String nome,String cpfrg,int numQuarto){
        this.cliente.cadastrarClienteNormal(nome, cpfrg,numQuarto);
    }
    
    public String[][] listarClientes(){
        return this.cliente.listarClientes();
    }
    
    public void excluirCliente(int codCliente){
        this.cliente.excluirCliente(codCliente);
    }
}
