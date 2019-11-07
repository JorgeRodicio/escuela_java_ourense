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
public class Coche extends Vehiculo{
    private String marca;
    private int numRuedas;
    protected boolean arrancado;
    
    public Coche(){
        this.marca = "SIN MARCA";
        numRuedas = 4;
        this.arrancado = false;
        this.tipo = TipoVehiculo.TURISMO;
        
    }

    public Coche(String marca) {
        this.marca = marca;
        this.arrancado = false;
        this.tipo = TipoVehiculo.TURISMO;
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
        System.out.println(this.marca + " arrancado");
        arrancado = true;
    }
    /**Si la poscición de la llave es 4, el coche arranca
     * No arranca en cualquier otro caso
     * 
     * @param posicionLlave     puede ser un número del 1 al 4
     * @return                  si se ha arrancado devuelve true
     */
    public boolean arrancar(int posicionLlave){ //4 posiciones de llave. La 4 arranca
        if(posicionLlave < 1 || posicionLlave > 4){
            throw new IllegalArgumentException("La llave ha de valer entre 1 y 4");
        }
        arrancado = posicionLlave == 4 /*? true : false*/;
        System.out.println(this.marca +(arrancado ? "  arrancado"
                                                   : " fallo arrancar"));
        return arrancado;
    }
    
    public boolean arrancar(String orden){
        arrancado = "arrancar".equals(orden);
        return arrancado;
    }
    
    /**
     * Simplemente muestra la marca y si está arrancado
     * @return 
     */
    @Override
    public String toString(){  
        StringBuilder toRet = new StringBuilder();
        String mensaje ="";
        if(isArrancado())
            mensaje = "Arrancado";
        else
            mensaje = "No arrancado";
        toRet.append(getMarca() +(arrancado ? mensaje
                                                   : "\n"+mensaje+"\nTipo: "+this.getTipo()));
        
        return toRet.toString();
    }
    


    @Override
    public void avanzar() {
        System.out.println("Ruedo un poco");
    }
}
