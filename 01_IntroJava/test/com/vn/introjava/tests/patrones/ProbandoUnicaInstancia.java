/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.patrones;

import com.vn.introjava.patrones.CocheEspecialUnico;
import com.vn.introjava.patrones.TractorSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbandoUnicaInstancia {
    
    
    @Test
    public void intentarUnicaInst() throws Exception{
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;  
        miUnicoCoche.mostrarEstado();
    }
    
    @Test
    public void intentarUnicaInstBis() throws Exception{
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = null;
        //miUnicoCoche.setMarca("UNICO COCHE 2");
        miUnicoCoche.mostrarEstado();
    }
    
    @Test
    public void intentarUnicaInstTris() throws Exception{
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("UNICO COCHE 3");
        miUnicoCoche.mostrarEstado();
    }
    
    @Test
    public void intentarUnicaInstTractor() throws Exception{
        TractorSingleton tractor = TractorSingleton.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("UNICO COCHE 3");
        tractor.mostrarEstado();
    }
    
    @Test
    public void intentarUnicaInstTractor2() throws Exception{
        TractorSingleton tractor = TractorSingleton.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("UNICO COCHE 3");
        tractor.mostrarEstado();
    }
    
    
    
}
