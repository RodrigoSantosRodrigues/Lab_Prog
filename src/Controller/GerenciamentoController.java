/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
/**
 *
 * @author Pedro
 */
public class GerenciamentoController {
    Funcionario gerenciamento=new Funcionario();
    Reserva reserva=new Reserva();
    public void cadastrarQuarto(int numero,String tipo,String status,double valorDiario,int ar,int wifi,int frigobar){
        gerenciamento.cadastrarQuarto(numero,tipo,status,valorDiario,ar,wifi,frigobar);
    }
    
    public void excluirQuarto(int numero){
        gerenciamento.excluirQuarto(numero);
    }
    
    public void realizarCheckOut(int numero){
        gerenciamento.realizarCheckOut(numero);
    }
    
    public void cadastrarFuncionario(String nome,String cpf,String rua,String bairro,int numero,String cidade, String estado,
            String dataNascimento,String telefone,String usuario,String senha,String categoria){
        gerenciamento.cadastrarFuncionario(nome, cpf, rua, bairro, numero, cidade, estado, dataNascimento, telefone, usuario, senha, categoria);
    }
    
    public void excluirFuncionario(int codFuncionario){
        gerenciamento.excluirFuncionario(codFuncionario);
    }
    
    public void excluirCliente(int codCliente){
        gerenciamento.excluirCliente(codCliente);
    }
    
    public void verificarPrazoReserva(){
        reserva.verificarPrazoReserva();
    }
    
    public void alterarQuarto(int numQuarto,String tipo,double valorDiario,boolean arCondicionado,boolean wifi,boolean frigobar){
        gerenciamento.alterarQuarto(numQuarto, tipo, valorDiario, arCondicionado, wifi, frigobar);
    }
     
    
    public void alterarFuncionario(int codFuncionario,String nome,String cpf,String rua,int numero,String bairro,String cidade,String estado,
        String dataNascimento,String telefone,String categoria,String usuario,String senha,String usuarioAntigo){
        gerenciamento.alterarFuncionario(codFuncionario, nome, cpf, rua, numero, bairro, cidade, estado, dataNascimento, telefone, categoria, usuario, senha,usuarioAntigo);
    }
    
    public void alterarCliente(int codCliente,String nome,String cpf,String rua,int numero,String bairro,String cidade,String estado,
        String dataNascimento,String telefone){
        gerenciamento.alterarCliente(codCliente, nome, cpf, rua, numero, bairro, cidade, estado, dataNascimento, telefone);
    }
}
