/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import org.junit.Test;

/**
 *
 * @author pc
 */
public class ProbarClaseInterfazGenericaAnidada {
    
    static class ClasePequePos<T>{
        T x, y;
        
        public ClasePequePos(T x, T y){
            this.x = x;
            this.y = y;
        }
        
        @Override
        public String toString(){
            return("x = " + x + " y = " + y);
        }
    }
    
    @Test
    public void probarClaseAnidada(){
        ClasePequePos punto = new ClasePequePos(3f, 5f);
        System.out.println("Punto 2D: " + punto.toString());
        ClasePequePos<String> str = new ClasePequePos("cinco", "seis");
        System.out.println("Punto 2D: " + str.toString());
    }
}
