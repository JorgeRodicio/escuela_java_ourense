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
    public void crear(Usuario usuario) {
        listUsuarios.add(usuario);
    }
    
    public void crear(String nombre, int edad) {
        listUsuarios.add(new Usuario(nombre, edad));
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
    public void modificar(int index, Usuario objeto) throws Exception {
        listUsuarios.set(index, objeto);
    }
    
    
    

    
    

    
    
}
