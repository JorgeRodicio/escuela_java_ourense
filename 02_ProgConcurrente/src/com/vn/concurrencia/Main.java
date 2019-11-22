/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HilosSencillos hs = new HilosSencillos();
        
        long timeIni = System.currentTimeMillis();
        hs.ejecutarHilosRunABenSerie();
        String m1 = mostrarTiempo(timeIni, "Run en serie ha tardado ");
        
        timeIni = System.currentTimeMillis();
        hs.ejecutarHilosABStartABenParalelo();
        String m2 = mostrarTiempo(timeIni, "Start en paralelo ha tardado ");
        
        
        //CON UN ARRAYLIST     
        HilosSencillosArray array = new HilosSencillosArray();
        
        timeIni = System.currentTimeMillis();
        array.ejecutarHilosEnParalelo();
        String m3 = mostrarTiempo(timeIni, "Array en paralelo ha tardado ");
        
        timeIni = System.currentTimeMillis();
        array.ejecutarHilosEnSerie();
        String m4 = mostrarTiempo(timeIni, "Array en serie ha tardado ");
        
        //System.out.println(m1);
        //System.out.println(m2);
        
        
        
        //CON UN SET
        HilosSencillosSet set = new HilosSencillosSet();
        
        timeIni = System.currentTimeMillis();
        set.ejecutarHilosEnParalelo();
        String m5 = mostrarTiempo(timeIni, "Set en paralelo ha tardado ");
        
        timeIni = System.currentTimeMillis();
        set.ejecutarHilosEnSerie();
        String m6 = mostrarTiempo(timeIni, "Set en serie ha tardado ");
        
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        
    }
    
    static String mostrarTiempo(long timeInicial, String mensaje){
        double tiempoTotal = (double)(System.currentTimeMillis() - timeInicial) / 1000.0;
        String mensajeRet = mensaje + tiempoTotal;
        
        return mensajeRet;
    }
    
}
