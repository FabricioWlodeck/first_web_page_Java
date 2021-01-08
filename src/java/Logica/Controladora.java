
package Logica;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersist = new ControladoraPersistencia ();
    
    //CREO LOS ELEMENTOS DE LAS RESPECTIVAS TABLAS
    
    //Usuario
    Usuario aux_usu = new Usuario (); 
 
    
  
    
    //COMPROBAR EL INGRESO DEL USUARIO POR MEDIO DE LOGIN
    public boolean comprobarIngreso(String usuario, String contra) {
        boolean siONo = false;
        List <Usuario> listaUsuarios =  new ArrayList <Usuario> ();
        
        listaUsuarios = controlPersist.getUsuario();
        
        for(Usuario usu: listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario) && usu.getContraseña().equals(contra)){
                
                siONo = true;
                return siONo;
            }
        }
        return siONo;   
    }
    

   
    


    //Creo Juego
    public void crearJuego(String nombre,  int edad_min, int capacidad_max) {
        int cont = 0;
        Juego juego = new Juego ();
        
        juego.setNombre(nombre);
        juego.setEdad_min(edad_min);
        juego.setCapacidad_max(capacidad_max);
        
        List <Entrada> listaEntradas =  new ArrayList <Entrada> ();
        
        listaEntradas = controlPersist.getEntrada();
        
        for(Entrada entra: listaEntradas){
            if(entra.getJuego().equals(nombre) ){
                
                cont++;
            }
        }
        
        juego.setCant_entradas(cont);
        //juego.setListaEmpleados((List<Empleado>)ListaEmpleados);

        
        controlPersist.crearJuego(juego);
    }
    

    
    //CREAR HORARIOS
   /* public void crearHorario(String hora_apertura, String hora_cierre) {
        Horario horario = new Horario ();
       
        horario.setHorario_apertura(hora_apertura);
        horario.setHorario_cierre(hora_cierre);
        horario.setListaJuegos((List<Juego>) listaJuegos);
        controlPersist.crearHorario (horario);
        
    }*/
    
    //CREAR ENTRADAS

     public void crearEntrada(String dni, String nombre, String apellido, String fecha_nac, String fecha_utilizar, String hora_utilizar, String juego) {
        Entrada entrada = new Entrada();
        entrada.setDni(dni);
        entrada.setNombre(nombre);
        entrada.setApellido(apellido);
        entrada.setFecha_nac(fecha_nac);
        entrada.setFecha_utilizar(fecha_utilizar);
        entrada.setHora_utilizar(hora_utilizar);
        entrada.setJuego(juego);
        
         List <Juego> listaJuegos =  new ArrayList <Juego> ();
        
        listaJuegos = controlPersist.getJuego();
        
        for(Juego jue: listaJuegos){
            if(jue.getNombre().equals(juego) ){
               jue.cant_entradas++;
               controlPersist.actualizarJuego(jue);
            }
        }
        
        
        //juego.setListaEntradas((List<Entrada>) listaEntradas);
        //List <Entrada> listaUsuarios =  new ArrayList <Usuario> ();
        
        
        controlPersist.crearEntrada(entrada);
    }
    

    //GUARDO LAS ENTRADAS EN UNA LISTA
     public List <Entrada> getListaEntrada (){
        
         return controlPersist.getEntrada();
         
         
     }
     
     
     //GUARDO LOS EMPLEADOS EN UNA LISTA    
     public List <Empleado> getListaEmpleado (){
        
         return controlPersist.getEmpleado(); 
     }
     
    //GUARDO LOS JUEGOS EN UNA LISTA    
     public List <Juego> getListaJuegos (){
        
         return controlPersist.getJuego(); 
     }
     

     //ELIMINO ENTRADA
    public void EliminarEntrada(int id_entrada) {
        
         controlPersist.EliminarEntrada(id_entrada);
    }



    
    
    
    int aux_id_entrada;
    //BUSCO LA ENTRADA EN ESPECIFICO
    public Entrada BuscarEntrada(int id_entrada) {
        aux_id_entrada = id_entrada;
        return controlPersist.BuscarEntrada(id_entrada);
    }

    
     int aux_id_empleado;
     //BUSCO LA ENTRADA EN ESPECIFICO
    public Empleado BuscarEmpleado(int id_empleado) {
        aux_id_empleado = id_empleado;
        return controlPersist.BuscarEmpleado(id_empleado);
    
    }
    

    public void EliminarJuego(int id_juego) {
        controlPersist.EliminarJuego(id_juego);
    }

    //GENERO EMPLEADO Y USUARIO AL MISMO TIEMPO
    public void crearEmpleado(String dni, String nombre, String apellido, String fecha_nac, String cargo, String cell, String direccion, String nombreUsuario, String contraseña) {
        Empleado empleado = new Empleado();
        Usuario usu = new Usuario();
        
        usu.setNombreUsuario(nombreUsuario);
        usu.setContraseña(contraseña);
        controlPersist.crearUsuario (usu);

        empleado.setDni(dni);
        empleado.setCargo(cargo);
        empleado.setCell(cell);
        empleado.setDireccion(direccion);

        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFecha_nac(fecha_nac);
        
        empleado.setUser(usu);

        controlPersist.crearEmpleado (empleado);
    }


    public void editarEntrada(Entrada entrada) {
        controlPersist.editarEntrada (entrada);
    }

    public void crearHorario(String hora_apertura, String hora_cierre) {
        
        Horario horario = new Horario ();
       
        horario.setHorario_apertura(hora_apertura);
        horario.setHorario_cierre(hora_cierre);
        //horario.setListaJuegos((List<Juego>)listaJuegos);
        controlPersist.crearHorario (horario);
    }

    public void EliminarEmpleado(int id_empleado) {
        controlPersist.EliminarEmpleado(id_empleado);
    }

    public void editarEmpleado(Empleado empleado) {
       controlPersist.editarEmpleado (empleado);
    }

    public Juego BuscarJuego(int id_juego) {
        return controlPersist.BuscarJuego(id_juego);
    }

    public void editarJuego(Juego juego) {
        controlPersist.editarJuego (juego);
    }

    
}



