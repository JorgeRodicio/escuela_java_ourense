/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.vehiculos.sistdesplaz;

import com.vn.introjava.poo.interfaces.Desplazable;

/**
 *
 * @author pc
 */
public class Avion implements Desplazable{

    @Override
    public void mover(float metros) {
        if(metros > 10)
            volar(metros);
        else
            rodar(metros);
    }
    
    public void volar(float metros) {
        System.out.println("Avion vuela vuela " + metros + " metros");
    }
    
     public void rodar(float metros) {
        System.out.println("Avion rueda para despegar " + metros + " metros");
    }
    
}
