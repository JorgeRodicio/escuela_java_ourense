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
public class FabricaCoches {
    public static Coche crear(String marca) throws Exception{
        Coche coche = new Coche();
        coche.setMarca(marca);
        return coche;
    }
}
