package org.unidad5;

import java.util.ArrayList;

public class LibroPrest {

    // Clase Estudiante
    public static class Estudiante {
        private String nombre;
        private String id;
        private ArrayList<LibroPrestado> librosPrestados;

        public Estudiante(String nombre, String id) {
            this.nombre = nombre;
            this.id = id;
            this.librosPrestados = new ArrayList<>();
        }

        public void anyadirLibro(LibroPrestado libro) {
            librosPrestados.add(libro);
        }

        public void borrarLibro(LibroPrestado libro) {
            librosPrestados.remove(libro);
        }

        public boolean tieneLibro(LibroPrestado libro) {
            return librosPrestados.contains(libro);
        }

        public String getNombre() {
            return nombre;
        }

        public String getId() {
            return id;
        }

        public ArrayList<LibroPrestado> getLibrosPrestados() {
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

    // Clase Editorial
    public static class Editorial {
        private String nombre;
        private ArrayList<LibroPrestado> librosPublicados;

        public Editorial(String nombre) {
            this.nombre = nombre;
            this.librosPublicados = new ArrayList<>();
        }

        public void anyadirLibro(LibroPrestado libro) {
            if (!librosPublicados.contains(libro)) {
                librosPublicados.add(libro);
            }
        }

        public void borrarLibro(LibroPrestado libro) {
            librosPublicados.remove(libro);
        }

        public String getNombre() {
            return nombre;
        }

        public ArrayList<LibroPrestado> getLibrosPublicados() {
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

    // Clase LibroPrest
    public static class LibroPrestado {
        private String titulo;
        private String autor;
        private String id;
        private boolean disponible;
        private static int cantidadLibros;
        private static int librosDisponibles;
        private Estudiante estudiantPrestamo;
        private Editorial editorial;

        public LibroPrestado(String titulo, String autor, Editorial editorial) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = true;
            this.id = calcularID();
            this.editorial = editorial;

            cantidadLibros++;
            librosDisponibles++;
            this.estudiantPrestamo = null;

            // Añadir libro a la editorial (bidireccional)
            editorial.anyadirLibro(this);
        }

        private String calcularID() {
            return String.format("LIB%03d", cantidadLibros);
        }

        public void prestar(Estudiante estudiante) {
            if (!disponible) {
                System.err.println("x El libro ya ha sido prestado.");
                return;
            }

            if (estudiante.tieneLibro(this)) {
                System.err.println("x El estudiante ya tiene este libro prestado.");
                return;
            }

            disponible = false;
            librosDisponibles--;
            estudiantPrestamo = estudiante;
            estudiante.anyadirLibro(this);

            System.out.println("= Libro prestado con éxito a " + estudiante.getNombre());
        }

        public void devolver() {
            if (disponible) {
                System.err.println("x El libro no estaba prestado.");
                return;
            }

            disponible = true;
            librosDisponibles++;

            if (estudiantPrestamo != null) {
                estudiantPrestamo.borrarLibro(this);
                System.out.println("= El libro ha sido devuelto por " + estudiantPrestamo.getNombre());
            }

            estudiantPrestamo = null;
        }

        public boolean estaDisponible() {
            return disponible;
        }

        public static int getCantidadLibros() {
            return cantidadLibros;
        }

        public static int getLibrosDisponibles() {
            return librosDisponibles;
        }

        public Editorial getEditorial() {
            return editorial;
        }

        @Override
        public String toString() {
            String estudianteInfo = (estudiantPrestamo != null) ? estudiantPrestamo.getNombre() : "Nadie";
            String disponibilidad = disponible ? "Sí" : "No";

            return "Libro{" +
                    "Título='" + titulo + '\'' +
                    ", Autor='" + autor + '\'' +
                    ", ID='" + id + '\'' +
                    ", Estudiante Prestado=" + estudianteInfo +
                    ", Disponible=" + disponibilidad +
                    ", Editorial=" + (editorial != null ? editorial.getNombre() : "N/A") +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Crear editoriales
        Editorial editorial1 = new Editorial("Editorial A");
        Editorial editorial2 = new Editorial("Editorial B");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "123");
        Estudiante estudiante2 = new Estudiante("Ana", "456");

        // Crear libros
        LibroPrestado libro1 = new LibroPrestado("El Quijote", "Miguel de Cervantes", editorial1);
        LibroPrestado libro2 = new LibroPrestado("Cien años de soledad", "Gabriel García Márquez", editorial2);

        // Prestar libros
        libro1.prestar(estudiante1);
        libro2.prestar(estudiante2);

        // Mostrar información
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(libro2);

        // Devolver libros
        libro1.devolver();
        libro2.devolver();

        // Mostrar información después de devolver
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
