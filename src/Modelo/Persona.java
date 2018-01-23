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
public class Persona {
 private int numident;
 private String tipoIdent;
 private String nombre1;
 private String nombre2;
 private String ape1;
 private String ape2;

    public Persona(int numident, String tipoIdent, String nombre1, String nombre2, String ape1, String ape2) {
        this.numident = numident;
        
        this.tipoIdent = tipoIdent;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ape1 = ape1;
        this.ape2 = ape2;
        
    }

    public int getNumident() {
        return numident;
    }

    public void setNumident(int numident) {
        this.numident = numident;
    }

    public String getTipoIdent() {
        return tipoIdent;
    }

    public void setTipoIdent(String tipoIdent) {
        this.tipoIdent = tipoIdent;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Override
    public String toString() {
        return "Persona{" + "numident=" + numident + ", tipoIdent=" + tipoIdent + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", ape1=" + ape1 + ", ape2=" + ape2 + '}';
    }
 
}
