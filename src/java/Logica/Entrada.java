
package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entrada extends Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    int codigo_identificacion;
    @Basic
    String fecha_utilizar;
    String hora_utilizar;
    String juego;

    public Entrada() {
    }

    public Entrada(int codigo_identificacion, String fecha_utilizar, String hora_utilizar, String juego, String dni, String nombre, String apellido, String fecha_nac) {
        super(dni, nombre, apellido, fecha_nac);
        this.codigo_identificacion = codigo_identificacion;
        this.fecha_utilizar = fecha_utilizar;
        this.hora_utilizar = hora_utilizar;
        this.juego = juego;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public int getCodigo_identificacion() {
        return codigo_identificacion;
    }

    public void setCodigo_identificacion(int codigo_identificacion) {
        this.codigo_identificacion = codigo_identificacion;
    }

    public String getFecha_utilizar() {
        return fecha_utilizar;
    }

    public void setFecha_utilizar(String fecha_utilizar) {
        this.fecha_utilizar = fecha_utilizar;
    }

    public String getHora_utilizar() {
        return hora_utilizar;
    }

    public void setHora_utilizar(String hora_utilizar) {
        this.hora_utilizar = hora_utilizar;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getFecha_nac() {
        return fecha_nac;
    }

    @Override
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    
    
}

