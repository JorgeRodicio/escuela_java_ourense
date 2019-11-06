/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Ordenamiento {
    //Utilizando arrays auxiliares
    public static int[] ordenarArray( int[] arrayEnteros){ 
        if(arrayEnteros == null)
            return arrayEnteros;
        
        int arrayAux[]= new int[arrayEnteros.length];
        boolean arrayAux2[] = new boolean[arrayEnteros.length];
            
        int menor = Integer.MAX_VALUE;
        int pos = 0;
        
        for(int i = 0; i<arrayEnteros.length; i++){
            for(int j = 0; j < arrayEnteros.length; j++){
                if(arrayEnteros[j] < menor && arrayAux2[j] == false){ 
                    menor = arrayEnteros[j];
                    pos = j;
                } 
            }
            arrayAux[i] = menor;
            arrayAux2[pos] = true;
            System.out.println("Valor menor "+menor+" Posicion "+pos); 
            menor = Integer.MAX_VALUE;
        }
        
        for(int j = 0; j < arrayEnteros.length; j++){
            System.out.print(arrayAux[j]+" ");    
        }
        
        return arrayAux;
    }
    
    //Burbuja
    public static int[] ordenarArray2(int [] arrayEnteros){
         if(arrayEnteros == null)
            return arrayEnteros;

        for(int i = 0; i<arrayEnteros.length; i++){
           for(int j = 0; j < arrayEnteros.length -1; j++){
               if(arrayEnteros[j+1] < arrayEnteros[j]){ 
                   int aux = arrayEnteros[j];
                   arrayEnteros[j] = arrayEnteros[j+1];
                   arrayEnteros[j+1] = aux;
               } 
           }            
       }
        
       for(int j = 0; j < arrayEnteros.length; j++){
           System.out.print(arrayEnteros[j]+" ");    
       }
       
       return arrayEnteros;
    }
    
    //Poner el menor al principio
    public static int [] ordenarArray3(int [] arrayEnteros){
        if(arrayEnteros == null)
            return arrayEnteros;
               
        int menor = Integer.MAX_VALUE;
        int contador = 0;
        int pos = 0;
        
        for(int i = 0; i<arrayEnteros.length; i++){
           for(int j = contador; j < arrayEnteros.length; j++){
               if(arrayEnteros[j] < menor){ 
                   menor = arrayEnteros[j];
                   pos = j; 
               } 
           }
           int aux = arrayEnteros[contador];
           arrayEnteros[contador] = menor;
           arrayEnteros[pos] = aux;
           contador++;
           menor = Integer.MAX_VALUE;
       }
        
        for(int j = 0; j < arrayEnteros.length; j++){
            System.out.print(arrayEnteros[j]+" ");    
        }      
    
       return arrayEnteros;
    }
    
    public static void ordenarArray4(int [] arrayEnteros){
        
               
        int menor = Integer.MAX_VALUE;
        int contador = 0;
        int pos = 0;
        
        for(int i = 0; i<arrayEnteros.length; i++){
           for(int j = contador; j < arrayEnteros.length; j++){
               if(arrayEnteros[j] < menor){ 
                   menor = arrayEnteros[j];
                   pos = j; 
               } 
           }
           int aux = arrayEnteros[contador];
           arrayEnteros[contador] = menor;
           arrayEnteros[pos] = aux;
           contador++;
           menor = Integer.MAX_VALUE;
       }
        
        for(int j = 0; j < arrayEnteros.length; j++){
            System.out.print(arrayEnteros[j]+" ");    
        }      
  
    }
    
    public static int [] generarArray(int tamaño){
        int [] array = new int[tamaño];
        Random rnd = new Random(System.currentTimeMillis());
        for(int i = 0; i < tamaño; i++){
            int num = (int) Math.floor(Math.random()*6+1);
            array[i] = rnd.nextInt(10000000);  
        }
        
        return array;
    }
}
