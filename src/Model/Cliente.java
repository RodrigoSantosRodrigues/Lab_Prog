/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Persistencia.Banco;
import java.sql.SQLException;
/**
 *
 * @author Sandra
 */
public class Cliente extends Pessoa{
    Banco banco=new Banco();
    private static int codCliente;
    
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
    
}
