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
public class Quarto {
    private int numero;
    private String tipo;
    private String status;
    private double valorDiario;
    private boolean wifi,ar,frigobar;

    /**
     * @return the wifi
     */
    public boolean getWifi() {
        return wifi;
    }

    /**
     * @param wifi the wifi to set
     */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /**
     * @return the ar
     */
    public boolean getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(boolean ar) {
        this.ar = ar;
    }

    /**
     * @return the frigobar
     */
    public boolean getFrigobar() {
        return frigobar;
    }

    /**
     * @param frigobar the frigobar to set
     */
    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the valorDiario
     */
    public double getValorDiario() {
        return valorDiario;
    }

    /**
     * @param valorDiario the valorDiario to set
     */
    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }
    
}
