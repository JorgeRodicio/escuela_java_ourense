/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import com.vn.introjava.excepciones.UsoNormalExcepciones;
import static com.vn.introjava.funcionesbasicas.DatosBasicos.*;
import static com.vn.introjava.funcionesbasicas.Ordenamiento.*;
import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.FabricaCoches;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.TransformException;

/**
 * Clase principal del proyecto Ejemplos Java
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        while(args.length > -1)
        try{
            //Primer código con error IllegalArgumentException
            Coche coche = FabricaCoches.crear("Un coche");
            coche.mostrarEstado();
            
            //Segundo código con error RuntimeException
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            //unObj.metodoPeligroso(); 
            
            throw new TransformException("Optimus Prime se ha quedado sin batería");
            
            //Tercer código con error, NullpointerException
            //Object objNulo = null;
            //System.out.println("Fallará: " + objNulo.toString());
            
        }   
        
        catch(IllegalArgumentException ex){
            System.out.println("Argumento invalido. Decirle al usuario lo qué: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);//Se pueden anidar los catch
        } 
        catch(RuntimeException ex){
            System.out.println("Cualquier tipo de RuntimeException: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);//Se pueden anidar los catch
        }     
        catch(Exception ex){
            System.out.println("Cualquier tipo de Exception: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally{//Siempre se ejecuta, incluso antes que un return
            System.out.println(">>> FIN DEL TRY - CATCH");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
        
    /**
     * Función que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    
    
    public static void mainTryCatchPorSeparado(String[] args) {

        try {
            //        EstructurasControl.ejecutarBucles();
            //        EstructurasControl.ejecutarCondiciones();
            //          
            //        mostrarTiposDatos();
            //        DatosBasicos.probarOperadores();

            //ordenarArray3();
            //ordenarArray3(generarArray(10000));
            Coche coche = FabricaCoches.crear(null);
            coche.mostrarEstado();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("\nExcepcion " + ex); 
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
        }
        
        try{
            Object objNulo = null;
            System.out.println("Fallará: " + objNulo.toString());
        }catch(NullPointerException ex){
            System.out.println("\nExcepcion " + ex);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
