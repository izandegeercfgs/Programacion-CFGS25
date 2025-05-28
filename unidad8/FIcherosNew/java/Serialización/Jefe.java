package Ejercicios;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Jefe extends Empleado {

    private String departamento;


    public Jefe(String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }
}
