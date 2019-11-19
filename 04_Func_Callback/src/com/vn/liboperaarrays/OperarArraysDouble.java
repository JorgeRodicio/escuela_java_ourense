/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.liboperaarrays;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author pc
 */
public class OperarArraysDouble {
    
    @FunctionalInterface
    public interface FunCallbackOperarArrays{
        //Sólo podemos declarar un método
        Double operar(Double x, Double y);
    }
    
    public static Double[] operarArrays(Double[] arrayX, Double[] arrayY, FunCallbackOperarArrays operaCllbck){
        Double [] arrayResult = null;
        if(arrayX.length == arrayY.length){
            arrayResult = new Double[arrayX.length];  
            for (int i = 0; i < arrayResult.length; i++) {
               arrayResult[i] = operaCllbck.operar(arrayX[i], arrayY[i]);
            }
        }
        return arrayResult;
    }
}
