/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.vehiculos.sistdesplaz;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;

/**
 *
 * @author pc
 */
public class BicicletaElectrica implements Desplazable, Electrico{

    @Override
    public void mover(float metros) {
        System.out.println("Bicicleta eléctrica se mueve " + metros + " metros");
    }

    @Override
    public void cargarBateria(double voltios) {
        System.out.println("Bicicleta eléctrica se carga con " + voltios + " voltios");
    }
    
}
