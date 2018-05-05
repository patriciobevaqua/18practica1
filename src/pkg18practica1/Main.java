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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ver variables enumeración en java, para ellas puedo usar luego un switch
        //enum TipoEnum{peligro,NoPeligro};
        //TipoEnum tipo=

        //                    explicación de porqué es estatic o qué hace el static
        //                    java.main.java;
        //                    main.class; //cuando compila devuelve el .class
        //                            java.main("");
        //                            System.out.println("");
        // public, -> 
        // private, ->
        // protected  ->
        Persona pepe = new Persona("Carlos");  //constructor que creamos igual al por defecto
        pepe.saludar();
        pepe.mover();

    }

    public static int sumar() {   //lo estático static permite usarse sin instanciar, es decir usar la función sin instanciar, sino fuera estático debo instanciar un objeto para llegar a la función

        return 0;
    }

}
