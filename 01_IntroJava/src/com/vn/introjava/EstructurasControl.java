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
public class EstructurasControl {
    
    public static void ejecutarBucles(){
        char arrayChar [] = {'a', 'b', 'c'};
        int i = 0;
        while(i < arrayChar.length){
            System.out.println("Index = " +i+ ", char "+ arrayChar[i]);
            i++;
        }
        
        for(i = 0; i < arrayChar.length; i++)
            System.out.println("Index = " +i+ ", char "+ arrayChar[i]);
             
        i=0;
        do{
            System.out.println("Index = " +i+ ", char "+ arrayChar[i]);
            i++;
        }while(i < arrayChar.length);
        
        for(char caracter: arrayChar)
            System.out.println("Index = " +i+ ", char "+ arrayChar[i]);     
    }
    
    public static void ejecutarCondiciones(){
        //Condicional simple
        if ("Palabra".length()> 5){
            System.out.println("Palabra larga");
        }
        //Condicional compuesto
        if ("Palabra".length()> 5){
            System.out.println("Palabra larga");
        }else{
            System.out.println("Palabra corta");
        }
        
        if("Palabra".length()> 5)
            System.out.println("Palabra larga");
        else if ("Palabra".length()< 2)
            System.out.println("Palabra corta");
        //Switch
        int numeroPeq = 0;
        
        switch(numeroPeq + 5){
            case 0: 
                System.out.println("numero peq vale 0");
                break;
            case 1: 
            case 2:
            case 3: 
                System.out.println("numero peq vale 1, 2 o 3");
                break;
            default:
                System.out.println("Valor por defecto");
                break;
        }
    }
}
