/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Pedro
 */
public class ConsultaController {
    private Funcionario funcionario = new Funcionario(); 
    
    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /*public boolean nivelFuncionario(){
        return this.getFuncionario().verificarPermissaoGerenciamento();
    }*/
    
    public boolean login(String usuario,String senha){
        return this.getFuncionario().logar(usuario, senha);
    }
}
