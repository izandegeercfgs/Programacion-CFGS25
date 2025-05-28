package org.unidad5.Teoria;

public class Estudiante {

    private String nombre;
    private int curso;
    private String NIA;
    private String email;

    private static int contadorEstudiantes = 0;
    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    public Estudiante(String nombre, int curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        this.NIA = generarNIA(); // Supuesto
        contadorEstudiantes++;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.curso = 0; // Valor por defecto
        this.email = "";
        this.NIA = generarNIA();
        contadorEstudiantes++;
    }

    public static int getContadorEstudiantes() {
        return contadorEstudiantes;
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches(CORREO_FORMAT);
    }

    public String getNombre() {
        return nombre;
    }

    // Si deseas incluir la generación automática del NIA
    private String generarNIA() {
        return "NIA" + String.format("%04d", contadorEstudiantes + 1);
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
