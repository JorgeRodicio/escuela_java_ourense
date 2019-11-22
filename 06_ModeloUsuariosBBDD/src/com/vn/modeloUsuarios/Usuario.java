/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.modeloUsuarios;

/**
 *
 * @author pc
 */
public class Usuario {
    private String nombre;
    private String email;
    private int edad;
    private String password;
    private int id;

    public Usuario(String nombre, String email, int edad, String password) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.password = password;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
}
