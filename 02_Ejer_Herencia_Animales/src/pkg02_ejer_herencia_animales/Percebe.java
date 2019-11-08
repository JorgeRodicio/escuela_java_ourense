/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales;

/**
 *
 * @author pc
 */

public class Percebe extends Animal{

    

    public Percebe(String nombre, int edad) {
        super(nombre, edad);
        this.hab = hab.ACUATICO;

    }
   
    
    public void alimentar (String alimento){
        System.out.println(this.getNombre() + " se nutre de " + alimento);
    
    }
    
    @Override
    public void desplazar() {
        System.out.println("No se mueve, se adhiere a una roca");
    }
    
    @Override
    public String toString(){
        return ("PERCEBE\nNombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nPeso: "+this.getPeso()+
                "\nHabitat: "+this.getHab());
    }
    
}
