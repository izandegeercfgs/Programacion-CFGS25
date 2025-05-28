package Ejercicios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter @Setter @ToString @AllArgsConstructor
public class Coche implements Serializable {

    private String marca;
    private String modelo;
    private transient int caballos;
}
