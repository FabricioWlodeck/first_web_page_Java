
package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaEmpleadoServlet", urlPatterns = {"/altaEmpleadoServlet"})
public class altaEmpleadoServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String nombreUsuario = request.getParameter("nombre_usuario");
        String contraseña = request.getParameter("contraseña");        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fecha_nac = request.getParameter("fecha_nac");
        String cargo = request.getParameter("cargo");
        String cell = request.getParameter("cell");
        String direccion = request.getParameter("direccion");
        Usuario user= null;
        Controladora control = new Controladora();
        

        control.crearEmpleado(dni,nombre,apellido,fecha_nac,cargo,cell,direccion,nombreUsuario,contraseña);

        response.sendRedirect("listaEmpleados.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
