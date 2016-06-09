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
public class Funcionario extends Pessoa implements Login,Relatorio{
    private int codFuncionario;
    private String id;
    private String senha;
    private String categoria;

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void gerarRelatorio(int tipo){ 
    }
    
    @Override
    public boolean logar(String id,String senha){
        return true;
    }
    
    public void exibirRelatorios(String tipoRelatorio){       
    }
    
    public Funcionario cadastrarFunc(String nome,String cpf,String rua,String bairro,int numero,String cidade,String estado,String dataNascimento,String telefone,
            int codFuncionario,String id,String senha,String categoria){
        return null;
    }
    
    /*public Quarto consultarQuarto(int numQuarto){
        return Quarto;
    }*/
    
    /*public Quarto cadastrarQuarto(int numero,int numPessoas,String tipo,String status,double valorDiario){
        return Quarto;
    }
    */
    
    /*public Reserva reservarQuarto(int numero,int numQuarto){
        return Reserva;
    }*/
    
    /*public Cliente cadastrarCliente(String nome,String cpf,String rua,String bairro,int numero,String cidade,String estado,String dataNascimento,
            String telefone){
        return Cliente;
    }*/
}
