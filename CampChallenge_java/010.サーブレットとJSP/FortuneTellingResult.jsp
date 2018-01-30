<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/01/30, 14:51:57
    Author     : masashi
--%>
<%@page import = "org.mypackage.challenge.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><%
        ResultData data = (ResultData)request.getAttribute("DATA");
        
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            
        if (data!= null){
            out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getluck()+"です！</h1>");
            }
            
            %></h1>
    </body>
</html>
