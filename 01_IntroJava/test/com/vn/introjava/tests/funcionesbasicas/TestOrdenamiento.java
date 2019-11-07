/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.funcionesbasicas;

import com.vn.introjava.funcionesbasicas.Ordenamiento;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static com.vn.introjava.funcionesbasicas.Ordenamiento.*;
import org.junit.Assert;

/**
 *
 * @author pc
 */
public class TestOrdenamiento {
    
    public TestOrdenamiento() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    private void probarOrdenamientoSistemaHumano(int [] array, int[] arrayOrdenadoOk) {
        //int[] array= {5,4,3,2,1};
        //int[] arrayOrdenadoOk = {1,2,3,4,5};
        int[] arrayOrdenadoPorFuncion = ordenarArray(array);
        assertArrayEquals(arrayOrdenadoPorFuncion, arrayOrdenadoOk);
    }
       
    @Test
    public void probarOrdenamientoSistemaHumano_4Elementos() {
        int[] array= {4,2,3,1};
        int[] arrayOrdenadoOk = {1,2,3,4};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ArrayInverso() {
        int[] array= {5,4,3,2,1};
        int[] arrayOrdenadoOk = {1,2,3,4,5};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ElementosRepetidos() {
        int[] array= {5,5,4,3,2,2,1};
        int[] arrayOrdenadoOk = {1,2,2,3,4,5,5};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    
    @Test
    public void probarOrdenamientoSistemaHumano_MaximoValor() {
        int[] array= {2,Integer.MAX_VALUE,1,3};
        int[] arrayOrdenadoOk = {1,2,3,Integer.MAX_VALUE};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_MinimoValor() {
        int[] array= {2, 1, Integer.MIN_VALUE};
        int[] arrayOrdenadoOk = {Integer.MIN_VALUE,1,2};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ArrayVacio() {
        int[] array= {};
        int[] arrayOrdenadoOk = {};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ArrayOrdenado() {
        int[] array= {1,2,3,4};
        int[] arrayOrdenadoOk = {1,2,3,4};
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_ArrayNull() {
        int[] array= null;
        int[] arrayOrdenadoOk = null;
        probarOrdenamientoSistemaHumano(array,arrayOrdenadoOk);
    }
    
    
    
}
