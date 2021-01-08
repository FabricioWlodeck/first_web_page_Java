
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaEntradaServlet", urlPatterns = {"/altaEntradaServlet"})
public class altaEntradaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fecha_nac = request.getParameter("fecha_nac");
        String fecha_utilizar = request.getParameter("fecha_utilizar");   
        String hora_utilizar = request.getParameter("hora_utilizar");
        String juego = request.getParameter("juego");
        Controladora control = new Controladora();
        
        control.crearEntrada(dni,nombre,apellido,fecha_nac,fecha_utilizar,hora_utilizar,juego);
        response.sendRedirect("listaEntradas.jsp");
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
