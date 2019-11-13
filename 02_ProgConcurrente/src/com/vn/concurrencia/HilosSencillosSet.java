/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import static com.vn.concurrencia.HilosSencillos.contadorCompartido;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class HilosSencillosSet {
    
    Set<Runnable> setHilos;
    Iterator<Runnable> iterador;

    public HilosSencillosSet() {
        this.setHilos = new HashSet<>();
        iterador = setHilos.iterator();
        
        for (int i = 0; i < 10; i++) {
           setHilos.add(new HiloA());
           setHilos.add(new HiloB());
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
        System.out.println("\n---- ARRAY HILOS START PARALELO----");
        
        while(iterador.hasNext()){
             Thread thread = new Thread(iterador.next());
             thread.start();
            
             while(thread.isAlive());
                  
        }
        System.out.println("\n---- FIN ARRAY HILOS START PARALELO----");
    }
    
    public void ejecutarHilosEnSerie(){
        System.out.println("\n---- ARRAY HILOS START SERIE----");
        
        while(iterador.hasNext()){
            Runnable thread = iterador.next();  
            thread.run();
        }
        System.out.println("\n---- FIN ARRAY HILOS START SERIE----");
    }
    
    
    
}
