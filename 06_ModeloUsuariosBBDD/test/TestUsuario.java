/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.modeloUsuarios.DaoUsuarioDerby;
import com.vn.modeloUsuarios.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestUsuario {
    
    public TestUsuario() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testInsertar() throws Exception {
        DaoUsuarioDerby dao = new DaoUsuarioDerby();
        dao.crear(new Usuario("pepe", "pepe@pepepepepe", 19, "1234"));
        
        assertEquals(dao.leer(4).getNombre(), "pepe");
        System.out.println(dao.modificar(4, new Usuario("psd","jdasojda@sajd",34,"12312")));
        
        List<Usuario> lista = dao.leer();
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
        
    }
}
