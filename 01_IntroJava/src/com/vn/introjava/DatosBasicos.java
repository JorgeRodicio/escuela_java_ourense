/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

/**
 *
 * @author pc
 */
public class DatosBasicos {
    public static void mostrarTiposDatos(){
        System.out.println("Tipos de datos");
        byte unByte = -128;
        int unEntero = 2000000000; //4 bytes
        long enteroLargo = 100000000000000L; //8 bytes
        float unDecimal = 3.3f; //4 bytes
        double unDouble = 5.6573649347; //8 bytes
        boolean condicion = true; //byte
        char unCaracter = 'A'; //2 bytes
        char unCharEntero = 2000;
        String texto = "Hola soy un texto"; 
        
        System.out.println("Byte: " + unByte);
        System.out.println("Entero: " + unEntero);
        System.out.println("Entero largo: " + enteroLargo);
        System.out.println("Float: " + unDecimal);
        System.out.println("Double: " + unDouble);
        System.out.println("Caracter: " + unCaracter);
        System.out.println("Caracter: " + unCharEntero);
        System.out.println("String: " + texto);
    }
    
    public static void probarOperadores(){
       //operadores unarios
       System.out.println("Negacion " + ! true);
       System.out.println("Negativo "+ -(10+5));
       int contador;
       contador = 0;
       System.out.println("Incremento " + contador++);
       System.out.println("Incremento " + ++contador);
       //Binarios
       System.out.println("Suma y mult " + ((float)5+5)*2/3);
    }
}
