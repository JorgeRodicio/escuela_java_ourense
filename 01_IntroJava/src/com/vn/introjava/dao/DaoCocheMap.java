/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.FabricaCoches;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;


/**
 *
 * @author pc
 */
public class DaoCocheMap implements IDaoCoche{
    
    private Map<Integer,Coche> mapCoches;
    private Map<String,Coche> mapCochesString;
    private int index;
     
    public DaoCocheMap(){
        mapCoches = new HashMap<>();
        mapCochesString = new HashMap<>();
        index = 0;
    }
    
    @Override
    public void crear(String marca) throws Exception{       
        Coche coche = FabricaCoches.crear(marca);
        crear(coche);    
    }
    
    @Override
    public void crear(Coche coche) {
        mapCoches.put(index, coche);
        mapCochesString.put(coche.getMarca(), coche);
        index++;
    }

    @Override
    public Coche obtenerPorIndice(int index) {
        return mapCoches.get(index);
    }

    @Override
    public Coche obtenerPorMarca(String marca) {
       return mapCochesString.get(marca);  
    }

    @Override
    public void modificar(int index, Coche coche) throws Exception {
        mapCoches.replace(index, coche);
        mapCochesString.replace(obtenerPorIndice(index).getMarca(), coche);
    }

    

    
    
   
     
}
