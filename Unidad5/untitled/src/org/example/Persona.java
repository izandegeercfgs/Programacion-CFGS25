package org.example;

public class Persona {

    private String nombre;
    private String apellido;
    private String DNI;
    private String profesion;
    private String ciudad;
    private int edad;
    private char sexo;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.DNI = "Sin DNI";
        this.sexo = 'N';
        this.edad = 0;
        this.profesion = "Albañil";
        this.ciudad = "Alicante";
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, String DNI, char sexo, int edad) {
        setNombre(nombre);
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.edad = edad;
        this.profesion = "Albañil"; // Valor por defecto
        this.ciudad = "Alicante";  // Valor por defecto
    }

    // Métodos getter y setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        // Valida que el nombre no sea "MESSI"
        if (!nombre.equalsIgnoreCase("MESSI")) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String concatenar() {
        return this.nombre + " " + this.apellido;
    }

    public void mostrarInfo() {
        System.out.println(
                this.nombre + " " + this.apellido + " " +
                        this.DNI + " " + this.sexo + " " + this.edad
        );
    }
}
