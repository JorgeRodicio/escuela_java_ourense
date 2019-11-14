package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{

    private Contenedor contenedor;

    public Consumidor(Contenedor c) {
        contenedor = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = 0;
            System.out.println("     Consumidor. Antes del GET: " + value); 
            value = contenedor.get();
            System.out.println("<<<< Consumidor. Despues del GET: " + value); 
            
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
