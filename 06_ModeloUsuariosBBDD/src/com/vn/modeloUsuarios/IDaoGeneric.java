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
    
    /**
     * Método para crear un objeto e insertarlo en la BBDD
     * @param objeto
     * @return
     * @throws Exception 
     */
    public abstract T crear(T objeto ) throws Exception;

    /**
     * Leer un objeto de la BBDD con el id que le pasas al método
     * @param id
     * @return 
     */
    T leer(int id);
    
    /**
     * Método que devuelve la lista de todos los usuarios de la base de datos
     * @return 
     */
    List<T> leer();

    /**
     * Método para modificar un objeto con los datos que contiene el objeto que se pasa por parámetro
     * @param id
     * @param objConDatosNuevos
     * @return
     * @throws Exception 
     */
    T modificar(int id, T objConDatosNuevos) throws Exception;

    /**
     * Método para eliminar un objeto con id que le pasas por parámetro al método
     * @param id
     * @throws Exception 
     */
    void eliminar(int id) throws Exception;

}
