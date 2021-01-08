
package Servlets;

import Logica.Controladora;
import Logica.Juego;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fabricio
 */
@WebServlet(name = "editarJuego_2_Servlet", urlPatterns = {"/editarJuego_2_Servlet"})
public class editarJuego_2_Servlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("nombre");
        int edad_min  = Integer.parseInt(request.getParameter("edad_min"));
        int capacidad_max  = Integer.parseInt(request.getParameter("capacidad_max"));
        
        Controladora control = new Controladora();
        
        Juego juego = (Juego) request.getSession().getAttribute("juego_editar");
        
        

        juego.setNombre(nombre);
        juego.setEdad_min(edad_min);
        juego.setCapacidad_max(capacidad_max);
        
        control.editarJuego(juego);
        response.sendRedirect("listaJuegos.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
