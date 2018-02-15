

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            request.setCharacterEncoding("UTF-8");
            
            out.print(request.getParameter("txtName") + "<br>");
            if(request.getParameter("rdomale")!=null){
                out.print(request.getParameter("rdomale") + "<br>");
            }else{
                out.print(request.getParameter("rdofemale") + "<br>");
            }
            out.print(request.getParameter("hobby") + "<br>");
            
//aiueo<br>aiueo
            %></h1>      
    </body>
</html>
