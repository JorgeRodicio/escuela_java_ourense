/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.vehiculos.Coche;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DaoUsuarioList implements IDaoUsuario{
    
    private List<Usuario> listUsuarios;
    
    public DaoUsuarioList(){
        this.listUsuarios = new ArrayList<>();
    }
      
    @Override
    public Usuario crear(Usuario usuario) throws Exception{
        listUsuarios.add(usuario);
        return usuario;
    }
    
    public Usuario crear(String nombre, int edad) throws Exception{
        return crear(new Usuario(nombre, edad));
    }
    
    @Override
    public Usuario obtenerPorIndice(int index) {
         return listUsuarios.get(index);
    }

    @Override
    public Usuario obtenerPorNombre(String nombre) {
         for (Usuario user : listUsuarios) {
            if(user.getNombre() == nombre){
                return user;
            }
        }
        return null;
    }

    @Override
    public Usuario modificar(int index, Usuario usuario) throws Exception {
        Usuario u = this.listUsuarios.get(index);
        u.setEdad(usuario.getEdad());
        u.setNombre(usuario.getNombre());
        
        return u;
    }

    @Override
    public void eliminar(int index) {
        listUsuarios.remove(index);
    }

    @Override
    public void eliminar(Usuario usuario) {
        listUsuarios.remove(usuario);
    }
    
    
    

    
    

    
    
}
