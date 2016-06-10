/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.ResultSet;
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
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT usuario,senha,categoria FROM funcionario;");
        String u,s,c;
        try{
            while(rst.next()){ 
                u=rst.getString("usuario");
                s=rst.getString("senha");
                c=rst.getString("categoria");
                if(u.equals(usuarioInserido)&&s.equals(senhaInserida)){
                    this.setId(u);
                    this.setSenha(s);
                    this.setCategoria(c);
                    banco.desconectarDoBanco();
                    return true;
                }
            } 
            banco.desconectarDoBanco();
        }
        catch(Exception e){
            System.err.println(e);
            banco.desconectarDoBanco();
            return false;
        }
        banco.desconectarDoBanco();
        return false;
    }
    /*public boolean verificarPermissaoGerenciamento(){
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT usuario,senha,categoria FROM funcionario;");
        try{
            while(rst.next()){
                System.out.println(this.getCategoria());
                if(this.getId().equals(rst.getString("usuario"))&&this.getSenha().equals(rst.getString("senha"))){
                    if (this.getCategoria().equals("gerente")) {
                        banco.desconectarDoBanco();
                        return true;
                    }
                }
            }
            banco.desconectarDoBanco();
        }
        catch(Exception e){
            System.err.println(e);
            banco.desconectarDoBanco();
            return false;
        }
        banco.desconectarDoBanco();
        return false; 
    }*/
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
        catch(Exception e){}
        finally{
            banco.inserirNaTabela("INSERT INTO quarto values("+numero+",'"+tipo+"','"+status+"',"+valorDiario+",'"+ar+"','"+wifi+"','"+frigobar+"');");
            banco.desconectarDoBanco();
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
