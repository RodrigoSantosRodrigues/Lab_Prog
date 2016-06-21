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
public class Quarto {
    private int numero;
    private String tipo;
    private String status;
    private double valorDiario;
    private boolean wifi,ar,frigobar;
    Banco banco=new Banco();
    ResultSet rst;
    
    public Quarto(){
        banco.conectarAoBanco();
        banco.criarTabelaNoBanco("CREATE TABLE quarto(numero integer unique not null,tipo varchar(15),status varchar(10),valorDiario double,arCondicionado boolean,wifi boolean,frigobar boolean);");
        banco.desconectarDoBanco();
    }
    /**
     * @return the wifi
     */
    public boolean getWifi() {
        return wifi;
    }

    /**
     * @param wifi the wifi to set
     */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /**
     * @return the ar
     */
    public boolean getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(boolean ar) {
        this.ar = ar;
    }

    /**
     * @return the frigobar
     */
    public boolean getFrigobar() {
        return frigobar;
    }

    /**
     * @param frigobar the frigobar to set
     */
    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the valorDiario
     */
    public double getValorDiario() {
        return valorDiario;
    }

    /**
     * @param valorDiario the valorDiario to set
     */
    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }
    
    public void reservarQuarto(int numero){
        banco.conectarAoBanco();
        banco.modificarTabela("UPDATE quarto SET status='Ocupado' WHERE numero="+numero+";");
        banco.desconectarDoBanco();
    }
    
    public void cadastrarQuarto(int numero,String tipo,String status,double valorDiario,int ar,int wifi,int frigobar){
        banco.conectarAoBanco();
        try{
            banco.modificarTabela("INSERT INTO quarto values("+numero+",'"+tipo+"','"+status+"',"+valorDiario+",'"+ar+"','"+wifi+"','"+frigobar+"');");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro interno ao cadastrar quarto!");
        }
        finally{ 
            banco.desconectarDoBanco();
        }
    }
    
    public String[][] listarQuartos()
    {
        String resultados[][];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM quarto;");
        try{
            while(rst.next()){
                cont++;
            }
            resultados=new String[cont][7];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT * FROM quarto;");
            while(rst.next()){
                resultados[cont][0]=String.valueOf(rst.getInt("numero"));
                resultados[cont][1]=rst.getString("tipo");
                resultados[cont][2]=rst.getString("status");
                resultados[cont][3]=String.valueOf(rst.getDouble("valorDiario"));
                if(rst.getBoolean("arCondicionado")==true){
                    resultados[cont][4]="Possui";
                }
                else{
                    resultados[cont][4]="Não possui";
                }
                if(rst.getBoolean("wifi")==true){
                    resultados[cont][5]="Possui";
                }
                else{
                    resultados[cont][5]="Não possui";
                }
                if(rst.getBoolean("frigobar")==true){
                    resultados[cont][6]="Possui";
                }
                else{
                    resultados[cont][6]="Não possui";
                }
                
                cont++;
            }
            return resultados;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro interno ao listar quartos!");
        }
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public void excluirQuarto(int numero){
        banco.conectarAoBanco();
        banco.modificarTabela("DELETE FROM quarto WHERE numero="+numero+";");
        banco.desconectarDoBanco();
    }
    
    public void realizarCheckOut(int numero){
        banco.conectarAoBanco();
        banco.modificarTabela("UPDATE quarto SET status='Desocupado' WHERE numero="+numero+";");
        banco.desconectarDoBanco();
    }
    
    public String[] exibirQuarto(int numero){
        String vetor[]=new String[7];
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT * FROM quarto WHERE numero="+numero+";");
        try{
            rst.next();
            vetor[0]=(String.valueOf(rst.getInt("numero")));
            vetor[1]=(rst.getString("tipo"));
            vetor[2]=(String.valueOf(rst.getDouble("valorDiario")));
            vetor[3]=(rst.getString("status"));
            vetor[4]=(String.valueOf(rst.getBoolean("arCondicionado")));
            vetor[5]=(String.valueOf(rst.getBoolean("wifi")));
            vetor[6]=(String.valueOf(rst.getBoolean("frigobar")));
            banco.desconectarDoBanco();
            return vetor;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Quarto não cadastrado!");
        }
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
    
    public int[] exibirSelecionados(String selecionados[]){
        int num[];
        int cont=0;
        banco.conectarAoBanco();
        rst=banco.pesquisarNoBanco("SELECT numero FROM quarto WHERE tipo='"+selecionados[0]+"' AND valorDiario="+Double.parseDouble(selecionados[1])+" AND arCondicionado="+Boolean.parseBoolean(selecionados[2])
             +" AND wifi="+Boolean.parseBoolean(selecionados[3])+" AND frigobar="+Boolean.parseBoolean(selecionados[4])+";");
        try{  
            while(rst.next()){     
                cont++; 
            }
            num=new int[cont];
            cont=0;
            rst=banco.pesquisarNoBanco("SELECT numero,status FROM quarto WHERE tipo='"+selecionados[0]+"' AND valorDiario="+Double.parseDouble(selecionados[1])+" AND arCondicionado="+Boolean.parseBoolean(selecionados[2])
             +" AND wifi="+Boolean.parseBoolean(selecionados[3])+" AND frigobar="+Boolean.parseBoolean(selecionados[4])+";");         
            while(rst.next()){
                if(rst.getString("status").equals("Desocupado")){
                   num[cont]=rst.getInt("numero");
                   cont++;
                }
            }
            return num;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não existem quartos com essas descrições!");
        }  
        finally{
            banco.desconectarDoBanco();
        }
        return null;
    }
}
