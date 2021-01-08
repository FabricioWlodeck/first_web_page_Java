
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "bajaEmpleadoServlet", urlPatterns = {"/bajaEmpleadoServlet"})
public class bajaEmpleadoServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Controladora control = new Controladora();
        
        int id_empleado = Integer.parseInt(request.getParameter("id"));
        control.EliminarEmpleado(id_empleado);
        
        response.sendRedirect("listaEmpleados.jsp");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
      
        Controladora control = new Controladora();
        
        int id_empleado = Integer.parseInt(request.getParameter("id"));
        control.EliminarEmpleado(id_empleado);
        
        response.sendRedirect("listaEmpleados.jsp");   
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
