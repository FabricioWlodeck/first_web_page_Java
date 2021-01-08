
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
//@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    
    
    String dni;
    @Basic
    String nombre;
    String apellido;
    String fecha_nac;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String fecha_nac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
    }

  
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

   
  
    
         
    
}
