/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Sandra
 */
public interface Relatorio {
    /**Gera relatorios de todos tipos
     *@param tipo declara o tipo de relatorio a ser criado
     */
    public JasperPrint gerarRelatorio(int tipo)throws SQLException,JRException;
}
