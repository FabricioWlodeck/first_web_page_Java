
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "bajaJuegoServlet", urlPatterns = {"/bajaJuegoServlet"})
public class bajaJuegoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int id_juego = Integer.parseInt(request.getParameter("id"));
        
        Controladora control = new Controladora();
        control.EliminarJuego(id_juego);
        
        response.sendRedirect("listaJuegos.jsp");
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        int id_juego = Integer.parseInt(request.getParameter("id"));
        
        Controladora control = new Controladora();
        control.EliminarJuego(id_juego);
        
        response.sendRedirect("listaJuegos.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
