/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

/**
 *
 * @author pc
 */
public interface IGenericDao<T>  {
    
    public void crear(T objeto) throws Exception;
    
    public T obtenerPorIndice(int index);
    
    void modificar(int index, T objeto) throws Exception;
}
