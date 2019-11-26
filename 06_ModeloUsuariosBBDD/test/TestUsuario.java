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
   
//    @Test
//    public void crearUsuarioInvalidos() throws Exception {
//      ServicioUsuarios ser = new ServicioUsuarios();
//      
//      //Error con email
//      assertEquals(null, ser.crear("a", "abc123", "Paquito", "24"));
//      //Error con nombre
//      assertEquals(null, ser.crear("asdas@jsad", "12312342", "a", "23"));
//      //Error contraseña
//      assertEquals(null, ser.crear("sads@dsajd", "as", "Fasdadds", "56"));
//      //Error edad
//      assertEquals(null, ser.crear("sdasda@sads", "12312343", "Mandaloriano", "10"));
//      //Todos error
//      assertEquals(null, ser.crear("a", "a", "a", "9"));
//         
//    }
//    
//    @Test
//    public void crearUsuarioValidos() throws Exception {
//         ServicioUsuarios ser = new ServicioUsuarios();
//         
//         //Crear 5 usuarios
////        ser.crear("usuario1@user", "abc1234", "Mandaloriano", "34");
////        ser.crear("usuario2@user", "abc1234", "Manolito", "13");
////        ser.crear("usuario3@user", "abc123421342", "Pacojones", "78");
////        ser.crear("usuario4@user", "abc123342", "Nanonaino", "56");
////        ser.crear("usuario5@user", "abc123142", "Hasancito", "15");
//        
//         
//         
//         //comprobar
//        assertEquals("Mandaloriano", ser.leer(15).getNombre());      
//    }
    
    @Test
    public void modificarUsuariosValidos() throws Exception {
        ServicioUsuarios ser = new ServicioUsuarios();
        
        //Modificar nombre
        Usuario obj = ser.crear("email@email.com", "1234567", "Nombre", "20");
        Usuario obj2 = new Usuario("Nnnnnnnnnnnnnnnn","email@email.com" , 20, "1234567", obj.getId());  
        ser.modificar(obj2);
        assertEquals("Nnnnnnnnnnnnnnnn", ser.leer(obj2.getId()).getNombre());
        
        //Email
        obj2 = new Usuario("Nombre","email@email.com" , 20, "1234567", obj.getId());  
        ser.modificar(obj2);
        assertEquals("email@email.com", ser.leer(obj2.getId()).getEmail());
        
        //Edad
        obj2 = new Usuario("Nombre","email@email.com" , 30, "1234567", obj.getId());  
        ser.modificar(obj2);
        assertEquals(30, ser.leer(obj2.getId()).getEdad());
        
        //Password
        obj2 = new Usuario("Nombre","email@email.com" , 30, "12345678911111111", obj.getId());  
        ser.modificar(obj2);
        assertEquals("12345678911111111", ser.leer(obj2.getId()).getPassword());
    }
    
    
//    @Test
//    public void modificarUsuariosInvalidos() throws Exception {
//        ServicioUsuarios ser = new ServicioUsuarios();
//        //Nombre incorrecto
//        Usuario obj = new Usuario("n", "email@email", 20, "123454");
//        String nombre = ser.leer(5).getNombre();
//        ser.modificar(5, obj);   
//        assertEquals(nombre, ser.leer(5).getNombre());    
//        
//        //Email incorecto
//        obj = new Usuario("nombre", "e", 20, "123454");
//        String email = ser.leer(5).getEmail();
//        ser.modificar(5, obj);   
//        assertEquals(email, ser.leer(5).getEmail()); 
//        
//        //Edad incorrecta
//        obj = new Usuario("nombre", "email@emaaaaaaail", -1, "123454");
//        int edad = ser.leer(5).getEdad();
//        ser.modificar(5, obj);   
//        assertEquals(edad, ser.leer(5).getEdad()); 
//        
//        //Password incorrecta
//        obj = new Usuario("AAAAAAAA", "AAAAAAAA@AAAAAAAAAA", 20, "1");
//        String password = ser.leer(5).getPassword();
//        ser.modificar(5, obj);   
//        assertEquals("1234", ser.leer(5).getPassword()); 
//    }
    
//    @Test
//    public void eliminarUsuariosValidos() throws Exception {
//        ServicioUsuarios ser = new ServicioUsuarios();
//        Usuario user = ser.leer(1);
//        assertEquals(ser.leer(1), ser.eliminar(1));
//        
//    }
    
    
  
       @Test
    public void CrearUsuarioValidos() throws Exception {
         ServicioUsuarios ser = new ServicioUsuarios();
         
      //   Crear 5 usuarios
         ser.crear("usuario1@user", "abc1234", "Mandaloriano", "34");
         ser.crear("usuario2@user", "abc1234", "Manolito", "13");
         ser.crear("usuario3@user", "abc123421342", "Pacojones", "78");
         ser.crear("usuario4@user", "abc123342", "Nanonaino", "56");
         ser.crear("usuario5@user", "abc123142", "Hasancito", "15");
         
         
            //comprobar
           assertEquals("Mandaloriano", ser.leer(126).getNombre());
           ser.crear("user1@asdxzc", "1231231", "Prueba", "23");
           ser.crear("user2@asdxzcz", "1231231", "Prueba", "23");
           ser.crear("user3@asdxzcz", "1231231", "Prueba", "23");
           assertEquals(3, ser.leerPorNombre("Prueba").size());
           
     

//Modificar un usuario por id
         
         
         
    }
       
    
      @Test
    public void EliminarUsuarios() throws Exception {
         ServicioUsuarios ser = new ServicioUsuarios();
        //Eliminar usuarios creados
         ser.eliminar(4);
         ser.eliminar(10);
         ser.eliminar(11);
         ser.eliminar(12);
         ser.eliminar(13);
         ser.eliminar(14);
         ser.eliminar(15);
         ser.eliminar(16);
         ser.eliminar(17);
         ser.eliminar(18);
         ser.eliminar(19);
         ser.eliminar(20);
         ser.eliminar(21);
         ser.eliminar(22);
         ser.eliminar(23);
    }

    
}
