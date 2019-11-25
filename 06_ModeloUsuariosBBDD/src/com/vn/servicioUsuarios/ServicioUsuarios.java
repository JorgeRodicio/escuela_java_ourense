/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.servicioUsuarios;

import com.vn.modeloUsuarios.DaoUsuarioDerby;
import com.vn.modeloUsuarios.IDaoGeneric;
import com.vn.modeloUsuarios.Usuario;
import java.util.List;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import jdk.nashorn.internal.runtime.regexp.RegExp;

/**
 *
 * @author pc
 */
public class ServicioUsuarios {
    private DaoUsuarioDerby dao;
    
    public ServicioUsuarios(){
        dao = new DaoUsuarioDerby();
    }
    
    private boolean validarDatos(String email, String password, String nombre, String edad){
        
        if (dao.leer(email) == null){
            System.err.println("ERROR: EMAIL EXISTENTE");
            return false;
        }
        
        String regExpEmail = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";
                      
        if(email.length() <= 1 || !email.matches(regExpEmail)){
            System.err.println("ERROR: EMAIL INVÁLIDO");
            return false;
        }
        
        if(password.length() < 4){
            System.err.println("ERROR: PASSWORD INVÁLIDA");
            return false;
        }
        
        String regExpNombre = "^([A-Z]{1}[a-zñáéíóú]+[\\s]*)+$";
        if(nombre.length() <= 1 || !nombre.matches(regExpNombre)){
            System.err.println("ERROR: NOMBRE INVÁLIDO");
            return false;
        }
        
        if(Integer.parseInt(edad) <= 12 ){
            System.err.println("ERROR: EDAD INVÁLIDA");
            return false;
        }
        
        return true;
        
    }
       
    
    public Usuario crear(String email, String password, String nombre, String edad) throws Exception {
        if (validarDatos(email, password, nombre, edad)){
            int edadInt = Integer.parseInt(edad);
            Usuario usuario = new Usuario(nombre, email, edadInt, password);
            dao.crear(usuario);
            return dao.leer(email);
        }else{
            return null;
        }
    }

    
    public Usuario leer(int id) {
        return dao.leer(id);
    }

   
    public List<Usuario> leer() {
        return dao.leer();
    }
    
    
    public List<Usuario> leerPorNombre(String nombre) {
        
        if("".equals(nombre)){
            return dao.leer();
        }else{
            return dao.leerPorNombre(nombre);
        }
        
    }
    
//    public Usuario modificar(int id, Usuario objConDatosNuevos) throws Exception {
//        String email = objConDatosNuevos.getEmail();
//        String password = objConDatosNuevos.getPassword();
//        String nombre = objConDatosNuevos.getNombre();
//        String edad = Integer.toString(objConDatosNuevos.getEdad());
//        
//    }

    
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
