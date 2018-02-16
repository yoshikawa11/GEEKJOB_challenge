<%-- 
    Document   : challenge16_5
    Created on : 2018/02/16, 11:03:16
    Author     : masashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>素因数分解</title>
    </head>
    <body>
        <h1><%@page import="java.util.ArrayList"%>
            <%
            request.setCharacterEncoding("UTF-8");
            
            int soinsu = Integer.parseInt(request.getParameter("numberCheck"));
            int soinsu1 = Integer.parseInt(request.getParameter("numberCheck"));
           
            ArrayList<Integer> data = new ArrayList<Integer>();
//            data = null;
            
            while(1<soinsu&&soinsu%2 == 0){
                data.add(2);
                soinsu = soinsu/2;
            }
            
            for(int i = 3; i<=9; i+=2){
                while(soinsu%i == 0){
                data.add(i);
                soinsu=soinsu/i;
                }
               }
               int amari= soinsu;
               
               if(amari == 1){
                   String zyousan = "";
                   
                   for(int j = 1; j<data.size();j++){
                       zyousan = zyousan+"*"+data.get(j);
                   }        
               out.print("「"+soinsu1+"="+data.get(0)+zyousan+"」");     
               }else if(amari != 1&&data.size()== 0){
               out.print("「"+soinsu1+"="+"あまり"+amari+"」");     //例３
               }
               else{
                   String kakezan = "";
                   for(int k = 1; k<data.size();k++){
                       kakezan = kakezan+"*"+data.get(k);
                   }
              out.print("「"+soinsu1+"="+data.get(0)+kakezan+"あまり"+amari+"」");     // 例２       
               
               }

            %></h1>
    </body>
</html>
