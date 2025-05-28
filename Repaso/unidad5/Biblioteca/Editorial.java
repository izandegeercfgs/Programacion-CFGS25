package org.unidad5.Biblioteca;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private ArrayList<Libro> librosPublicados;

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.librosPublicados = new ArrayList<>();
    }

    public void anyadirLibro(Libro libro) {
        if (!librosPublicados.contains(libro)) {
            librosPublicados.add(libro);
        }
    }

    public void borrarLibro(Libro libro) {
        librosPublicados.remove(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "Nombre='" + nombre + '\'' +
                ", LibrosPublicados=" + librosPublicados.size() +
                '}';
    }
}
