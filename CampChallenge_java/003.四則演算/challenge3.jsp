<%-- 
    Document   : challenge2
    Created on : 2018/01/25, 16:59:07
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
            final int base = 250;
            int num = 10;
            
            out.print(base + num+"<br>");
            out.print(base - num+"<br>");
            out.print(base * num+"<br>");
            out.print(base/ num+"<br>");
            out.print(base % num+"<br>");
            %></h1>
    </body>
</html>
