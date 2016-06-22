/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Funcionario;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import com.mysql.jdbc.Connection;
/**
 *
 * @author Pedro
 */
public class RelatorioController {
    Funcionario relatorio=new Funcionario();
    
    public JasperPrint relatorio(int tipo)throws SQLException,JRException{
        return relatorio.gerarRelatorio(tipo);
    }
}
