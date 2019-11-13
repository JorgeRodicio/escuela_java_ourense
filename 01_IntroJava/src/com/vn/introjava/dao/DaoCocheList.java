/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.FabricaCoches;
import com.vn.introjava.poo.vehiculos.TipoVehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DaoCocheList implements IDaoCoche{
    
    private List<Coche> listaCoches;
    
    public DaoCocheList(){
        listaCoches = new ArrayList<>();
    }
    
    @Override
    public Coche crear(Coche coche) {
        listaCoches.add(coche);
        return coche;
    }
     
    @Override
    public Coche crear(String marca) throws Exception{
        Coche c = FabricaCoches.crear(marca);
        listaCoches.add(c);
        return c;
    }  
    
    @Override
    public Coche obtenerPorIndice(int index){
        if(index < this.listaCoches.size())
            return listaCoches.get(index);
        else
            return null;     
    }
    
    @Override
    public Coche obtenerPorMarca(String marca){
        for (Coche coche : listaCoches) {
            if(coche.getMarca().equals(marca)){
                return coche;
            }
        }
        return null;
    }

    @Override
    public Coche modificar(int index, Coche coche) throws Exception{
        Coche c = this.listaCoches.get(index);
        c.setMarca(coche.getMarca());
        c.setTipo(coche.getTipo());
        c.arrancar(coche.isArrancado() ? 4 : 1);
        
        return c;
    }

    @Override
    public void eliminar(int index) {
        this.listaCoches.remove(index);
    }

    @Override
    public void eliminar(Coche objeto) {
        this.listaCoches.remove(objeto);
    }

    

    
    
}
