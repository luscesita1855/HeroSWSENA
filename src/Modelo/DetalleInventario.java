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
public class DetalleInventario {
 private Integer codigodetalleInventario;
 private Integer codigoInventario;
 private Integer codigoFactura;
 private Timestamp fechaMovimiento; 
 private String descripcionMovi;
 private Integer cantidadUnitaria;
 private Double costoUnitario;
 private Double costoTotal;
 private Character tipoMovimiento;

    public DetalleInventario(Integer codigodetalleInventario, Integer codigoInventario, Integer codigoFactura, Timestamp fechaMovimiento, String descripcionMovi, Integer cantidadUnitaria, Double costoUnitario, Double costoTotal, Character tipoMovimiento) {
        this.codigodetalleInventario = codigodetalleInventario;
        this.codigoInventario = codigoInventario;
        this.codigoFactura = codigoFactura;
        this.fechaMovimiento = fechaMovimiento;
        this.descripcionMovi = descripcionMovi;
        this.cantidadUnitaria = cantidadUnitaria;
        this.costoUnitario = costoUnitario;
        this.costoTotal = costoTotal;
        this.tipoMovimiento = tipoMovimiento;
    }

    public Integer getCodigodetalleInventario() {
        return codigodetalleInventario;
    }

    public void setCodigodetalleInventario(Integer codigodetalleInventario) {
        this.codigodetalleInventario = codigodetalleInventario;
    }

    public Integer getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(Integer codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Timestamp getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Timestamp fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getDescripcionMovi() {
        return descripcionMovi;
    }

    public void setDescripcionMovi(String descripcionMovi) {
        this.descripcionMovi = descripcionMovi;
    }

    public Integer getCantidadUnitaria() {
        return cantidadUnitaria;
    }

    public void setCantidadUnitaria(Integer cantidadUnitaria) {
        this.cantidadUnitaria = cantidadUnitaria;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Character getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Character tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public String toString() {
        return "DetalleInventario{" + "codigodetalleInventario=" + codigodetalleInventario + ", codigoInventario=" + codigoInventario + ", codigoFactura=" + codigoFactura + ", fechaMovimiento=" + fechaMovimiento + ", descripcionMovi=" + descripcionMovi + ", cantidadUnitaria=" + cantidadUnitaria + ", costoUnitario=" + costoUnitario + ", costoTotal=" + costoTotal + ", tipoMovimiento=" + tipoMovimiento + '}';
    }
    
}
