package org.example;

public class Profesor {

    private  String nombre;
    private String asignatura;
    private int edad;

    public Profesor(String nombre, String asignatura, int edad) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getEdad() {
        return edad;
    }
}