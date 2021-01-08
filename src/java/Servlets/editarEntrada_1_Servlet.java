
package Servlets;

import Logica.Controladora;
import Logica.Entrada;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "editarEntrada_1_Servlet", urlPatterns = {"/editarEntrada_1_Servlet"})
public class editarEntrada_1_Servlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
            Controladora control = new Controladora();
            
            int id_entrada = Integer.parseInt(request.getParameter("id"));
            Entrada entra = control.BuscarEntrada(id_entrada);

            HttpSession misession = request.getSession(true);
            misession.setAttribute("entrada_editar", entra);

            response.sendRedirect("EditarEntrada.jsp"); 
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
