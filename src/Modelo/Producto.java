/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Jenny
 */
public class Producto {
    private Integer idproducto;
    private String tipoprod;
    private date fechaelabo;
    private String descripcion;
    private Double precio;

    public Producto(Integer idproducto, String tipoprod, date fechaelabo, String descripcion, Double precio) {
        this.idproducto = idproducto;
        this.tipoprod = tipoprod;
        this.fechaelabo = fechaelabo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getTipoprod() {
        return tipoprod;
    }

    public void setTipoprod(String tipoprod) {
        this.tipoprod = tipoprod;
    }

    public date getFechaelabo() {
        return fechaelabo;
    }

    public void setFechaelabo(date fechaelabo) {
        this.fechaelabo = fechaelabo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", tipoprod=" + tipoprod + ", fechaelabo=" + fechaelabo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}
