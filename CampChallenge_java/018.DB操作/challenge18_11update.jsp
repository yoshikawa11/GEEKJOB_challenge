

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            request.setCharacterEncoding("UTF-8");
            
            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db", "masashi", "1192");
                
                String aa = request.getParameter("txtprofilesID");
                int ID = Integer.parseInt(aa);
                
                db_st = db_con.prepareStatement("update profiles set name =?, tel =?, age = ?, birthday = ? where +"
                        + "profilesID = "+ ID +"");
                
                db_st.setString(1, request.getParameter("txtName"));
                db_st.setString(2, request.getParameter("txttel"));
                db_st.setString(3, request.getParameter("txtage"));
                db_st.setString(4, request.getParameter("txtbirthday"));
                
                int zikko = db_st.executeUpdate();
                
                db_st = db_con.prepareStatement("select * from profiles");
                db_data = db_st.executeQuery();
                
                while(db_data.next()){
                    out.println(db_data.getString("profilesID") + "<br>");
                    out.println(db_data.getString("name") + "<br>");
                    out.println(db_data.getString("tel") + "<br>");
                    out.println(db_data.getString("age") + "<br>");
                    out.println(db_data.getString("birthday") + "<br>");
                }
                
                
                
            }catch(SQLException e_sql){
                out.println("接続時にエラーとなりました:" + e_sql.toString());
            }catch(Exception e){
                System.out.print(e);
            }finally{
                try{
                if(db_con != null){
                db_con.close();
                db_st.close();
                db_data.close();
                System.out.println("close");
                }
                }catch(Exception e){
                System.out.println("close error");
                       }
            }
            
            
            
            
            
            %></h1>
    </body>
</html>
