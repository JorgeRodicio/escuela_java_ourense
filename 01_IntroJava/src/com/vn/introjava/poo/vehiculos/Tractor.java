/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.vehiculos;

/**
 *
 * @author pc
 */
public class Tractor extends Vehiculo{

    public Tractor() {
         this.tipo = TipoVehiculo.TRACTOR;
    }
    
    @Override
    public void avanzar() {
        System.out.println("Ruedo y siego");
    }

    @Override
    public String toString() {
        StringBuilder toRet = new StringBuilder();
        toRet.append("Tipo: "+this.getTipo());
        
        
        return toRet.toString();
    }
    
    
    @Override
    public void mover(float metros) {    
        avanzar();
        System.out.println(metros + " metros");
    }
    
}
