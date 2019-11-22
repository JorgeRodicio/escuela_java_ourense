/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;
import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.CocheRally;
import com.vn.introjava.poo.vehiculos.Vehiculo;
import com.vn.introjava.poo.vehiculos.sistdesplaz.Avion;
import com.vn.introjava.poo.vehiculos.sistdesplaz.BicicletaElectrica;
import com.vn.introjava.poo.vehiculos.sistdesplaz.Monopatin;
import com.vn.introjava.poo.vehiculos.sistdesplaz.MonopatinElectrico;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarInterfaces {
    
    public ProbarInterfaces() {
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
    // @Test
    // public void hello() {}
    
    
    /*@Test
    public void creandoDesplazables(){
        Avion miAvion = new Avion();
        miAvion.mover(50.1f);
        miAvion.rodar(5);
        
        Desplazable d1 = new Avion();
        d1.mover(10);
        Avion avionD1 = (Avion)d1;
        avionD1.volar(300);
    }*/
    
    /*@Test
    public void creandoDesplazables_2(){
        Monopatin miMonopatin = new Monopatin();
        miMonopatin.mover(50.1f);
        miMonopatin.rodar(200);
        miMonopatin.andar(2);
        
        Desplazable d1 = new Monopatin();
        d1.mover(4);
        d1.mover(20);
        Monopatin monopatinD1 = (Monopatin)d1;
        monopatinD1.andar(300);
    }*/
    
    /*@Test
    public void moviendoVehiculosDesplazables(){
        CocheRally cocheRally; 
        cocheRally = new CocheRally("coche rally");
        
        Coche cocheR = cocheRally;
        Vehiculo vehiculoR = cocheRally;
        Desplazable desplazableR = cocheRally;
        
        cocheR.arrancar();
        vehiculoR.mostrarEstado();
        desplazableR.mover(20f);
        
    }*/
    
    @Test
    public void arrayInterfaces(){
        Electrico[] cosasElectricas = new Electrico[]{
            new MonopatinElectrico(),
            new BicicletaElectrica()   
        };
        
        for (int i = 0; i < cosasElectricas.length; i++) {
            cosasElectricas[i].cargarBateria(10f);
        }
        
        if(cosasElectricas.length !=2){
            fail("No tiene 2 elementos");
        }
    
        
    }
    
   
}
