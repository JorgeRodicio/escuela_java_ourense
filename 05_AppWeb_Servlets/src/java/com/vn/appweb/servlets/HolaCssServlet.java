/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
public class HolaCssServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        //Definimos el tipo de contenido según los tipos MIME
        //Formatos conocidos de ficheros para emails
        respuesta.setContentType("text/css;charset=UTF-8");
        try(PrintWriter salida = respuesta.getWriter())
        { 
            salida.print(".color-rojo{\n" +
            "    background-color: red;\n" +
            "}");
            
            
            for (int i = 0; i < 10; i++) {
                int tamaño = i + 20;
                salida.print(".tam_letra_" + i +"{\n" +
            "    font-size: " +tamaño+" \n" +
            "}");
            }
            
        }
        
        //salida.close(); Try se encarga de cerrar
    }
}
