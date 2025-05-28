package Ejercicios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter @Setter @ToString @AllArgsConstructor
public class Turron implements Serializable {

    private String marca;
    private String procedencia;
    private transient int gramos;
}