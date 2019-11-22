/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.vehiculos;

import com.vn.introjava.poo.interfaces.Desplazable;

/**Clase abstracta no puede ser instanciada
 *
 * @author pc
 */
public abstract class Vehiculo implements Desplazable{
    
    protected TipoVehiculo tipo;

    /*
    public Vehiculo() {
    }*/

    
    
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
