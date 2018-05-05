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
public class Persona extends Animal {

    private boolean genero;

    // ejemplos de métodos públicos y privados
    public Persona(String nombre) {  //constructor  y sobecarga de constructor porque hay mas de un constructor
        this.setNombre(nombre);

    }

    public Persona() {  //constructor

    }

    public Persona(String n, boolean g) {
        super(n);
        this.genero = g;

    }   //ver qué quiso hacer

    public void saludar() {
        System.out.println("Hola" + this.saludoBin());
    }

    private String saludoBin() {   //sólo lo ve la clase
        return "0101";
    }

    protected String saludo1() {  //es accesible en todas las clases y paquetes que esté esa clase
        return "saludo1";
    }

    /**
     * @Override sobreescribimos el método animal
     */
    public void mover() {
        super.mover();
        System.out.println("soy hombre y me muevo en dos pies");
    }

}
