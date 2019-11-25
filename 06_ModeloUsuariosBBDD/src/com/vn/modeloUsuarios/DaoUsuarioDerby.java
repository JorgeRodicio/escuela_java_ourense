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
            
//                String sqlQuery = "insert into persona (nombre, email) values (?,?)";
//                PreparedStatement sentenciaSQL = con.createStatement();
//                sentenciaSQL.executeUpdate(sqlQuery);

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario modificar(int id, Usuario objConDatosNuevos) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
