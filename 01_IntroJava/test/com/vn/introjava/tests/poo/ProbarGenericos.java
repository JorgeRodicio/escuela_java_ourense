/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.vehiculos.Coche;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarGenericos {
    
    public ProbarGenericos() {
    }

    
    /*@Test
    public void testearMetodosGenericos() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
        insertarDuplicado(lista, tres);
        insertarDuplicado(lista, cinco);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        Integer num = getUltimoElemento(lista);
        System.out.println("Último elemento: " + num);
        assertEquals(5, (int)num);
        
        ArrayList<String> listaStr = new ArrayList<>();
        insertarDuplicado(listaStr, "tres");
        insertarDuplicado(listaStr, "cinco");
        
        for (int i = 0; i < listaStr.size(); i++) {
            System.out.println("** "+listaStr.get(i));
        }
        
        String str = getUltimoElemento(listaStr);
        System.out.println("Último elemento: " + str);
        assertEquals("cinco", str);
        
        ArrayList<Coche> listaCoche = new ArrayList<>();
        insertarDuplicado(listaCoche, new Coche("Audi"));
        insertarDuplicado(listaCoche, new Coche("Mercedes"));
        
        for (int i = 0; i < listaCoche.size(); i++) {
            System.out.println(">> "+listaCoche.get(i).getMarca());
        }  
        
        System.out.println(getUltimoElemento(listaCoche));
        
        Coche coche = getUltimoElemento(listaCoche);
        System.out.println("Último elemento: " + coche.toString());
        assertEquals("Mercedes", coche.getMarca());
        
    }
    
    @Test
    public void testearClaseAnidada(){
        ProbarClaseInterfazGenericaAnidada.ClasePequePos c;
        c = new ProbarClaseInterfazGenericaAnidada.ClasePequePos(1f, 2f);
        
    }*/
    
    @Test
    public void testHashMap(){
        ArrayList<Coche> listaCoche = new ArrayList<>();
        insertarDuplicado(listaCoche, new Coche("Audi"));
        insertarDuplicado(listaCoche, new Coche("Mercedes"));
        insertarDuplicado(listaCoche, new Coche("BMW"));
        HashMap<String,Coche> hash = new HashMap<String, Coche>();
        
        for (int i = 0; i < listaCoche.size(); i++) {
            hash.put(Integer.toString(i), listaCoche.get(i));
        }
        
        System.out.println("\n------------------HASH----------------------");
        for (int i = 0; i < hash.size(); i++) {    
            System.out.println(hash.get(Integer.toString(i)));
        }
        System.out.println("------------------FIN HASH----------------------");
    }
    
    /*static void insertarIntegerDuplicado(ArrayList<Integer> listaInt, int i){
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadido dos veces");
    }
    
    static void insertarIntegerDuplicado(ArrayList<String> listaInt, String str){
        listaInt.add(str);
        listaInt.add(str);
        System.out.println(str + " añadido dos veces");
    }*/
    
    
    
    
    static <Tipo> void insertarDuplicado(ArrayList<Tipo> lista, Tipo obj){
        lista.add(obj);
        lista.add(obj);
        System.out.println(obj + " añadido dos veces");
        
        if(obj instanceof Integer){
            Integer i = (Integer)obj;
            i = i +10;
        }
    }
    
    static <T> T getUltimoElemento(ArrayList<T> lista){
        for (T tipo : lista) {
            System.out.println(tipo.toString());
        }
        if(lista.size() > 0)
            return lista.get(lista.size()-1);
        else
            return null;
    }      
      
}
