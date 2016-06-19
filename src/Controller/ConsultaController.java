/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Pedro
 */
public class ConsultaController {
    Funcionario funcionario=new Funcionario();
    
    /*public boolean nivelFuncionario(){
        return this.getFuncionario().verificarPermissaoGerenciamento();
    }*/
    
    public boolean login(String usuario,String senha){
        return funcionario.logar(usuario, senha);
    }
    
    public boolean consultarNivel(){
        return funcionario.verificarNivel();
    }
    
    public String[] consultarQuarto(int numero){
        return funcionario.exibirQuarto(numero);
    }
    
    public int[] consultarSelecionados(String selecionados[]){
        return funcionario.exibirSelecionados(selecionados);
    }
    
    public void limparUsuarioAtual(){
        funcionario.limparUsuarioAtual();
    }
}
