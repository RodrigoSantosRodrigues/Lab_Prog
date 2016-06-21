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
public class Reserva implements Relatorio{
    Banco banco=new Banco();
    ResultSet rst;
    String status;
    int codigo;
    String data;
    String hora;
    int numQuarto;
    
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
    
    @Override
    public void gerarRelatorio(int tipo){
    }
    
}
