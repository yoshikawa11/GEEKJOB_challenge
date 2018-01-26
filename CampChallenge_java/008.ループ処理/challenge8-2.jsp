<%-- 
    Document   : challenge8-2
    Created on : 2018/01/26, 16:06:22
    Author     : masashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            
             String str = "A";
             for(int i = 0; i <= 28; i ++){
             str = str + "A"; 
             }
            
             out.print(str);

            %></h1>
    </body>
</html>
