/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Funcionario;
/**
 *
 * @author Pedro
 */
public class ReservaController {
    Funcionario reserva=new Funcionario();
    
    public void cadastrarClienteResp(String nome,String cpfrg,String rua,String bairro,int numero,String cidade,String estado,String dataNasc,String telefone,int numQuarto){
        reserva.cadastrarClienteResp(nome, cpfrg, rua, bairro, numero, cidade, estado, dataNasc, telefone,numQuarto);
    }
    
    public void cadastrarClienteNormal(String nome,String cpfrg,int numQuarto){
        reserva.cadastrarClienteNormal(nome, cpfrg,numQuarto);
    }
    
    public void reservarQuarto(int numero){
        reserva.reservarQuarto(numero);
    }
    
    public void registrarReserva(String nomeCliente,int numQuarto,String status,double valorTotal){
        reserva.registrarReserva(nomeCliente,numQuarto, status, valorTotal);
    }
    
    public void mudarStatusReserva(int num){
        reserva.mudarStatusReserva(num);
    }
    
    public void excluirReserva(int codReserva){
        reserva.excluirReserva(codReserva);
    }
}
