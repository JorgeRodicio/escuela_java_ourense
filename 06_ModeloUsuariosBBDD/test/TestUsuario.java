/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vn.modeloUsuarios.DaoUsuarioDerby;
import com.vn.modeloUsuarios.Usuario;
import com.vn.servicioUsuarios.ServicioUsuarios;
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
//    @Test
//    public void testInsertar() throws Exception {
//        DaoUsuarioDerby dao = new DaoUsuarioDerby();
//        
////        for (int i = 0; i < 10; i++) {
////            dao.crear(new Usuario("Nombre " + i, "nombre" + i + "@nombre", 19, "1234"));
////        }
////        
////        
////        assertEquals(dao.leer(4).getNombre(), "pepe");
////        System.out.println(dao.modificar(4, new Usuario("psd","jdasojda@sajd",34,"12312")));
////        
////        List<Usuario> lista = dao.leer();
////        
////        for (int i = 0; i < lista.size(); i++) {
////            System.out.println(lista.get(i).toString());
////        } 
//        
//        //System.out.println("\n\n\n" + dao.leer("nombre1@nombre"));
//        
//        List<Usuario> lista = dao.leerPorNombre("pe");
//        System.out.println("\n\n\n");
//        
//        for (int i = 0; i < lista.size(); i++) {
//           System.out.println(lista.get(i).toString()); 
//        }
//       
//    }
     @Test
    public void CrearUsuarioInvalidos() throws Exception {
      ServicioUsuarios ser = new ServicioUsuarios();
      
      //Error con email
      ser.crear("a", "abc123", "Paquito", "24");
      //Error con nombre
      ser.crear("asdas@jsad", "12312342", "a", "23");
      //Error contraseña
      ser.crear("sads@dsajd", "as", "Fasdadds", "56");
      //Error edad
      ser.crear("sdasda@sads", "12312343", "Mandaloriano", "10");
      //Todos error
      ser.crear("a", "a", "a", "9");
      
      
      
    }
}
