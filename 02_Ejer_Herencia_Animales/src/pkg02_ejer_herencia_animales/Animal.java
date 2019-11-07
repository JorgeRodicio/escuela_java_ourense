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
    
    protected Habitat hab;
    
private String nombre;
private int edad;
private float peso;

    public Animal() {
    }

   
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 15f;
        this.hab = hab.NO_DEFINIDO;
    }

    
    
    public Habitat getHab() {
        return hab;
    }

    public void setHab(Habitat hab) {
        if (hab!=hab.ACUATICO) {
              this.hab = hab;
        }
      
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

    
   

    public void alimentar(String alimento){
        System.out.println(this.nombre + "mastica y come " + alimento);
    
    }
    
   public static void mostrar(Animal animal){
       System.out.println(animal.toString());
   }


 
    
    public String toString(){
        return ("Nombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nPeso: "+this.getPeso());
    }
    
    public abstract void desplazar();
     
     
}


