package org.unidad5.Biblioteca;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    boolean disponible;  // Esta variable está correctamente definida una sola vez.
    private static int cantidadLibros;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.id = calcularID();
        this.editorial = editorial;

        cantidadLibros++;

        // Añadir libro a la editorial (bidireccional)
        editorial.anyadirLibro(this);
    }

    private String calcularID() {
        return String.format("LIB%03d", cantidadLibros);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public boolean estaDisponible() {
        return disponible; // Asegurándote de que no haya duplicación.
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ID='" + id + '\'' +
                ", Disponible=" + (disponible ? "Sí" : "No") +
                ", Editorial=" + editorial.getNombre() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
