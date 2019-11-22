/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

/**
 *
 * @author pc
 */
public class WrapperPrimitivos {
    public static void EjemploInteger(){
        int varPrimitiva = 10;
        Object varInteger = new Integer(varPrimitiva);
        System.out.println("varIneteger = " + varInteger.toString());
    }
    
    public static void EjemploDouble(){
        double varPrimitiva = 10;
        Object varDouble = new Double(varPrimitiva);
        System.out.println("varDouble = " + varDouble.toString());
    }
    
    public static void EjemploString(){
        String varPrimitiva = "Cadena string";
        Object varString = new String(varPrimitiva);
        System.out.println("varDouble = " + varString.toString());
    }
    
}
