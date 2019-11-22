/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.vehiculos;

/** Clase CocheRally para controlar otras características
 * específicas de los rallies
 *
 * @author pc
 */
public class CocheRally extends Coche{
    
    private float rozamiento;

    public CocheRally() {
        super();
        rozamiento = 5f;
        this.tipo = TipoVehiculo.RALLY;
    }

    public CocheRally(String marca) {
        super(marca);
        rozamiento = 5f;
        this.tipo = TipoVehiculo.RALLY;
    }

    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
        this.tipo = TipoVehiculo.RALLY;
    }     
    
    /**
     * Obtener valor de rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * Establecer valor de rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    @Override
    public boolean arrancar(String orden) {
        if(super.arrancar(orden))
            return super.arrancado;
        else if("arrancar".equalsIgnoreCase(orden))
                arrancado = true;
            else
                arrancado = "encender".equals(orden.toLowerCase());   
        
        return arrancado;
    }
    
    //Sobreescribir el metodo mostrarEstado para que nuestre el rozamiento

    //@Override
    public void mostrarEstadoAntiguo() {
        System.out.println("Rozamiento: "+getRozamiento());
    }
      
    @Override
    public String toString() {
        //super.mostrarEstado();
        StringBuilder toRet = new StringBuilder();
        String mensaje;
        if(this.isArrancado() == true){
            mensaje = "arrancado";
        }else{
            mensaje = "no arrancado";
        }
        toRet.append("Coche de Rally: ")
                .append(getMarca()).append("\n")
                .append("Rozamiento: ")
                .append(getRozamiento())
                .append("\n")
                .append(mensaje)
                .append("\nTipo: ")
                .append(this.getTipo());
        
        return toRet.toString();
    }
}
