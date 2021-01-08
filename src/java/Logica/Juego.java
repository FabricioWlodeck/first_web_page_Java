
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Juego implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    int id_juego;
    
    @Basic
    String nombre;
    int edad_min;
    int capacidad_max;
    int cant_entradas;
        
    @OneToMany
    List <Entrada> listaEntradas ;
    @OneToMany
    List <Empleado> ListaEmpleados ;

    public Juego() {
    }

    public Juego(int id_juego, String nombre, int edad_min, int capacidad_max, int cant_entradas, List<Entrada> listaEntradas, List<Empleado> ListaEmpleados) {
        this.id_juego = id_juego;
        this.nombre = nombre;
        this.edad_min = edad_min;
        this.capacidad_max = capacidad_max;
        this.cant_entradas = cant_entradas;
        this.listaEntradas = listaEntradas;
        this.ListaEmpleados = ListaEmpleados;
    }

    public int getCant_entradas() {
        return cant_entradas;
    }

    public void setCant_entradas(int cant_entradas) {
        this.cant_entradas = cant_entradas;
    }

    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(List<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public List<Empleado> getListaEmpleados() {
        return ListaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> ListaEmpleados) {
        this.ListaEmpleados = ListaEmpleados;
    }

   

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 

    public int getEdad_min() {
        return edad_min;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }
    
        
    
}
