package org.unidad5.Teoria;

import org.unidad5.Libro;
import org.unidad5.Teoria.Teoria1;

public class Main {
    public static void main(String[] args) {
        // Creación de 2 objetos -> Persona

        // Se asigna a la "persona1" valores de Nombre, dni y edad
//        Teoria1.Persona persona1 = new Teoria1.Persona("Juan", "12345678A", 30, "Albañil", "Murcia");
//        Teoria1.Persona persona2 = new Teoria1.Persona("Miriam", "5050923H", 19, "Geologa", "Alicante");
//
//        // Vamos a mostrar la info de las personas mediante el metodo mostrarInfo()
//        System.out.println("Datos de persona 1: ");
//        persona1.mostrarInfo();
//        System.out.println();
//
//        System.out.println("Datos de persona 2: ");
//        persona2.mostrarInfo();
//        System.out.println();
//
//        // Ejemplo de uso de GETTER y SETTER
//        persona1.setNombre("Cristiano Ronaldo");
//        persona1.setDni("777-Siuuuu");
//        persona1.setEdad(39);
//        persona1.setProfesion("Futbolista");
//        persona1.setCiudad("Riyadh");
//
//        System.out.println("Nuevos datos de persona 1: ");
//        persona1.mostrarInfo();
//        System.out.println();

//        Teoria1.Persona.Persona2 persona = new Teoria1.Persona.Persona2("Juan", 30);
//        System.out.println(persona);

//        Estudiante estudiante1 = new Estudiante("David", 1, "davalorib@alu.edu.gva.es");
//        Estudiante estudiante2 = new Estudiante("Cesar");
//
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//
//        System.out.println("Correo válido: " + Estudiante.validarCorreo(estudiante1.getEmail()));
//        System.out.println("Total de estudiantes: " + Estudiante.obtenerTotalEstudiantes());

        Libro libro = new Libro("El principe Nirvano", "Nirvana Nirvanez");
        Libro libro2 = new Libro("El principe Nirvano 2", "Nirvana Nirvanez");
        Libro libro3 = new Libro("El principe Nirvano 3", "Nirvana Nirvanez");
        System.out.println();

        System.out.println(libro);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println();

        libro.prestar();
        System.out.println(libro);
        System.out.println();

        libro.prestar();
        System.out.println();

        libro.devolver();
        System.out.println(libro);
        System.out.println();

        libro2.devolver();
        System.out.println();

        System.out.println("Total de libros creados: " + Libro.getCantidadLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
    }
}
