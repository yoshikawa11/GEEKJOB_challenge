<%-- 
    Document   : challenge7-1
    Created on : 2018/01/26, 14:18:33
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
        <h1><%@page import = "java.util.HashMap" %>
            <%
            
           HashMap<String,String> box = new HashMap<String,String>();
            
            box.put("1","AAA");
            box.put("hello","world");
            box.put("soeda","30");
            box.put("20","20");
            
            %>    </h1>
    </body>
</html>
