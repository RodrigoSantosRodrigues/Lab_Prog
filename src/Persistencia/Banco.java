/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author Pedro
 */
public class Banco {
    private Connection connection;
    private Statement stmt;
    private ResultSet rst;
    private String query;
    
    public Banco(){
        this.setConnection(null);
        this.setStmt(null);
    }
    
    public boolean loginNoBanco(String usuario,String senha){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.setConnection((Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel",usuario,senha));
            return true;
        }
        catch(Exception e){
            System.err.println(e);
        }
        return false;
    }
    
    public boolean conectarAoBanco(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.setConnection((Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","Pedro","123"));
            return true;
        }
        catch(Exception e){
            System.err.println(e);
        }
        return false;
    }
    
    public boolean desconectarDoBanco(){
        try{
            this.getConnection().close();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean modificarTabela(String queryInsercao){
        try{
            this.setStmt(this.getConnection().createStatement());
            this.setQuery(queryInsercao);
            stmt.executeUpdate(query);
            return true;
        }
        catch(Exception e){
            System.err.println(e);
            return false;
        }
    }
    public void criarTabelaNoBanco(String queryCriar){
        try{
            this.setStmt(this.getConnection().createStatement());
            stmt.execute(queryCriar);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void criarUsuarioNoBanco(String queryCriar){
        try{
            this.setStmt(this.getConnection().createStatement());
            stmt.execute(queryCriar);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

    public ResultSet pesquisarNoBanco(String queryPesquisa){
        try{
            this.setStmt(this.getConnection().createStatement());
            this.setRst(this.getStmt().executeQuery(queryPesquisa));
            return this.getRst();
        }
        catch(Exception e){
            return null;
        }
    }
    
    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the stmt
     */
    public Statement getStmt() {
        return stmt;
    }

    /**
     * @param stmt the stmt to set
     */
    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    /**
     * @return the rst
     */
    public ResultSet getRst() {
        return rst;
    }

    /**
     * @param rst the rst to set
     */
    public void setRst(ResultSet rst) {
        this.rst = rst;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
    }
}
