/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author Jenny
 */
public class Factura {
    private Integer numeroFactura;
    private Integer numeroidentiCliente;
    private Timestamp fechaFactura;
    private final Character formaPago;

    public Factura(Integer numeroFactura, Integer numeroidentiCliente, Timestamp fechaFactura, Character formaPago) {
        this.numeroFactura = numeroFactura;
        this.numeroidentiCliente = numeroidentiCliente;
        this.fechaFactura = fechaFactura;
        this.formaPago = formaPago;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getNumeroidentiCliente() {
        return numeroidentiCliente;
    }

    public void setNumeroidentiCliente(Integer numeroidentiCliente) {
        this.numeroidentiCliente = numeroidentiCliente;
    }

    public Timestamp getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Timestamp fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", numeroidentiCliente=" + numeroidentiCliente + ", fechaFactura=" + fechaFactura + ", formaPago=" + formaPago + '}';
    }
    
    
    
    
}
