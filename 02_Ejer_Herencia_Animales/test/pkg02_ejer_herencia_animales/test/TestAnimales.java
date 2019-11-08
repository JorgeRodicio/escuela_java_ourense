/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg02_ejer_herencia_animales.Animal;
import static pkg02_ejer_herencia_animales.Animal.mostrar;
import pkg02_ejer_herencia_animales.Habitat;
import pkg02_ejer_herencia_animales.Percebe;
import pkg02_ejer_herencia_animales.Perro;

/**
 *
 * @author pc
 */
public class testAnimales {
    static Animal animales[];
    
   
    public testAnimales() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        animales = new Animal[3];
        animales [0] = new Perro("Rex", 20, "pastor alemán");
        animales [1] = new Percebe("Jimmy", 20000);
        animales [2] = new Perro("Hachiko", 40, "raza gitana");
           
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAnimales(){
        for (int i = 0; i < animales.length; i++) {
            mostrar(animales[i]);
            animales[i].alimentar("comida rica");
            animales[i].desplazar();
            System.out.println("");
        }
        System.out.println("***********************************************");
        
        for (int i = 0; i < animales.length; i++) {
            animales[i].setEdad(20);
            animales[i].setNombre("Peter La Anguila");
            animales[i].setPeso(-10);
        }
        
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]+"\n");
            
        }
    }
}
