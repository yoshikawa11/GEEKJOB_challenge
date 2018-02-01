
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author masashi
 */
public class Challenge11_8 extends HttpServlet {

    String[] getUserData(int pattern) {
        switch (pattern) {
            case 1:
                String[] info1 = {"AABBCC", "鈴木鈴木", "1970/01/01", "大阪市"};
                return info1;
            case 2:
                String[] info2 = {"BBCCDD", "佐藤佐藤", "1980/02/02", null};

                return info2;
            case 3:
                String[] info3 = {"CCDDEE", "村田村田", "1990/03/03", "神戸市"};
                return info3;
            default:
                String[] nothing = {"該当なし"};
                return nothing;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Integer limit = 2;
            for (int i = 1; i <= limit; i++) {

                for (int j = 1; j < 4; j++) {

                    String[] userData = getUserData(i);
                    if (userData[j] == null) {
                        j = j + 1;
                        continue;

                    } else {
                        out.println(userData[j] + "<br>");
                        
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
