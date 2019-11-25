/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.modeloUsuarios.DaoUsuarioDerby;
import com.vn.modeloUsuarios.Usuario;
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
        dao.crear(new Usuario("pepito@pepito.com", "pepe", 19, "1234"));
    }
}
