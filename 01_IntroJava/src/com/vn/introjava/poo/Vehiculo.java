/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/**Clase abstracta no puede ser instanciada
 *
 * @author pc
 */
public abstract class Vehiculo {
    
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }
    /**
     * Método declarado e implementado
     * @param tipo 
     */
    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    public abstract void avanzar();

    public void mostrarEstado() {
        System.out.println(this.toString());
    }
    
    
}
