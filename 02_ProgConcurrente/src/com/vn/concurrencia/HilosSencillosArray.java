/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import static com.vn.concurrencia.HilosSencillos.contadorCompartido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class HilosSencillosArray {
    
    List<Runnable> arrayHilos;

    public HilosSencillosArray() {
        this.arrayHilos = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
           arrayHilos.add(new HiloA());
           arrayHilos.add(new HiloB());
        }
    }
    
    
    class HiloA implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 50000; i++) {
                contadorCompartido ++;
                if( i % 100 == 0)
                System.out.println("Instrucción A:     " + i
                                    + " - contador = " + contadorCompartido);
            }
        }    
    }
    
    class HiloB implements Runnable{

        @Override
        public void run() {
            for (int j = 0; j < 80000; j++) {
                contadorCompartido ++ ;
                if( j % 100 == 0)
                System.out.println("->Ins B: " + + j
                                    + " - contador = " + contadorCompartido);
            }
        }    
    }
      
    public void ejecutarHilosEnParalelo(){
        System.out.println("\n---- ARRAY HILOS START PARALELO ----");
        for (int i = 0; i < arrayHilos.size(); i++) {
            Thread thread = new Thread(arrayHilos.get(i));
            thread.start();
            
            while(thread.isAlive());
        }
        System.out.println("\n---- FIN ARRAY HILOS START PARALELO----");
    }
    
    public void ejecutarHilosEnSerie(){
        System.out.println("\n---- ARRAY HILOS START SERIE----");
        for (int i = 0; i < arrayHilos.size(); i++) {
            arrayHilos.get(i).run();      
        }
        System.out.println("\n---- FIN ARRAY HILOS START SERIE----");
    }
    
    
    
}
