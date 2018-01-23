/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Jenny
 */
public class GestionPersona implements Operacionescrud {

    ArrayList<Persona> registroPersonas;

    public GestionPersona() {
        registroPersonas = new ArrayList<>();
        registroPersonas.add(new Persona(1,"CC","Jenny","Asecas","Rodriguez","Rojas"));
    }

    
    
    @Override
    public boolean Registrar(Persona p) {
        return registroPersonas.add(p);

    }

    @Override
    public boolean Actualizar(Persona p) {
        for (int i = 0; i < registroPersonas.size(); i++) {
            if (registroPersonas.get(i).getNumident() == (p.getNumident())) {

            }
            registroPersonas.set(i, p);
            return true;
        }
        return false;
    }

    @Override
    public boolean Eliminar(Integer numident) {
        for (int i = 0; i < registroPersonas.size(); i++) {
            if (registroPersonas.remove(i) != null);
            return true;
        }
        return false;
    }

    @Override
    public Persona Buscar(Integer numident) {
        for (int i = 0; i < registroPersonas.size(); i++) {
            if(numident == registroPersonas.get(i).getNumident()){
                return registroPersonas.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Persona>mostrar(){
        return registroPersonas;
        
        
    }
}
