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
    
    private String nombre;
    private int edad;
    private float peso;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 15f;
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
    
    public String toString(){
        return ("Nombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nPeso: "+this.getPeso());
    }
    
    public abstract void desplazar();
     
     
}
