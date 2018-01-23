/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Persona;

/**
 *
 * @author Jenny
 */
public interface Operacionescrud {
    public boolean Registrar(Persona p);
    public boolean Actualizar(Persona p);
    public boolean Eliminar (Integer numident);
    public Persona Buscar(Integer numident);
    
}
