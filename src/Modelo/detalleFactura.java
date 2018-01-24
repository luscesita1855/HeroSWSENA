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
public class detalleFactura {
    private Integer iddetallefactura;
    private Integer idproducto;
    private Integer idfactura;
    private Integer cant;
    private Decimal precioUnitario;
    private Decimal subtotal;

    public detalleFactura(Integer iddetallefactura, Integer idproducto, Integer idfactura, Integer cant, Decimal precioUnitario, Decimal subtotal) {
        this.iddetallefactura = iddetallefactura;
        this.idproducto = idproducto;
        this.idfactura = idfactura;
        this.cant = cant;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public Integer getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public Decimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Decimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Decimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Decimal subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "detalleFactura{" + "iddetallefactura=" + iddetallefactura + ", idproducto=" + idproducto + ", idfactura=" + idfactura + ", cant=" + cant + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + '}';
    }
    
}
