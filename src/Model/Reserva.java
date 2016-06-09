/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sandra
 */
public class Reserva implements Relatorio{
    
    String status;
    int codigo;
    String data;
    String hora;
    int numQuarto;
    
    @Override
    public void gerarRelatorio(int tipo){
    }
    
}
