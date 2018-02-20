

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フォーム</title>
    </head>
    <body>
        <h1>
            
            <%
                //三項演算子
                /*String name = (String) session.getAttribute("txtName") == null ? "" 
                            : (String) session.getAttribute("txtName");*/
                   HttpSession hs = request.getSession(); 
            String name = (String) hs.getAttribute("Name");
            String namae = "";
            if (name == null) {
                namae = "";
            }else if(name != null){
            namae = name;
            }
            hs.setAttribute("gender",request.getParameter("Gender"));
            String gender2="";
            gender2=String.valueOf(hs.getAttribute("gender"));
            String gender = (String) hs.getAttribute("Gender");
            String genderMan = "";
            
//            String gender2 = (String) hs.getAttribute("Gender");
            String genderWoman = "";
//            if(gender2 == null){
//                gender2="";
//            }
            if (gender.equals("女性")) {
                
            }
            
                
            
             String hobby = (String) hs.getAttribute("Hobby");
            String syumi = "";
            if (hobby == null) {
                syumi = "";
            }else if(hobby != null){
            syumi = hobby;
            }

            %>

            <form action="/challenge16/Challenge16_8"
                  method="post">
                あなたの名前を入力してください<br>
                <input type="text" name="txtName" value="<%= namae %>"><br>
                あなたの性別を入力してください<br>
                <% if(gender.equals("null")){ %>
                    
                <input type="radio" name ="rdoGender" value="男性" <%= genderMan %>>男性
                <input type="radio" name ="rdoGender" value ="女性"<%= genderWoman %>>女性<br>
        <% }else{ %>
        <input type="radio" name ="rdoGender" value="man" <% if(gender.equals("man")){%>checked=""<%}%> >男性
                <input type="radio" name ="rdoGender" value ="woman"<% if(gender.equals("woman")){%>checked=""<%}%>>女性<br>
                
                <%}%>
                趣味を記入してください<br>
                 <input type="text" name="hobby" value="<%= syumi %>"><br>
<!--                <textarea name="hobby" value="<%= syumi %>"></textarea><br>-->
                <br>
                <input type="submit" name ="btnSubmit">


            </form></h1>
    </body>
</html>
