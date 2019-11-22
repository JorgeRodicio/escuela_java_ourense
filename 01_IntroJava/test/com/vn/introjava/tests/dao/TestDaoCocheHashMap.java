/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCocheMap;
import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.IDaoCoche;
import com.vn.introjava.dao.IDaoUsuario;
import com.vn.introjava.dao.Usuario;
import com.vn.introjava.poo.vehiculos.Coche;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestDaoCocheHashMap {
    
    /*@Test
    public void probarDaoCocheList() throws Exception {
        testInterfaceDaoCoche(new DaoCocheList());    
    }*/
    
    @Test
    public void probarDaoCocheMap() throws Exception {
        testInterfaceDaoCoche(new DaoCocheMap());    
    }
    
    void testInterfaceDaoCoche(IDaoCoche dao) throws Exception{
           
        dao.crear(new Coche("Coche 1"));
        dao.crear(new Coche("Coche 2"));
        Coche cc = dao.crear(new Coche("Coche 3"));
              
       
        assertEquals(dao.obtenerPorIndice(1).getMarca(), "Coche 2");
        assertEquals(dao.obtenerPorMarca("Coche 1").getMarca(), "Coche 1");
        
        //Eliminar
        dao.eliminar(0);
        assertEquals(dao.obtenerPorIndice(0), null);
        
        //Modificar
        Coche modificar = new Coche("Coche 2 ahora X");
        dao.modificar(1, modificar);
        assertEquals(dao.obtenerPorIndice(1).getMarca(), "Coche 2 ahora X");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
