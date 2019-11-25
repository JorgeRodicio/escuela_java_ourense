/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.modeloUsuarios;

import java.sql.DriverManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class DaoUsuarioDerby implements IDaoGeneric<Usuario>{

    public DaoUsuarioDerby(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            //Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha cargado DerbyDB");
        }       
    }
    
    @Override
    public Usuario crear(Usuario usuario) throws Exception {
                 
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "INSERT INTO USUARIO(email, password, nombre, age) VALUES(?,?,?,?)";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            
            String email = usuario.getEmail();
            String password = usuario.getPassword();
            String nombre = usuario.getNombre();
            String edad = Integer.toString(usuario.getEdad());
            
            sentenciaSQL.setString(1, email); 
            sentenciaSQL.setString(2, password); 
            sentenciaSQL.setString(3, nombre); 
            sentenciaSQL.setString(4, edad); 
            sentenciaSQL.executeUpdate();
                                   
            return usuario;              

        }catch(SQLException ex){   
            
        } 
        
        return null;
    }

    @Override
    public Usuario leer(int id) {
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age FROM USUARIO WHERE id = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, Integer.toString(id));
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String email = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                Usuario usuario = new Usuario(nombre, email, edad, password);
                return usuario;
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return null;
    }
    
    
    public Usuario leer(String email) {
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age FROM USUARIO WHERE email = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String mail = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                Usuario usuario = new Usuario(nombre, mail, edad, password);
                return usuario;
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return null;
    }

    @Override
    public List<Usuario> leer() {
        ArrayList<Usuario> lista = new ArrayList<>();
        
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
             
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age FROM USUARIO";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String email = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                Usuario usuario = new Usuario(nombre, email, edad, password);
                lista.add(usuario);
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return lista;
    }

    @Override
    public Usuario modificar(int id, Usuario usuario) throws Exception {
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            

            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "UPDATE USUARIO SET email = ? ,password = ? ,nombre = ? ,age = ? WHERE id = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            
            String email = usuario.getEmail();
            String password = usuario.getPassword();
            String nombre = usuario.getNombre();
            String edad = Integer.toString(usuario.getEdad());
            String id2 = Integer.toString(id);
            
            sentenciaSQL.setString(1, email); 
            sentenciaSQL.setString(2, password); 
            sentenciaSQL.setString(3, nombre); 
            sentenciaSQL.setString(4, edad); 
            sentenciaSQL.setString(5, id2);
            sentenciaSQL.executeUpdate();
                                   
            return usuario;              

        }catch(SQLException ex){   
            
        } 
        
        return null;
  }

    @Override
    public void eliminar(int id) throws Exception {

          try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "DELETE FROM USUARIO WHERE id = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, Integer.toString(id));
                     
            sentenciaSQL.executeUpdate();
                                                                             
        }catch(SQLException ex){   
            
        } 
        
        
    }
    
}
