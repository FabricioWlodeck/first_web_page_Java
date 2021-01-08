
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "editarEmpleado_1_Servlet", urlPatterns = {"/editarEmpleado_1_Servlet"})
public class editarEmpleado_1_Servlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
            Controladora control = new Controladora();
        
            int id_empleado = Integer.parseInt(request.getParameter("id"));
            Empleado emple = control.BuscarEmpleado(id_empleado);

            HttpSession misession = request.getSession(true);
            misession.setAttribute("empleado_editar", emple);

            response.sendRedirect("editarEmpleado.jsp"); 
           
            
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Controladora control = new Controladora();
        
            int id_empleado = Integer.parseInt(request.getParameter("id"));
            Empleado emple = control.BuscarEmpleado(id_empleado);

            HttpSession misession = request.getSession(true);
            misession.setAttribute("empleado_editar", emple);

            response.sendRedirect("editarEmpleado.jsp"); 
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
