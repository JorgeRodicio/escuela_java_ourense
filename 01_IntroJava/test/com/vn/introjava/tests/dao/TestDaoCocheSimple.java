/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoCocheMap;
import com.vn.introjava.dao.IDaoCoche;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestDaoCocheSimple {
    
    @Test
    public void probarDaoCocheList() throws Exception {
        testInterfaceDaoCoche(new DaoCocheList());    
    }
    
    @Test
    public void probarDaoCocheMap() throws Exception {
        testInterfaceDaoCoche(new DaoCocheMap());    
    }
    
    void testInterfaceDaoCoche(IDaoCoche dao) throws Exception{
        dao.crear("Coche A");
        dao.crear("Coche B");
        dao.crear("Coche C");
                
        assertEquals(dao.obtenerPorIndice(1).getMarca(), "Coche B");
        assertEquals(dao.obtenerPorMarca("Coche A").getMarca(), "Coche A");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
