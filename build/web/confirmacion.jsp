<%-- 
    Document   : confirmacion
    Created on : 15-dic-2020, 19:28:33
    Author     : Fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos ingresados :</h1>
        
        <p>Nombre : <%=session.getAttribute("nombre")%></p>
        <p>Apellido : <%=session.getAttribute("apellido")%></p>
        
    </body>
</html>
