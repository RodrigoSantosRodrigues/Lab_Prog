/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Persistencia.Banco;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Sandra
 */
public class Cliente extends Pessoa{
    Banco banco=new Banco();
    private static int codCliente;
    ResultSet rst;
    public Cliente(){
        banco.conectarAoBanco();
        banco.criarTabelaNoBanco("CREATE TABLE cliente(nome varchar(30),cpfrg varchar(14),rua varchar(25),bairro varchar(20),numero integer,cidade varchar(20),"
                    + "estado varchar(2),dataNascimento varchar(10),telefone varchar(13),numQuarto integer,dataReserva timestamp,codCliente integer not null auto_increment,primary key(codCliente))");
    }
    
    public void cadastrarClienteResp(String nome,String cpfrg,String rua,String bairro,int numero,String cidade,String estado,String dataNasc,String telefone,int numQuarto){
        banco.conectarAoBanco();
        banco.modificarTabela("INSERT INTO cliente (nome,cpfrg,rua,bairro,numero,cidade,estado,dataNascimento,telefone,numQuarto) values('"+nome+"','"+cpfrg+"','"+rua+"','"+bairro+"',"+numero+",'"+cidade+"','"
                    +estado+"','"+dataNasc+"','"+telefone+"',"+numQuarto+");");
    }
    
    public void cadastrarClienteNormal(String nome,String cpfrg,int numQuarto){
        banco.conectarAoBanco();
        banco.modificarTabela("INSERT INTO cliente (nome,cpfrg,numQuarto) values('"+nome+"','"+cpfrg+"',"+numQuarto+");");
    }
    
    public String[][] listarClientes(){
        String resultados[][];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM cliente;");
        try{
            while(rst.next()){
                cont++;
            }
            resultados=new String[cont][12];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT * FROM cliente;");
            while(rst.next()){
                resultados[cont][0]=rst.getString("nome");
                resultados[cont][1]=rst.getString("cpfrg");
                resultados[cont][2]=rst.getString("rua");
                if(rst.getInt("numero")==0){
                    resultados[cont][3]="";
                }
                else{
                    resultados[cont][3]=String.valueOf(rst.getInt("numero"));
                }
                resultados[cont][4]=rst.getString("bairro");
                resultados[cont][5]=rst.getString("cidade");
                resultados[cont][6]=rst.getString("estado");
                resultados[cont][7]=rst.getString("dataNascimento");
                resultados[cont][8]=rst.getString("telefone");
                resultados[cont][9]=String.valueOf(rst.getInt("numQuarto"));
                resultados[cont][10]=rst.getString("dataReserva");
                resultados[cont][11]=String.valueOf(rst.getString("codCliente"));
                cont++;
            }
            return resultados;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return null;
    }
    
    public void excluirCliente(int codCliente){
        banco.conectarAoBanco();
        banco.modificarTabela("DELETE FROM cliente WHERE codCliente="+codCliente+";");
    }
    
}
