

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

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

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge18_13", "masashi", "1192");
                db_st = db_con.prepareStatement("insert into productionData values(?, ?)");
                db_st.setInt(1,Integer.parseInt(request.getParameter("inputProID")));
                db_st.setString(2, request.getParameter("inputProName"));

                int zikko = db_st.executeUpdate();
   
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
