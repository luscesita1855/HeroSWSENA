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
public class Proveedor {
  private Integer idProveedor;
  private Integer numidentifi;
  private String razonsocial;
  private Integer nit;

    public Proveedor(Integer idProveedor, Integer numidentifi, String razonsocial, Integer nit) {
        this.idProveedor = idProveedor;
        this.numidentifi = numidentifi;
        this.razonsocial = razonsocial;
        this.nit = nit;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getNumidentifi() {
        return numidentifi;
    }

    public void setNumidentifi(Integer numidentifi) {
        this.numidentifi = numidentifi;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", numidentifi=" + numidentifi + ", razonsocial=" + razonsocial + ", nit=" + nit + '}';
    }
  
    
}
