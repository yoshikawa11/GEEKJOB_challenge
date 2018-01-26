<%-- 
    Document   : challenge8-1
    Created on : 2018/01/26, 14:37:42
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
            
            long num = 1;
            for(int i = 1; i<=20; i++){
                num = num * 8;
            }
            
            out.print(num);
            
            
            %></h1>
    </body>
</html>
