
package Servlets;

import Logica.Controladora;
import Logica.Entrada;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "editarEntrada_2_Servlet", urlPatterns = {"/editarEntrada_2_Servlet"})
public class editarEntrada_2_Servlet extends HttpServlet {

 
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
        String fecha_utilizar = request.getParameter("fecha_utilizar");
        String hora_utilizar = request.getParameter("hora_utilizar");
        
        Controladora control = new Controladora();
        int codigo_identificacion=0;
        
        Entrada entrada = (Entrada) request.getSession().getAttribute("entrada_editar");
        
        entrada.setDni(dni);
        entrada.setNombre(nombre);
        entrada.setApellido(apellido);
        entrada.setFecha_nac(fecha_nac);
        entrada.setFecha_utilizar(fecha_utilizar);
        entrada.setHora_utilizar(hora_utilizar);
        
        control.editarEntrada(entrada);
        response.sendRedirect("listaEntradas.jsp");
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
