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
           
        dao.crear(new Coche("Coche 1"));
        dao.crear(new Coche("Coche 2"));
        Coche cc = dao.crear(new Coche("Coche 3"));             
       
        assertEquals(dao.obtenerPorIndice(1).getMarca(), "Coche 2");
        assertEquals(dao.obtenerPorMarca("Coche 1").getMarca(), "Coche 1");
             
        //Modificar
        Coche modificar = new Coche("Coche 2 ahora X");
        dao.modificar(1, modificar);
        assertEquals(dao.obtenerPorIndice(1).getMarca(), "Coche 2 ahora X");
         assertEquals(dao.obtenerPorMarca("Coche 2 ahora X").getMarca(), "Coche 2 ahora X");
        
        modificar = new Coche("Coche 3");
        modificar.arrancar();
        dao.modificar(2, modificar);
        assertEquals(modificar.isArrancado(), cc.isArrancado());      
        
        //Eliminar
        dao.eliminar(1);
        //dao.eliminar(dao.obtenerPorMarca("Coche 1"));
        dao.eliminar(new Coche("Coche 1"));
        assertNull(dao.obtenerPorIndice(1)); 
           
        
        assertNull(dao.obtenerPorMarca("Coche 1"));
        
        if(dao instanceof DaoCocheList)
            assertEquals("Coche 3", dao.obtenerPorIndice(0).getMarca());
        else
            assertEquals("Coche 3", dao.obtenerPorIndice(2).getMarca());
                               
    }
       
    @Test
    public void testUsuario() throws Exception {
        IDaoUsuario dao = new DaoUsuarioList();

        dao.crear(new Usuario("Juan", 30));
        dao.crear(new Usuario("Ana", 31));
        dao.crear(new Usuario("Bea", 32));
        dao.crear(new Usuario("Luis", 29));
        
        assertEquals("Ana", dao.obtenerPorIndice(1).getNombre());
        assertEquals(32, dao.obtenerPorNombre("Bea").getEdad());
        
        dao.modificar(1, new Usuario("Ana modif", 21));
        assertEquals("Ana modif", dao.obtenerPorIndice(1).getNombre());
        assertEquals(21, dao.obtenerPorNombre("Ana modif").getEdad());
        
        dao.eliminar(dao.obtenerPorIndice(0));
        dao.eliminar(1);
        assertEquals("Luis", dao.obtenerPorIndice(1).getNombre());   
    }
  
}
