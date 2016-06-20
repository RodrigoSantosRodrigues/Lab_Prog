/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import Persistencia.Banco;
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
                    this.setCategoria(rst.getString("categoria"));
                    if(this.getCategoria().equals("Gerente")){
                        banco.desconectarDoBanco();
                        return true;
                    }
                }
            }
            catch(SQLException e){
                System.err.println(e);
                banco.desconectarDoBanco();
                return false;
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
    
    public int[] exibirSelecionados(String selecionados[]){
        return quarto.exibirSelecionados(selecionados);
    }
    
    public String[][] exibirSelecionadosReserva(String selecionados[]){
        return reserva.exibirSelecionadosReserva(selecionados);
    }
    
    public void cadastrarFuncionario(String nome,String cpf,String rua,String bairro,int numero,String cidade, String estado,
        String dataNascimento,String telefone,int codFuncionario,String usuario,String senha,String categoria){
        banco.conectarAoBanco();
        try{
            if(categoria.equals("Gerente")){
                banco.criarUsuarioNoBanco("CREATE USER '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
                banco.modificarTabela("INSERT INTO funcionario values('"+nome+"','"+cpf+"','"+rua+"','"+bairro+"','"+numero+"','"+cidade+
                    "','"+estado+"','"+dataNascimento+"','"+telefone+"','"+codFuncionario+"','"+usuario+"','"+senha+"','"+categoria+"')");
            }
            else{
                banco.criarUsuarioNoBanco("CREATE USER '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
                banco.modificarTabela("INSERT INTO funcionario values('"+nome+"','"+cpf+"','"+rua+"','"+bairro+"','"+numero+"','"+cidade+
                    "','"+estado+"','"+dataNascimento+"','"+telefone+"','"+codFuncionario+"','"+usuario+"','"+senha+"','"+categoria+"')");
            }
           
            
            banco.desconectarDoBanco();
        }
        catch(Exception e){
        System.err.println(e);
        }
        finally{
            
        }
        banco.desconectarDoBanco();
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
}
