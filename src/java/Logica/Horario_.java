package Logica;

import Logica.Juego;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-22T22:29:07")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile ListAttribute<Horario, Juego> listaJuegos;
    public static volatile SingularAttribute<Horario, Integer> id_horario;
    public static volatile SingularAttribute<Horario, String> horario_apertura;
    public static volatile SingularAttribute<Horario, String> horario_cierre;

}