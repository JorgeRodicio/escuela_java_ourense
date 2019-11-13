/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.dao;

import com.vn.introjava.dao.DaoCocheList;
import com.vn.introjava.dao.DaoUsuarioList;
import com.vn.introjava.dao.IDaoCoche;
import com.vn.introjava.dao.IDaoUsuario;
import com.vn.introjava.dao.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestDaoUsuario {
    
    
    
    @Test
    public void testDaoUsuarioList() throws Exception{
        
        IDaoUsuario dao = new DaoUsuarioList();
        
        dao.crear(new Usuario("Nombre 1", 20));
        dao.crear(new Usuario("Nombre 2", 10));
        dao.crear(new Usuario("Nombre 3", 20));
              
        //assertEquals(dao.obtener(1).getNombre(), "Nombre 2");
        assertEquals(dao.obtenerPorIndice(1).getEdad(), 10);
        assertEquals(dao.obtenerPorNombre("Nombre 1").getNombre(), "Nombre 1");
        
        //Eliminar
        dao.eliminar(0);
        assertEquals(dao.obtenerPorIndice(0).getEdad(), 10);
        
        //Modificar
        dao.modificar(0, new Usuario("Nombre 4", 50));
        assertEquals(dao.obtenerPorIndice(0).getEdad(), 50);
        
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
