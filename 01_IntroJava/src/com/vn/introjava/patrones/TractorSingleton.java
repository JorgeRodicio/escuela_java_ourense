/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.vehiculos.TipoVehiculo;
import com.vn.introjava.poo.vehiculos.Tractor;
import com.vn.introjava.poo.vehiculos.Vehiculo;
import java.util.Random;

/**
 *
 * @author pc
 */
public class TractorSingleton extends Tractor {
    private static TractorSingleton instancia;
    
    
    private TractorSingleton (){
        super();
    }      
    
    public static TractorSingleton getInstancia(){
        if (TractorSingleton.instancia == null){          
           TractorSingleton.instancia =  new TractorSingleton();
           TractorSingleton.instancia.setTipo(TipoVehiculo.TRACTOR);
           TractorSingleton.instancia.setNumero(new Random().nextInt());
           
        }
        return TractorSingleton.instancia;
    }
}
