/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18practica1;

/**
 *
 * @author Estudio
 */
public class Animal {

    private String nombre;
    private int peso;

    public Animal(String n) {
        this.nombre = n;     //ver qué quiso hacer

    }

    public Animal() {

    }

    public void mover() {
        System.out.println("soy animal y estoy en movimiento");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

}
