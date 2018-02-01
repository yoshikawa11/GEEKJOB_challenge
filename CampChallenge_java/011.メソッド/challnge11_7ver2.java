
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
public class challnge11_7ver2 extends HttpServlet {

    String[] dataB(String ID) {
        switch (ID) {
            case "AABBCC":
                String[] info1 = {"AABBCC", "鈴木鈴木", "1970/01/01", "大阪市"};
                return info1;
            case "BBCCDD":
                String[] info2 = {"BBCCDD", "佐藤佐藤", "1980/02/02", null};

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

            int i = 0;
            int j = 0;
            int k = 0;
            
            
            String[] DATA1 = dataB("AABBCC");
            for (int L = 0; L <= 3; L++) {

                if (DATA1[i] == null) {
                    i = i + 1;
                    continue;
                } else {
                    out.println(DATA1[i]+"<br>");
                }
                i = i + 1;
            }
           
            String[] DATA2 = dataB("BBCCDD");
            for (int M = 0; M <= 3; M++) {
                
                if (DATA2[j] == null) {
                    j = j + 1;
                    continue;
                } else {
                    out.println(DATA2[j]+"<br>");
                }
                j = j + 1;

            }
                   
            String[] DATA3 = dataB("CCDDEE");
            for (int P = 0; P <= 3; P++) {
                if (DATA3[k] == null) {
                    k = k + 1;
                    continue;
                } else {
                    out.println(DATA3[k]+"<br>");
                }
                k = k + 1;

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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>
    
}

