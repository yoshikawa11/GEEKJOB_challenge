<%-- 
    Document   : challenge16_4
    Created on : 2018/02/15, 16:43:44
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
            request.setCharacterEncoding("UTF-8");
            
            if(request.getParameter("type").equals("1")){
                out.print("商品は雑貨になります"+"<br>");
            }else if(request.getParameter("type").equals("2")){
                out.print("商品は生鮮食品になります"+"<br>");
            }else{
                out.print("商品はその他になります"+"<br>");
            }
            
            int sougaku = Integer.parseInt(request.getParameter("total"));
            int souryou = Integer.parseInt(request.getParameter("count"));
            int tanka = sougaku/souryou;
            out.print("単価は"+tanka+"となります"+"<br>");
            
            double point = 0;
            if(sougaku<3000){
                out.print("今回のポイントは0ポイントです"+"<br>");
            }else if(3000<= sougaku && sougaku < 5000){
                point = sougaku*0.04;
                out.print("今回のポイントは"+point+"ポイントです"+"<br>");
            }else{
                point = sougaku*0.05;
                out.print("今回のポイントは"+point+"ポイントです"+"<br>");
            }
            
            
            

            

            
            %></h1>
    </body>
</html>
