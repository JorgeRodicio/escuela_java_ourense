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
public class Monopatin implements Desplazable{
    
    @Override
    public void mover(float metros) {
        if(metros > 10)
            rodar(metros);
        else
            andar(metros);
    }
    
    public void rodar(float metros){
        System.out.println("Monopatin rueda " + metros + " metros");
    }
    
     public void andar(float metros){
        System.out.println("Monopatin anda " + metros + " metros");
    }
    
    
}
