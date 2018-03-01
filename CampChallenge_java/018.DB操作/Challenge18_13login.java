
package DB_assignment;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


public class Challenge18_13login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            
            request.setCharacterEncoding("UTF-8");

            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            String name1 = request.getParameter("txtName");
            String aa = request.getParameter("txtID");
            int ID1 = Integer.parseInt(aa);

            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge18_13", "masashi", "1192");
                db_st = db_con.prepareStatement("select * from userData where name = ? and userID =?");
                db_st.setString(1, name1);
                db_st.setInt(2, ID1);
                db_data = db_st.executeQuery();
                
                if(db_data != null){
                   session.setAttribute("loginUser", name1);
                }else{
                    System.out.println("ログイン失敗");
                }
                String result = "WEB-INF/userpage.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(result);
                rd.forward(request, response);
                
            } catch (SQLException e_sql) {
                System.out.println("接続時にエラーとなりました:" + e_sql.toString());
            } catch (Exception e) {
                System.out.println(e);
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
            
            
         
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
