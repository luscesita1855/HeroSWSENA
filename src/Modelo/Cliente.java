/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jenny
 */
public class Cliente {
    private Integer codigoCliente;
    private Integer numeroIdentidad;

    public Cliente(Integer codigoCliente, Integer numeroIdentidad) {
        this.codigoCliente = codigoCliente;
        this.numeroIdentidad = numeroIdentidad;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(Integer numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", numeroIdentidad=" + numeroIdentidad + '}';
    }
    
}
