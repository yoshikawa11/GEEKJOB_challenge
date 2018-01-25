<%-- 
    Document   : challenge1-2
    Created on : 2018/01/25, 14:41:39
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
        <h1>
        <%
        String name = "吉川将司";
        int age = 23;
        String hobby = "読書と映画、ビリヤード";
        String last = "よろしくお願いします。";
        
        out.print("私は"+name+"と申します。<br>");
        out.print(age+"歳になります。<br>");
        out.print("私の趣味は"+hobby+"になります。<br>");
        out.print(last);
        %></h1>
    </body>
</html>
