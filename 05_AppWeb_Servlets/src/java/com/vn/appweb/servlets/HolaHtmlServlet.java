package com.vn.appweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Servlet que genera una respuesta en formato HTML
 *
 * @author pc
 */
public class HolaHtmlServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException{
        //Definimos el tipo de contenido según los tipos MIME
        //Formatos conocidos de ficheros para emails
        respuesta.setContentType("text/html;charset=UTF-8");
        try(PrintWriter salida = respuesta.getWriter())
        { 
            salida.print("<html>");
            salida.print("<head>");
            salida.print("<link rel=\"stylesheet\" href=\"./holacss\"/>");
            salida.print("<title>Web HTML desde Servlet</title>");
            salida.print("</head>");
            salida.print("<body>"
                    + "<h1>Web HTML desde Servlet</h1>"
                    + "<h2 class='color-rojo'>Hola que pasa</h2>"
                    + "<ul>");
            for (int i = 0; i < 10; i++) {
                salida.print("<li class='tam_letra_" + i +"'> Iteracion " + i + "</li>");
            }
            salida.print("</ul>");
            salida.println("Ruta: " + peticion.getContextPath());
            salida.println("<br>Método: " + peticion.getMethod());
            
            salida.print("</body>");
            salida.print("</html>");  
        }
        
        //salida.close(); Try se encarga de cerrar
    }
}
