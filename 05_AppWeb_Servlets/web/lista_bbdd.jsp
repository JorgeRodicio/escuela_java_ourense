<%-- 
    Document   : lista_bbdd
    Created on : 22-nov-2019, 11:24:12
    Author     : pc
--%>

<%@page import="com.vn.appweb.modelo.ConsultaSQL"%>
<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.modelo.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado JSP con Derby DB</title>
    </head>
    <body>
        <h1>Listado JSP con Derby DB</h1>
        <% 
            out.println("<p>Hola desde Java en URL " + request.getContextPath() + "</p>");
            
        %>
        <br>
        <ul>
        <%
            for (int i = 0; i < 10; i++) {          
        %>
            <li> Número <%= i %></li>
            
        <% }
            
            
            ConsultaSQL conSQL = new ConsultaSQL();
            String nombre = request.getParameter("nombre_busq");
            List<DatosPersona> listaPer = conSQL.leerTabla(nombre);

        %>
        
        <form name="form_busq" action="./lista_bbdd.jsp" method="GET">
            <input name="nombre_busq" type="text" placeholder="Inserta el nombre de busqueda" size="50"/>
            <input type="submit" value="Buscar por nombre"/>
        </form>
        
        
        <% 
            
        %>
                     
        </ul>
        
        <table>
            <thead>
                <th>Nombre</th>
                <th>Email</th>
            </thead>
            
                <% 
                    for (DatosPersona dp : listaPer) { %>
                    <tr>    
                        <td><%=dp.getNombre()%></td>
                        <td><%=dp.getEmail()%></td>  
                    </tr>
                <%}%>
                
            
        </table>
    </body>
</html>
