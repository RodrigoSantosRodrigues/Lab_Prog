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
    String usuario="Batata";
    String senhaT="Batata";
    
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
        return banco.loginNoBanco(usuarioInserido, senhaInserida);
    }
    public boolean verificarNivel(String usuarioInserido,String senhaInserida){
        if(banco.loginNoBanco(usuarioInserido, senhaInserida)){
            rst=banco.pesquisarNoBanco("SELECT categoria FROM funcionario WHERE usuario='"+usuarioInserido+"'AND senha='"+senhaInserida+"'");
            try{
                while(rst.next()){
                    this.setCategoria(rst.getString("categoria"));
                    if(this.getCategoria().equals("Gerente")){
                        return true;
                    }
                }
            }
            catch(SQLException e){
                System.err.println(e);
                return false;
            }
        }
        return false;
    }
    public void exibirRelatorios(String tipoRelatorio){       
    }
    
    public Funcionario cadastrarFunc(String nome,String cpf,String rua,String bairro,int numero,String cidade,String estado,String dataNascimento,String telefone,
            int codFuncionario,String id,String senha,String categoria){
        return null;
    }
    
    /*public Quarto consultarQuarto(int numQuarto){
        return Quarto;
    }*/
    
    public void cadastrarQuarto(int numero,String tipo,String status,double valorDiario,int ar,int wifi,int frigobar){
        banco.conectarAoBanco();
        try{
            banco.criarTabelaNoBanco("CREATE TABLE quarto(numero integer unique not null,tipo varchar(15),status varchar(10),valorDiario double,arCondicionado boolean,wifi boolean,frigobar boolean);");
        }
        catch(Exception e){
        System.err.println(e);
        }
        finally{
            banco.inserirNaTabela("INSERT INTO quarto values("+numero+",'"+tipo+"','"+status+"',"+valorDiario+",'"+ar+"','"+wifi+"','"+frigobar+"');");
            banco.desconectarDoBanco();
        }
        banco.desconectarDoBanco();
    }
    
    public Quarto exibirQuarto(int numero){
        Quarto quarto=new Quarto();
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM quarto WHERE numero="+numero+";");
        //System.out.println(numero);
        try{
            rst.next();
            quarto.setNumero(rst.getInt("numero"));
            quarto.setTipo(rst.getString("tipo"));
            quarto.setValorDiario(rst.getDouble("valorDiario"));
            quarto.setStatus(rst.getString("status"));
            quarto.setAr(rst.getBoolean("arCondicionado"));
            quarto.setWifi(rst.getBoolean("wifi"));
            quarto.setFrigobar(rst.getBoolean("frigobar"));
            banco.desconectarDoBanco();
            return quarto;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        banco.desconectarDoBanco();
        return null;
    }
    
    public void cadastrarFuncionario(String nome,String cpf,String rua,String bairro,int numero,String cidade, String estado,
            String dataNascimento,String telefone,int codFuncionario,String usuario,String senha,String categoria){
        banco.conectarAoBanco();
        try{
            banco.inserirNaTabela("INSERT INTO funcionario values('"+nome+"','"+cpf+"','"+rua+"','"+bairro+"','"+numero+"','"+cidade+
                    "','"+estado+"','"+dataNascimento+"','"+telefone+"','"+codFuncionario+"','"+usuario+"','"+senha+"','"+categoria+"')");
            if(categoria.equals("Gerente")){
                banco.criarUsuarioNoBanco("GRANT ALL PRIVILIGES ON hotel.* TO '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
            }
            else{
                banco.criarUsuarioNoBanco("GRANT SELECT ON hotel.* TO '"+usuario+"'@'localhost' IDENTIFIED BY '"+senha+"';");
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
    
    /*public Reserva reservarQuarto(int numero,int numQuarto){
        return Reserva;
    }*/
    
    /*public Cliente cadastrarCliente(String nome,String cpf,String rua,String bairro,int numero,String cidade,String estado,String dataNascimento,
            String telefone){
        return Cliente;
    }*/
}
