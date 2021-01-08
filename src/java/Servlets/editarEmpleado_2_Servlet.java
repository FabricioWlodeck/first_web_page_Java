
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "editarEmpleado_2_Servlet", urlPatterns = {"/editarEmpleado_2_Servlet"})
public class editarEmpleado_2_Servlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fecha_nac = request.getParameter("fecha_nac");
        String cargo = request.getParameter("cargo");
        String cell = request.getParameter("cell");
        String direccion = request.getParameter("direccion");
        
        Controladora control = new Controladora();
        
        Empleado empleado = (Empleado) request.getSession().getAttribute("empleado_editar");
        

        empleado.setDni(dni);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFecha_nac(fecha_nac);
        empleado.setCargo(cargo);
        empleado.setCell(cell);
        empleado.setDireccion(direccion);
        
        control.editarEmpleado(empleado);
        response.sendRedirect("listaEmpleados.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
