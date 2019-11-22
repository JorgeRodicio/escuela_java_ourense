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
    public Coche crear(String marca) throws Exception{       
        return crear(FabricaCoches.crear(marca));
    }
    
    @Override
    public Coche crear(Coche coche) {
        mapCoches.put(index, coche);
        mapCochesString.put(coche.getMarca(), coche);
        index++;
        return coche;
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
    public Coche modificar(int index, Coche coche) throws Exception {
       Coche c = obtenerPorIndice(index);
        mapCochesString.remove(c.getMarca());
        mapCochesString.put(coche.getMarca(), c);
            
        //Coche cStr = this.mapCochesString.get(c.getMarca());
        c.setMarca(coche.getMarca());
        c.setTipo(coche.getTipo());
        c.arrancar(coche.isArrancado() ? 4 : 1);
       
        //cStr = c;
        
        return c;
    }

    @Override
    public void eliminar(int index) {
        Coche c = this.mapCoches.get(index);
        mapCoches.remove(index);
        mapCochesString.remove(c.getMarca());
    }

    @Override
    public void eliminar(Coche coche) {
        String marca = coche.getMarca();
        mapCochesString.remove(marca);
        
        int keyIndex = -1;
        if (mapCoches.containsValue(coche)) {
            for (Map.Entry<Integer,Coche> parIndexYCoche : mapCoches.entrySet()) {
                if (parIndexYCoche.getValue().getMarca().equals(coche.getMarca())) {
                    keyIndex = parIndexYCoche.getKey();
                }
            }
        }
        mapCoches.remove(keyIndex);
        
    }

    

    
    
   
     
}
