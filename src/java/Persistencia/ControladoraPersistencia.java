
package Persistencia;

import Logica.Empleado;
import Logica.Entrada;
import Logica.Horario;
import Logica.Juego;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController ();
    EntradaJpaController entradaJPA = new EntradaJpaController ();
    HorarioJpaController horarioJPA = new HorarioJpaController ();
    JuegoJpaController juegoJPA = new JuegoJpaController ();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController ();

   
    
    public void crearEmpleado(Empleado empleado) {
        try {
            empleadoJPA.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearJuego (Juego juego){
        juegoJPA.create(juego);
    }
    
     public void crearHorario (Horario horario){
        horarioJPA.create(horario);
        
    }
      public void crearEntrada (Entrada entrada){
        entradaJPA.create(entrada);
    }

    //Traigo los usuarios
    public List<Usuario> getUsuario() {
        return usuarioJPA.findUsuarioEntities();
    }

    public List<Juego> getJuego() {
        return juegoJPA.findJuegoEntities();
    }

    public List<Entrada> getEntrada() {
        
        List <Entrada> listaentrada;
        
        return entradaJPA.findEntradaEntities();      
    }
    
    
    //Elimino la entrada
    public void EliminarEntrada(int id_entrada) {
        
        try {
            entradaJPA.destroy(id_entrada);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public List<Empleado> getEmpleado() {
       List <Empleado> listaempleado;
        
        return empleadoJPA.findEmpleadoEntities();      
    }

    public Entrada BuscarEntrada(int id_entrada) {
        
        return entradaJPA.findEntrada(id_entrada);
    }

    //MODIFICO LA INFO DE LAS ENTRADAS

    public void editarEntrada(Entrada entrada) {
        try {
            entradaJPA.edit(entrada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarEmpleado(int id_empleado) {
        
        try {
            empleadoJPA.destroy(id_empleado);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarJuego(int id_juego) {
        try {
            juegoJPA.destroy(id_juego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearUsuario(Usuario usu) {
        
        try {
            usuarioJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarJuego(Juego jue) {
        try {
            juegoJPA.edit(jue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado BuscarEmpleado(int id_empleado) {
        return empleadoJPA.findEmpleado(id_empleado);
    }

    public void editarEmpleado(Empleado empleado) {
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Juego BuscarJuego(int id_juego) {
        return juegoJPA.findJuego(id_juego);
    }

    public void editarJuego(Juego juego) {
        try {
            juegoJPA.edit(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


 

}
