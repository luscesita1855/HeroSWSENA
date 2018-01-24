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
public class Inventario {
   private Integer codigoInventario;
   private Integer codigoProducto;
   private Integer codigoProveedor;
   private Integer max;
   private Integer min;

    public Inventario(Integer codigoInventario, Integer codigoProducto, Integer codigoProveedor, Integer max, Integer min) {
        this.codigoInventario = codigoInventario;
        this.codigoProducto = codigoProducto;
        this.codigoProveedor = codigoProveedor;
        this.max = max;
        this.min = min;
    }

    public Integer getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(Integer codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Integer codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Inventario{" + "codigoInventario=" + codigoInventario + ", codigoProducto=" + codigoProducto + ", codigoProveedor=" + codigoProveedor + ", max=" + max + ", min=" + min + '}';
    }
    
}
