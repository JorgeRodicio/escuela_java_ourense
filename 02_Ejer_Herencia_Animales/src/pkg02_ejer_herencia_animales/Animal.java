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
public abstract class Animal {
    
    /**
     * Enumerado que indica el habitat del animal
     */
    protected Habitat hab;
    
    private String nombre;
    
    private int edad;
    
    /**
     * Peso que tiene precisión de gramos
     */
    private float peso;

    
    /**
     * Constructor de Animal
     * @param nombre
     * @param edad 
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.peso = 15f;
        this.hab = hab.NO_DEFINIDO;
        this.edad = edad;       
    }

    
    
    public Habitat getHab() {
        return hab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Método que muestra la alimentación de un animal
     * @param alimento 
     */
    public void alimentar(String alimento){
        System.out.println(this.nombre + " mastica y come " + alimento);
    
    }
    
    /**
     * Método estático para mostrar un animal
     * @param animal 
     */
    public static void mostrar(Animal animal){
        System.out.println(animal.toString());
    }
    
    
    public String toString(){
        return ("\nNombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nPeso: "+this.getPeso()+
                "\nHabitat: "+this.getHab());
    }
    
    /**
     * Declaración del método abstracto para desplazar un animal
     */
    public abstract void desplazar();
     
     
}


