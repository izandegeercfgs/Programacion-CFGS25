package Ejercicios;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter @Setter @ToString @AllArgsConstructor
public class Futbolista implements Serializable {

    private String nombre;
    private String equipo;
    private transient int partidos;
}
