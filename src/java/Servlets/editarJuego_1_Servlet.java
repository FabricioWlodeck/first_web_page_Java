
package Servlets;

import Logica.Controladora;
import Logica.Juego;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Fabricio
 */
@WebServlet(name = "editarJuego_1_Servlet", urlPatterns = {"/editarJuego_1_Servlet"})
public class editarJuego_1_Servlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Controladora control = new Controladora();
        
        int id_juego = Integer.parseInt(request.getParameter("id"));
        Juego juego = control.BuscarJuego(id_juego);

        HttpSession misession = request.getSession(true);
        misession.setAttribute("juego_editar", juego);

        response.sendRedirect("editarJuego.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
