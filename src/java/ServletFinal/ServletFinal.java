
package ServletFinal;
import Logica.Plantilla;
import Logica.Jugador;
import Logica.AdivinanzaHuevo;
import Logica.AdivinanzaArbol;
import Logica.AdivinanzaArcoIris;
import Logica.AdivinanzaHorizonte;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletFinal", urlPatterns = {"/ServletFinal"})
public class ServletFinal extends HttpServlet {
    
    static Plantilla p;
    public static void liscov(Plantilla plantilla){
      p = plantilla;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Jugador jugador = new Jugador();
        jugador.setNombre(request.getParameter("nombre"));
        if(request.getParameter("plantilla").equals("Adivinanza 1")){
            AdivinanzaHuevo huevo = new AdivinanzaHuevo();
            liscov(huevo);
        } else if(request.getParameter("plantilla").equals("Adivinanza 2")){
            AdivinanzaArbol arbol = new AdivinanzaArbol();
            liscov(arbol);
        } else if(request.getParameter("plantilla").equals("Adivinanza 3")){
            AdivinanzaArcoIris arcoIris = new AdivinanzaArcoIris();
            liscov(arcoIris);
        }else if(request.getParameter("plantilla").equals("Adivinanza 4")){
            AdivinanzaHorizonte horizonte = new AdivinanzaHorizonte();
            liscov(horizonte);
        }
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Adivina</title>");
            out.println("<link href=\"Css/estilo2.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<script type=\"text/javascript\" src=\"Funciones.js\"></script>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nombre :" +jugador.getNombre() + "</h1>");
            out.println("<div class=\"hide\"> <input id=\"a\" type=\"text\" name=\"adivinanza\" value=\""+p.getImg()+"\"  > </input> </div>");
            out.println("<div class=\"container\">");
            out.println("<img src=\"img/" +p.getImg()+".jpg\"align=\"left\">");
            out.println("<input type=\"submit\" value=\""+p.getOpcion1()+"\" onclick=\"validar()\" > ");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type=\"submit\" value=\""+p.getOpcion2()+"\" onclick=\"validar2()\">");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type=\"submit\" value=\""+p.getOpcion3()+"\" onclick=\"validar3()\">");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type=\"submit\" value=\""+p.getOpcion4()+"\" onclick=\"validar4()\">");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
