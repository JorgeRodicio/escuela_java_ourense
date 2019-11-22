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
public class OperarArraysObject {
    
    @FunctionalInterface
    public interface FunCallbackOperarArrays{
        //Sólo podemos declarar un método
        Object operar(Object x, Object y);
    }
    
    public static Object[] operarArrays(Object[] arrayX, Object[] arrayY, FunCallbackOperarArrays operaCllbck){
        Object [] arrayResult = null;
        if(arrayX.length == arrayY.length){
            arrayResult = new Object[arrayX.length];  
            for (int i = 0; i < arrayResult.length; i++) {
               arrayResult[i] = operaCllbck.operar(arrayX[i], arrayY[i]);
            }
        }
        return arrayResult;
    }
}
