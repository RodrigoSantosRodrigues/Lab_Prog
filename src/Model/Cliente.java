/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Persistencia.Banco;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        banco.desconectarDoBanco();
    }
    
    public void cadastrarClienteResp(String nome,String cpfrg,String rua,String bairro,int numero,String cidade,String estado,String dataNasc,String telefone,int numQuarto){
        banco.conectarAoBanco();
        banco.modificarTabela("INSERT INTO cliente (nome,cpfrg,rua,bairro,numero,cidade,estado,dataNascimento,telefone,numQuarto) values('"+nome+"','"+cpfrg+"','"+rua+"','"+bairro+"',"+numero+",'"+cidade+"','"
                    +estado+"','"+dataNasc+"','"+telefone+"',"+numQuarto+");");
        banco.desconectarDoBanco();
    }
    
    public void cadastrarClienteNormal(String nome,String cpfrg,int numQuarto){
        banco.conectarAoBanco();
        banco.modificarTabela("INSERT INTO cliente (nome,cpfrg,numQuarto) values('"+nome+"','"+cpfrg+"',"+numQuarto+");");
        banco.desconectarDoBanco();
    }
    
    public String[] pesquisarAlterarCliente(int codCliente){
        String info[]=new String[9];
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM cliente WHERE codCliente="+codCliente+";");
        try{
            rst.next();
            info[0]=rst.getString("nome");
            info[1]=rst.getString("cpfrg");
            info[2]=rst.getString("rua");
            info[3]=String.valueOf(rst.getInt("numero"));
            info[4]=rst.getString("bairro");
            info[5]=rst.getString("cidade");
            info[6]=rst.getString("estado");
            info[7]=rst.getString("dataNascimento");
            info[8]=rst.getString("telefone");
            return info;
        }
        catch(SQLException e){}
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public void alterarCliente(int codCliente,String nome,String cpf,String rua,int numero,String bairro,String cidade,String estado,
        String dataNascimento,String telefone){
        banco.conectarAoBanco();
        banco.modificarTabela("UPDATE cliente SET nome='"+nome+"',cpfrg='"+cpf+"',rua='"+rua+"',numero="+numero+",bairro='"+bairro+"',cidade='"
        +cidade+"',estado='"+estado+"',dataNascimento='"+dataNascimento+"',telefone='"+telefone+"' WHERE codCliente="+codCliente+";");
        banco.desconectarDoBanco();
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
            JOptionPane.showMessageDialog(null,"Erro interno ao listar clientes!");
        }
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public void excluirCliente(int codCliente){
        banco.conectarAoBanco();
        banco.modificarTabela("DELETE FROM cliente WHERE codCliente="+codCliente+";");
        banco.desconectarDoBanco();
    }
    
}
