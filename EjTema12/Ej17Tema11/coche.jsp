<%-- 
    Document   : coche
    Created on : 17-feb-2020, 9:17:07
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
        <%  String color = request.getParameter("color");
            String material = request.getParameter("material");
            
            String imagen = color + material + ".jpg";
        %>
        <img src="<% out.print(imagen);%>">
        
    </body>
</html>
