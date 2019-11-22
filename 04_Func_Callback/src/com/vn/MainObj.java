/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

import static com.vn.Main.arrayEnTabla;
import com.vn.liboperaarrays.OperarArrays;
import com.vn.liboperaarrays.OperarArrays.FunCallbackOperarArrays;
import com.vn.liboperaarrays.OperarArraysObject;
import java.io.PrintStream;

/**
 *
 * @author pc
 */
public class MainObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double[] arrayA = {1.,2.,3.,4.,5.};
        Double[] arrayB = {2.,3.,4.,5.,6.};
        //Desde Java 8 permite las funciones callback
        Object[] arrayResultado = OperarArraysObject.operarArrays(arrayA, arrayB, MainObj::suma);
        System.out.println("Suma: ");
        arrayEnTabla(System.out, arrayResultado);
        System.out.println("\n");
        
        
        OperarArraysObject.FunCallbackOperarArrays divide = (Object x, Object y) ->{
            return (Double)x/(Double)y;
        };
        
        arrayResultado = OperarArraysObject.operarArrays(arrayA, arrayB, divide);
        System.out.println("Divide: ");
        arrayEnTabla(System.out, arrayResultado);
        System.out.println("\n");
        
      
    }    
    
    
    public static Object suma(Object x, Object y){
        return (Double)x + (Double)y;
    }
                  
    
    public static void arrayEnTabla(PrintStream salida, Object[] array){
        String tabla = "<table border=2><tr>";

        for (int i = 0; i < array.length; i++) {
            final Object element = array[i];
            tabla += "<td>&nbsp; " + element + "&nbsp;</td>\n";
        }
        salida.println( tabla + "</tr></table>");
    }
    
}
