/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import Persistencia.Banco;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Sandra
 */
public class Reserva{
    Banco banco=new Banco();
    ResultSet rst;
    String status,nome;
    int codigo;
    String datahora;
    int numQuarto;
    
    public Reserva(){
        banco.conectarAoBanco();
        banco.criarTabelaNoBanco("CREATE TABLE reserva(codigo integer not null auto_increment,primary key(codigo),nomeCliente varchar(30),numQuarto integer,dataReserva timestamp,status varchar(17),valorTotal double);");
        banco.desconectarDoBanco();
    }
    
    public String[][] exibirSelecionadosReserva(String selecionados[]){
        String info[][];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT numero,tipo,valorDiario FROM quarto WHERE tipo='"+selecionados[0]+"' AND valorDiario="+Double.parseDouble(selecionados[1])+" AND arCondicionado="+Boolean.parseBoolean(selecionados[2])
             +" AND wifi="+Boolean.parseBoolean(selecionados[3])+" AND frigobar="+Boolean.parseBoolean(selecionados[4])+";");
        try{  
            while(rst.next()){  
                
                cont++; 
            }
            info=new String[cont][3];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT numero,tipo,valorDiario,status FROM quarto WHERE tipo='"+selecionados[0]+"' AND valorDiario="+Double.parseDouble(selecionados[1])+" AND arCondicionado="+Boolean.parseBoolean(selecionados[2])
             +" AND wifi="+Boolean.parseBoolean(selecionados[3])+" AND frigobar="+Boolean.parseBoolean(selecionados[4])+";");         
            while(rst.next()){
                if(rst.getString("status").equals("Desocupado")){
                    info[cont][0]=String.valueOf(rst.getInt("numero"));
                    info[cont][1]=rst.getString("tipo");
                    info[cont][2]=String.valueOf(rst.getDouble("valorDiario"));
                    cont++;
                }
            }
            return info;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro interno ao exibir selecionados!");
        }  
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public String[][] listarReservas(){
        String resultados[][];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM reserva;");
        try{
            while(rst.next()){
                cont++;
            }
            resultados=new String[cont][6];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT * FROM reserva;");
            while(rst.next()){
                resultados[cont][0]=String.valueOf(rst.getInt("codigo"));
                resultados[cont][1]=rst.getString("nomeCliente");
                resultados[cont][2]=String.valueOf(rst.getInt("numQuarto"));
                resultados[cont][3]=rst.getString("dataReserva");
                resultados[cont][4]=rst.getString("status");
                resultados[cont][5]=String.valueOf(rst.getDouble("valorTotal"));    
                cont++;
            }
            return resultados;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro interno ao listar reservas!");
        }
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public void registrarReserva(String nomeCliente,int numQuarto,String status,double valorTotal){
        banco.conectarAoBanco();
        banco.modificarTabela("INSERT INTO reserva(nomeCliente,numQuarto,status,valorTotal) values ('"+nomeCliente+"',"+numQuarto+",'"+status+"',"+valorTotal+");");
        banco.desconectarDoBanco();
    }
    
    public void mudarStatusReserva(int numQuarto){
        banco.conectarAoBanco();
        banco.modificarTabela("UPDATE reserva SET status='Reserva não ativa' WHERE numQuarto="+numQuarto+";");
        banco.desconectarDoBanco();
    }
    
    public void excluirReserva(int codReserva){
        banco.conectarAoBanco();
        banco.modificarTabela("DELETE FROM reserva WHERE codigo="+codReserva+";");
        banco.desconectarDoBanco();
    }
    
    public void verificarPrazoReserva(){
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT codigo FROM reserva WHERE ADDDATE(dataReserva,INTERVAL 1 DAY)=CURRENT_TIMESTAMP() AND status='Reserva ativa';");
        try{
            while(rst.next()){
                   banco.modificarTabela("UPDATE reserva SET valorTotal=2*valorTotal WHERE codigo="+rst.getInt("codigo")+";");
                   banco.modificarTabela("UPDATE reserva SET dataReserva=ADDDATE(dataReserva,INTERVAL 1 DAY) WHERE codigo="+rst.getInt("codigo")+";");
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
        finally{
            banco.desconectarDoBanco();
        }
    }    
}
