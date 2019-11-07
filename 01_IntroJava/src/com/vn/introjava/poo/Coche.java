/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/**
 *
 * @author pc
 */
public class Coche {
    private String marca;
    private int numRuedas;
    private boolean arrancado;
    
    public Coche(){
        this.marca = "SIN MARCA";
        numRuedas = 4;
    }
      
    public Coche(String marca){
        this.marca = marca;
        numRuedas = 4;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca) throws Exception{
        if(marca != null && !"".equals(marca)){
            this.marca = marca;
        }else{
            throw new IllegalArgumentException("Debes asignar una marca");
        }
        
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isArrancado() {
        return arrancado;
    }
    
    public void arrancar(){
        System.out.println(this.marca + " ha arrancado");
        arrancado = true;
    }
    
    public boolean arrancar(int posicionLlave){ //4 posiciones de llave. La 4 arranca
       
        arrancado = posicionLlave == 4 /*? true : false*/;
        System.out.println(this.marca +(arrancado ? " ha arrancado"
                                                   : " fallo arrancar"));
        return arrancado;
    }
    
    public boolean arrancar(String orden){
        arrancado = "arrancar".equals(orden);
        return arrancado;
    }
    
    public void mostrarEstado(){  
        System.out.println("Coche " + getMarca() +(arrancado ? " ha arrancado"
                                                   : " fallo arrancar"));
    }
}
