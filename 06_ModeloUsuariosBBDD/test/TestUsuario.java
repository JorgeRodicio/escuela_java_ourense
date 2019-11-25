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
    
       @Test
    public void CrearUsuarioValidos() throws Exception {
         ServicioUsuarios ser = new ServicioUsuarios();
         
         //Crear 5 usuarios
//         ser.crear("usuario1@user", "abc1234", "Mandaloriano", "34");
//         ser.crear("usuario2@user", "abc1234", "Manolito", "13");
//         ser.crear("usuario3@user", "abc123421342", "Pacojones", "78");
//         ser.crear("usuario4@user", "abc123342", "Nanonaino", "56");
//         ser.crear("usuario5@user", "abc123142", "Hasancito", "15");
         
         
         //comprobar
           assertEquals("Mandaloriano", ser.leer(11).getNombre());
//           ser.crear("user1@asdxzc", "1231231", "Prueba", "23");
//           ser.crear("user2@asdxzcz", "1231231", "Prueba", "23");
//           ser.crear("user3@asdxzcz", "1231231", "Prueba", "23");
           assertEquals(3, ser.leerPorNombre("Prueba").size());
           
         //Eliminar usuarios creados
//         ser.eliminar(10);
//         ser.eliminar(11);
//         ser.eliminar(12);
//         ser.eliminar(13);
//         ser.eliminar(14);
//         ser.eliminar(15);

//Modificar un usuario por id
         
         ser.modificar(13, new Usuario("Pacojonesnew", "usuariomodificado@user", 22, "contraseñanueva"));
           assertEquals("Pacojonesnew", ser.leer(13).getNombre());
         
    }
    
}
