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
public class Perro extends Animal {
    
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
        this.hab = hab.TERRESTRE;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void ladrar(){
        System.out.println(this.getNombre()+" dice 'Guau, guau, guau");
    }

    @Override
    public void desplazar() {
        System.out.println(this.getNombre()+" corre contento");
    }
    
    @Override
    public String toString(){
        return ("PERRO\nNombre: "+this.getNombre()+
                "\nEdad: "+this.getEdad()+
                "\nPeso: "+this.getPeso()+
                "\nRaza: "+this.getRaza()+
                "\nHabitat: "+this.getHab());
    }
    
}
