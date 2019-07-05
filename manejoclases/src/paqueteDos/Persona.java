/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

/**
 *
 * @author dljimenez2
 */
public class Persona {
    private String genero;
    private int edad;
    private String nombre;
    
    public void establecerGenero(String g){ //set
        genero = g;
    }
    
    public String obtenerGenero(){ //get
    return genero;
    }
    
    public void establecerEdad(int e){ //set
        edad = e;
    }
    
    public int obtenerEdad(){ //get
    return edad;
    }
    
    public void establecerNombre(String n){ //set
        nombre = n;
    }
    
    public String obtenerNombre(){ //get
    return nombre;
    }
}
