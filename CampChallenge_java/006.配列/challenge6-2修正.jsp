<%-- 
    Document   : challenge6-2修正
    Created on : 2018/01/26, 14:07:46
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
        <h1><%@ page import = "java.util.ArrayList"%>
             <%
                 
             ArrayList<String> data = new ArrayList<String>();
             
            data.add("10");
            data.add("100");
            data.add("soeda");
            data.add("hayashi");
            data.add("-20");
            data.add("118");
            data.add("END");
            data.set(2,"33");

            %></h1>
    </body>
</html>
