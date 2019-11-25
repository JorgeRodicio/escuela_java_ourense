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

    /**
     * Constructor del DAO en el que se carga la BBDD
     */
    public DaoUsuarioDerby(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            //Logger.getLogger(ParamServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha cargado DerbyDB");
        }       
    }
    
    /**
     * Método para insertar un usuario en la BBDD
     * @param usuario
     * @return
     * @throws Exception 
     */
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

    /**
     * Leer un usuario de la BBDD mediante el id
     * @param id
     * @return 
     */
    @Override
    public Usuario leer(int id) {
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age, id FROM USUARIO WHERE id = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, Integer.toString(id));
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String email = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                int idUser = Integer.parseInt(usu.getString(4));
                Usuario usuario = new Usuario(nombre, email, edad, password, idUser);
                return usuario;
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return null;
    }
    
    /**
     * Leer un usuario de la BDD mediante el email
     * @param email
     * @return 
     */
    public Usuario leer(String email) {
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
                       
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age, id FROM USUARIO WHERE email = ?";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String mail = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                String id = usu.getString(5);
                Usuario usuario = new Usuario(nombre, mail, edad, password, Integer.parseInt(id));
                return usuario;
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return null;
    }
    
    /**
     * Obtener todos los usuarios de la BBDD
     * @return 
     */
    @Override
    public List<Usuario> leer() {
        ArrayList<Usuario> lista = new ArrayList<>();
        
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
             
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age, id FROM USUARIO";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String email = usu.getString(1);
                String password = usu.getString(2);
                String nombre = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                int id = Integer.parseInt(usu.getString(4));
                Usuario usuario = new Usuario(nombre, email, edad, password, id);
                lista.add(usuario);
            }
                                                                             
        }catch(SQLException ex){   
            
        } 
        return lista;
    }
    
    /**
     * Obtener todos los usuarios de la BBDD con algun nombre parecido al que le pasas por parámetro
     * @param nombre
     * @return 
     */
    public List<Usuario> leerPorNombre(String nombre) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        try(Connection con = DriverManager.getConnection(      
            "jdbc:derby://localhost:1527/db_usuarios",
            "root",
            "1234")){
            
            
            //String sqlQuery = "SELECT nombre, email FROM persona WHERE nombre = ?";
            String sqlQuery = "SELECT email, password, nombre, age, id FROM usuario WHERE TRIM(UPPER(nombre)) LIKE ? ESCAPE '!'";
            //Sentencia preparada para evitar SQL injection
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            nombre = nombre.toUpperCase().trim();
            nombre = nombre.replace("%", "!%");
            sentenciaSQL.setString(1, "%" + nombre + "%"); 
            
            ResultSet usu = sentenciaSQL.executeQuery();
            
            while(usu.next()){
                String mail = usu.getString(1);
                String password = usu.getString(2);
                String nombreUser = usu.getString(3);
                int edad = Integer.parseInt(usu.getString(4));
                String id = usu.getString(5);
                Usuario usuario = new Usuario(nombreUser, mail, edad, password, Integer.parseInt(id));
                
                listaUsuarios.add(usuario);
                
            }
            return listaUsuarios;
                                                                             
        }catch(SQLException ex){   
            
        } 
        return null;
    }

    /**
     * Modificar el usuario de la BBDD mediante su id con los datos del objeto que se pasa como parámetro
     * @param id
     * @param usuario
     * @return
     * @throws Exception 
     */
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
