

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
 <%
            request.setCharacterEncoding("UTF-8");

            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            String name1 = request.getParameter("txtName");

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "masashi", "1192");
                db_st = db_con.prepareStatement("select * from profiles where name like '%" + name1 + "%'");

                db_data = db_st.executeQuery();
               
                if(db_data.next()){
                    
                    db_data.beforeFirst();
                     while (db_data.next()) {

                    out.println(db_data.getString("profilesID") + "<br>");
                    out.println(db_data.getString("name") + "<br>");
                    out.println(db_data.getString("tel") + "<br>");
                    out.println(db_data.getString("age") + "<br>");
                    out.println(db_data.getString("birthday") + "<br>");
                }
                    
                }else{
                out.print("該当するものはありません");
                }   
            //db_data.beforeFirst();
                
            } catch (SQLException e_sql) {
                out.println("接続時にエラーとなりました:" + e_sql.toString());
            } catch (Exception e) {
                out.println(e);
            } finally {
                if (db_con != null) {
                    try {
                        db_con.close();
                        db_st.close();
                        db_data.close();
                        System.out.println("close");
                    } catch (Exception e) {
                        System.out.println("close error");
                    }
                }
            }
            
            %></h1>
    </body>
</html>
