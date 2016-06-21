/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Funcionario;
/**
 *
 * @author Sandra
 */
public class GerenciamentoController {
    Funcionario gerenciamento=new Funcionario();
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
}
