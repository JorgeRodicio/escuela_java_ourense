/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.modeloUsuarios;

import java.util.List;

/**
 *
 * @author pc
 */
public interface IDaoGeneric<T> {

    public abstract T crear(T objeto ) throws Exception;

    T leer(int id);
    
    List<T> leer();

    T modificar(int id, T objConDatosNuevos) throws Exception;

    void eliminar(int id) throws Exception;

}
