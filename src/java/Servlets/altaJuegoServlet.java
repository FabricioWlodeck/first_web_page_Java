
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaJuegoServlet", urlPatterns = {"/altaJuegoServlet"})
public class altaJuegoServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String edad_minima = request.getParameter("edad_min");
        int edad_min = Integer.parseInt(edad_minima);
        
        String capacidad_maxima = request.getParameter("capacidad_max");
        int capacidad_max = Integer.parseInt(capacidad_maxima);
        
        
        Controladora control = new Controladora();
        control.crearJuego(nombre,edad_min,capacidad_max);
        
        response.sendRedirect("listaJuegos.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
