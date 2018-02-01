
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class challenge11_6 extends HttpServlet {

    String[] dataB(String ID) {

        if (null == ID) {
            String[] nothing = {"該当なし"};
            return nothing;
        } else switch (ID) {
            case "AABBCC":
                String[] info1 = {"AABBCC", "鈴木鈴木", "1970/01/01", "大阪市"};
                return info1;
            case "BBCCDD":
                String[] info2 = {"BBCCDD", "佐藤佐藤", "1980/02/02", "名古屋市"};
                
                return info2;
            case "CCDDEE":
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
            
            String ID = "CCDDEE";
            switch (ID) {
                case "AABBCC":
                    String[]A = dataB("AABBCC");
                    out.println(A[1]+ A[2]+ A[3]);
                    break;
                case "BBCCDD":
                    String[] B = dataB("BBCCDD");
                    out.print(B[1]+B[2]+B[3]);
                    break;
                case "CCDDEE":
                    String[] C = dataB("CCDDEE");
                    out.print(C[1]+C[2]+C[3]);
                    break;
                default:
                    break;
            }
out.print("該当なし");
            
            

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
