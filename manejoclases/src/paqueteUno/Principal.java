/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteUno;

/**
 *
 * @author Salas
 */
public class Principal {

    public static void main(String[] args) {

        //Persona p;
        //p = new Persona();
        Persona p = new Persona();
        Persona persona2 = new Persona();
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.nombre,
                p.edad, p.genero);
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", persona2.nombre,
                persona2.edad, persona2.genero);
        System.out.println("------------------------------------");
        
        p.nombre = "Miguel";
        p.genero = "Masculino";
        p.edad = 20;
        
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", p.nombre,
                p.edad, p.genero);
    }
}
