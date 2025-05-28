package org.unidad5.Biblioteca;

public class Prestamo {

    public static void prestarLibro(Estudiante estudiante, Libro libro) {
        if (!libro.estaDisponible()) {
            System.err.println("x El libro ya ha sido prestado.");
            return;
        }

        if (estudiante.tieneLibro(libro)) {
            System.err.println("x El estudiante ya tiene este libro prestado.");
            return;
        }

        libro.disponible = false;
        estudiante.anyadirLibro(libro);
        System.out.println("= Libro prestado con éxito a " + estudiante.getNombre());
    }

    public static void devolverLibro(Estudiante estudiante, Libro libro) {
        if (libro.estaDisponible()) {
            System.err.println("x El libro no estaba prestado.");
            return;
        }

        libro.disponible = true;
        estudiante.borrarLibro(libro);
        System.out.println("= El libro ha sido devuelto por " + estudiante.getNombre());
    }
}
