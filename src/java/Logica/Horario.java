
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    int id_horario;
    //@Temporal(TemporalType.TIME)
    String horario_apertura;
    //@Temporal(TemporalType.TIME)
    String horario_cierre;
           
    @OneToMany
    List <Juego> listaJuegos ;
    
    
    public Horario() {
    }

    public Horario(int id_horario, String horario_apertura, String horario_cierre, List<Juego> listaJuegos) {
        this.id_horario = id_horario;
        this.horario_apertura = horario_apertura;
        this.horario_cierre = horario_cierre;
        this.listaJuegos = listaJuegos;
    }



    Horario(String string, Date hora1, Date hora2) {
        
    }

    public List<Juego> getListaJuegos() {
        return listaJuegos;
    }

    public void setListaJuegos(List<Juego> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

   
    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHoario_apertura() {
        return horario_apertura;
    }

    public void setHorario_apertura(String hoario_apertura) {
        this.horario_apertura = horario_apertura;
    }

    public String getHorario_cierre() {
        return horario_cierre;
    }

    public void setHorario_cierre(String horario_cierre) {
        this.horario_cierre = horario_cierre;
    }

    
    
    
}
