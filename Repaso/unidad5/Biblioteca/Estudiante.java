package org.unidad5.Biblioteca;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public void anyadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public boolean tieneLibro(Libro libro) {
        return librosPrestados.contains(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + nombre + '\'' +
                ", ID='" + id + '\'' +
                ", LibrosPrestados=" + librosPrestados.size() +
                '}';
    }
}
