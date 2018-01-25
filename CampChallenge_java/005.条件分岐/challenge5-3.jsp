<%-- 
    Document   : challenge5-3
    Created on : 2018/01/25, 18:29:46
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
            char box = 'C' ;
            
            switch(box){
                case 'A':
                out.print("英語");
                break;
                
                case 'あ':
                out.print("日本語");
                break;
                
            }
            
            %> <h1>
    </body>
</html>
