package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * El sistema de bloqueo lo tiene que gestionar
 * el recurso compartido
 * 
 * @author pc
 */

public class Contenedor {
    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
    int dato;
    //Semaforo: false no se puede usar el recurso
    //          true sí se puede usar
    boolean hayDato = false;
    
    public synchronized int get() {
              
        while(hayDato == false){ 
            
            try {
            // Esperamos a que se produzca algun dato
                this.wait(); //Le decimos al hilo que espere
                             //hasta que el productor produzca el dato
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        hayDato = false;    //Marcamos para bloquear el recurso antes de devolver
        
        this.notifyAll();   //Indicar al hilo que avise a los otros hilos que el recurso ha sido consumido
        return dato;        //Devolver el dato
    }
    public synchronized void put(int valor) {
        
        
        while(hayDato == true){ //Esperamos a que alguien consuma el dato
            //Mientras hay dato, nadie lo ha consumido
            
            
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dato = valor;       //Almacenar el datp
        hayDato = true;     //Marcamos para liberar el recurso
        
        this.notifyAll();
       
    }
}
