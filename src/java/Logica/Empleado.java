
package Logica;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
//@AttributeOverride(name="dni", column=@Column(name="emple_dni"))
public class Empleado extends Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    int id_empleado;
    @Basic
    String cargo;
    String cell;
    String direccion;
    @OneToOne
    Usuario user;
 
    
    public Empleado() {
    }

    public Empleado(int id_empleado, String cargo, String cell, String direccion,Usuario user,String dni, String nombre, String apellido, String fecha_nac) {
        super(dni, nombre, apellido, fecha_nac);
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.cell = cell;
        this.direccion = direccion;
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
