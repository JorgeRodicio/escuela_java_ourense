/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

import com.vn.liboperaarrays.OperarArrays;
import com.vn.liboperaarrays.OperarArrays.FunCallbackOperarArrays;
import java.io.PrintStream;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arrayA = {1,2,3,4,5};
        double[] arrayB = {2,3,4,5,6};
        //Desde Java 8 permite las funciones callback
        double[] arrayResultado = OperarArrays.operarArrays(arrayA, arrayB, Main::suma);
        System.out.println("Suma: ");
        arrayEnTabla(System.out, arrayResultado);
        System.out.println("\n");
        
        FunCallbackOperarArrays divide = (double x, double y) ->{
            return x/y;
        };
        
        arrayResultado = OperarArrays.operarArrays(arrayA, arrayB, Main::divide);
        System.out.println("Divide: ");
        arrayEnTabla(System.out, arrayResultado);
        System.out.println("\n");
        
        arrayResultado = OperarArrays.operarArrays( arrayA, 
                                                    arrayB,
                                                    (double x, double y)->{
                                                        return x - y;
    });
        System.out.println("Resta: ");
        arrayEnTabla(System.out, arrayResultado);
        System.out.println("\n");
        
        
    }
    
    public static double suma(double x, double y){
        return x + y;
    }
    
    public static double resta(double x, double y){
        return x - y;
    }
    
    public static double multiplica(double x, double y){
        return x * y;
    }
    
    public static double divide(double x, double y){
        return x / y;
    }
    
    public static void mostrarArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    
    public static void arrayEnTabla(PrintStream salida, double[] array){
        String tabla = "<table border=2><tr>";
        
        for (int i = 0; i < array.length; i++) {
            final double element = array[i];
            tabla += "<td>&nbsp; " + element + "&nbsp;</td>\n";
        }
        salida.println( tabla + "</tr></table>");
    }
    
}
