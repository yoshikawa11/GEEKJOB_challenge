<%-- 
    Document   : challenge5-2
    Created on : 2018/01/25, 18:16:22
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
            int num = 5 ;
            
            switch(num){
                case 1:
                out.print("one");
                break;
                
                case 2:
                out.print("two");
                break;
                
                default:
                out.print("想定外");
                break;
            }
            
            
            %></h1>
    </body>
</html>
