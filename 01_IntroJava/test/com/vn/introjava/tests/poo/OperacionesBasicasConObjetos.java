/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.FabricaCoches;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class OperacionesBasicasConObjetos {
    
    @Test
    public void creandoObjetos(){
        Coche miCoche = null;
        miCoche = new Coche("Kia");
        System.out.println("Texto de coche: " + miCoche.toString());
        
        Coche miCoche2 = null;
        miCoche2 = new Coche();
        System.out.println("Texto de coche: " + miCoche2.toString());
        
        assertNotNull(miCoche);
        assertNotNull(miCoche2);
        assertNotEquals(miCoche, miCoche2);
        
        try {
            miCoche.setMarca("Kia");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasConObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miCoche2.setMarca("Hummer");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasConObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche marca: " + miCoche.getMarca());
        System.out.println("miCoche2 marca: " + miCoche2.getMarca());
         assertEquals(miCoche.getMarca(), "Kia");
        
        miCoche2 = miCoche;
        assertEquals(miCoche, miCoche2);
        try {
            miCoche.setMarca("Hummer limusina");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasConObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche marca: " + miCoche.getMarca());
        System.out.println("miCoche2 marca: " + miCoche2.getMarca());
        
        //Intro polimorfismo
        Object refAmiCoche = miCoche;
        //No podemos porque no tiene la forma de coche
        //System.out.println("miCoche2 marca: " + refAmiCoche.getMarca());
        assertTrue(refAmiCoche.equals(miCoche));        
         
        //Coche coche3 = (Coche) new Object();
        
         
        //Le decimos al recolector de basura que queremos borras todos los objetos
        miCoche = null;
        miCoche2 = null;
         
    }
    
    @Test
    public void testSobrecarga(){
        Coche miCoche = new Coche();
        
        for(int i = 1; i <= 4; i++){  
            if(i != 4){
                assertFalse(miCoche.arrancar(i));
            }else{
                assertTrue(miCoche.arrancar(i));
            }
        }
        
        try {
            miCoche.setMarca(null);
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasConObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void gestionExcepciones() throws Exception{
        Coche miCoche = FabricaCoches.crear("");      
    }
    
    
    @Test 
    public void gestionExcepciones_2() {
        try {      
            Coche miCoche = FabricaCoches.crear("");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasConObjetos.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }
    
    
    @Test 
    public void testConstructoresSobrecargados() {
        Coche coche = new Coche("Ferrari");
        assertEquals(coche.getMarca(), "Ferrari");
    }
    
    
       
    
    
    
}
