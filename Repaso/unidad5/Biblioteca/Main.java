package org.unidad5.Biblioteca;

public class Main {

    public static void main(String[] args) {
        // Crear editoriales
        Editorial editorial1 = new Editorial("Editorial A");
        Editorial editorial2 = new Editorial("Editorial B");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "123");
        Estudiante estudiante2 = new Estudiante("Ana", "456");

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", editorial1);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", editorial2);

        // Prestar libros
        Prestamo.prestarLibro(estudiante1, libro1);
        Prestamo.prestarLibro(estudiante2, libro2);

        // Mostrar información
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(libro2);

        // Devolver libros
        Prestamo.devolverLibro(estudiante1, libro1);
        Prestamo.devolverLibro(estudiante2, libro2);

        // Mostrar información después de devolver
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
