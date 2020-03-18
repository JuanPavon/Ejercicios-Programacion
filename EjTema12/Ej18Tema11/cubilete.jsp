<%-- 
    Document   : cubilete
    Created on : 17-feb-2020, 9:49:35
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int bola = (int)(Math.random()*3);
            int intento = Integer.parseInt(request.getParameter("cubo"));
            
            if(bola == intento){
            %><img src="cubilete_con_1bola.png">
            <p>¡Has ganado!</p>
            <%} else {
            %><img src="cubilete_sin_bola.png">
            <p>Has perdido</p>
            <%}
        %>
    </body>
</html>
