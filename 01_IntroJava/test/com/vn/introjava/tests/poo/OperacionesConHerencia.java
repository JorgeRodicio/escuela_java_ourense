package com.vn.introjava.tests.poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.TipoVehiculo;
import com.vn.introjava.poo.Tractor;
import com.vn.introjava.poo.Vehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class OperacionesConHerencia {
    static CocheRally cocheRally;
    static Coche turismo;
    
    @BeforeClass
    public static void setUpClass() throws Exception{
        cocheRally = new CocheRally();
        cocheRally.setMarca("Toyota");
    }
    
    /*@Test
    public void testSobreescrituraMetodos() throws Exception{
        cocheRally.setMarca("Toyota Supra");
        cocheRally.setRozamiento(7f);
        
        assertTrue(cocheRally.getRozamiento() == 7f);
        assertTrue(cocheRally.arrancar("arrancar"));
        assertTrue(cocheRally.arrancar("ARRANcar"));
        assertTrue(cocheRally.arrancar("ENCENDER"));
        
        cocheRally.mostrarEstado();
        cocheRally.mostrarEstadoAntiguo();

    }*/
    
    /*@Test
    public void testPolimorfismo() throws Exception{
        cocheRally.setRozamiento(15f);
        
        turismo = cocheRally;
        
        turismo.mostrarEstado();
        
    }*/
    
    /*@Test
    public void testEnumerado() {
        cocheRally.setTipo(TipoVehiculo.RALLY);
        System.out.println("Tipo vehículo: " + cocheRally.getTipo());
        System.out.println("Valor: " + cocheRally.getTipo().ordinal());
        
        Tractor tractor = new Tractor();
        tractor.setTipo(TipoVehiculo.values()[2]);
        System.out.println("Tipo vehículo: " + tractor.getTipo());
        System.out.println("Valor: " + tractor.getTipo().ordinal());
        
        tractor.setTipo(TipoVehiculo.valueOf("TRACTOR"));
        System.out.println("Tipo vehículo: " + tractor.getTipo());
        System.out.println("Valor: " + tractor.getTipo().ordinal());
    }*/
    
    @Test
    public void testClasesAbstractas() {
        //Vehiculo desconocido = new Vehiculo();
        Vehiculo coche = new Coche("Dacia");
        Vehiculo rally = new CocheRally("Subaru");
        Vehiculo tractor = new Tractor();
        //coche.avanzar();
        //tractor.avanzar();
        
        //casting explicito
        assertEquals(((CocheRally)rally).getMarca(), "Subaru");
        
        Vehiculo[] misVehiculos = new Vehiculo[]{
            coche,
            tractor,
            rally,
        };
        
        for (Vehiculo miVehiculo : misVehiculos) {
            System.out.println(" - "+miVehiculo.getTipo());
            miVehiculo.avanzar();
            miVehiculo.mostrarEstado();
            System.out.println("\n");
        }
        
        //System.out.println("\n");
        
        
        
    }
    
}
