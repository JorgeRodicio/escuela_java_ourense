/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.CocheRally;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarColecciones {
    
    public ProbarColecciones() {
    }

    
    
    /*@Test
    public void testArrayListNoGenerica() {
        ArrayList lista = new ArrayList();
        //Con el ArrayLidt podemos mezclar 
        lista.add(new Object());
        lista.add(new Coche());
        lista.add("Texto");
        lista.add(1);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.get(i).toString());            
        }
    }*/
    
    
    @Test
    public void testArrayListGenerica() {
        ArrayList<CocheRally> lista = new ArrayList<CocheRally>();
        //Con el ArrayLidt podemos mezclar 
        lista.add(new CocheRally("Subaru"));
        lista.add(new CocheRally("Toyota"));
        lista.add(new CocheRally("Hummer")); 
        
        for (int i = 0; i < lista.size(); i++) {
           lista.get(i).mostrarEstado();            
        }
        
        for (CocheRally cocheRally : lista) {
            cocheRally.avanzar();
        }
    }
    
    
}
