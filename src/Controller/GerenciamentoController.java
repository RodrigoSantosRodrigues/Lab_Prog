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
}
