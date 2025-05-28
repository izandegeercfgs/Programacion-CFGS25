package org.unidad5;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private static int cantidadLibros;
    private static int librosDisponibles;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.id = calcularID();
        cantidadLibros++;
        librosDisponibles++;
    }

    // Metodo para calcular el ID
    private String calcularID() {
        return String.format("LIB%03d", cantidadLibros);
    }

    // Metodo para prestar un libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            librosDisponibles--;
            System.out.println("= El libro ha sido prestado con éxito.");
        } else {
            System.err.println("x El libro ya ha sido prestado. No se puede prestar nuevamente.");
        }
    }

    // Metodo para devolver un libro
    public void devolver() {
        if (!disponible) {
            disponible = true;
            librosDisponibles++;
            System.out.println("= El libro ha sido devuelto con éxito.");
        } else {
            System.err.println("x El libro no estaba prestado. No se puede devolver.");
        }
    }

    // Metodo booleano para confirmar que el libro está disponible
    public boolean estaDisponible() {
        return disponible;
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ID='" + id + '\'' +
                ", Disponible=" + (disponible ? "Sí" : "No") +
                '}';
    }
}
