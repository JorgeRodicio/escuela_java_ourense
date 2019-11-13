/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import java.util.List;

/**
 *
 * @author pc
 */
public class HilosSencillos {
    static int contadorCompartido = 0;
    HiloA hiloA1, hiloA2;
    HiloB hiloB1, hiloB2;
    
    

    public HilosSencillos() {
        this.hiloA1 = new HiloA();
        this.hiloA2 = new HiloA();
        this.hiloB1 = new HiloB();
        this.hiloB2 = new HiloB();
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
    
    public void ejecutarHilosABStartABenParalelo(){
        System.out.println("\n**** THREAD HILOS START ****");
        Thread threadHiloA1 = new Thread(hiloA1);
        Thread threadHiloA2= new Thread(hiloA2);
        Thread threadHiloB1 = new Thread(hiloB1);
        Thread threadHiloB2 = new Thread(hiloB2);
        
        threadHiloA1.start();
        threadHiloA2.start();
        threadHiloB1.start();
        threadHiloB2.start();
        
        while(  threadHiloA1.isAlive() || threadHiloA2.isAlive() ||
                threadHiloB1.isAlive() || threadHiloB2.isAlive());
        System.out.println("\n**** FIN THREAD HILOS START ****");
    }
    
    public void ejecutarHilosRunABenSerie(){
        System.out.println("\n---- THREAD HILOS RUN ----");
        
        hiloA1.run();
        hiloA2.run();
        hiloB1.run();
        hiloB2.run();
        
        System.out.println("\n---- FIN THREAD HILOS RUN ----");
    }
}
