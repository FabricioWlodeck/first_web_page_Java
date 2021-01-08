
package Servlets;

import Logica.Controladora;
import static java.awt.SystemColor.control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PruebaServlet", urlPatterns = {"/PruebaServlet"})
public class PruebaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
    }

 
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
                
        Controladora control = new Controladora ();
        
        //TAL VEZ HALLA QUE ELIMIAR ESTE ARCHIVO " pruebaServlet "
        
        

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
