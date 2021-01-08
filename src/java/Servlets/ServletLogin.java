
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        //Traigo usuario y contraseña desde el LOGIN
        String usuario = request.getParameter("username");
        String contra = request.getParameter("pass");
        
        boolean estaONo = false;
        
        //Creo una instacia a la controladora para conectar con la LÓGICA
        Controladora control = new Controladora ();
        //Asigno a mi variable que controla si esta okay o no mi USUARIO y CONTRASEÑA el resultado de la comprobacion lo guardo en mi variable
        estaONo = control.comprobarIngreso(usuario,contra);
        
        //Comprobacion si dejo entrar o no
        if(estaONo==true){
            
            //Verificar que exista una sesion
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usuario);
            misession.setAttribute("pass", contra);
            //guardamos el atributo control en la session
            misession.setAttribute("control", control);
            // Lado izquierdo lo que traje de mi interfaz grafica y del lado derecho el nombre que quiero que tenga en mi session
            
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("Login_error.jsp");
        }
            
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
