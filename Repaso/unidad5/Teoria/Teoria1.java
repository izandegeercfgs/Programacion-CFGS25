package org.unidad5.Teoria;

public class Teoria1 {
    public static class Persona {
        // Atributos -> Lo recomendable es que sean privados, y que los métodos, sean públicos
        private String nombre;
        private String dni;
        private int edad;
        private String profesion;
        private String ciudad;

        // Constructor de la clase persona (Devuelve una instancia de dicho objeto) - this hace referencia al objeto
        public Persona(String nombre, String dni, int edad, String profesion, String ciudad) {
            this.nombre = nombre;
            this.dni = dni;
            this.edad = edad;
            this.profesion = profesion;
            this.ciudad = ciudad;
        }

        // Este constructor VACIO (Por defecto)) es útil si necesitamos crear objetos que serán inicializados más tarde.
        public Persona(String juan, int i) {
        }

        // Metodo getter para acceder a los atributos (privados)
        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }

        public int getEdad() {
            return edad;
        }

        public String getProfesion() {
            return profesion;
        }

        public String getCiudad() {
            return ciudad;
        }

        // Metodo setter para modificar los atributos
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setProfesion(String profesion) {
            this.profesion = profesion;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        // Metodo para mostrar la información de la persona
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("DNI: " + dni);
            System.out.println("Edad: " + edad);
            System.out.println("Profesión: " + profesion);
            System.out.println("Ciudad: " + ciudad);
        }

        static class Persona2 {
            String nombre;
            int edad;

            Persona2(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
        }

        @Override
        public String toString() {
            return "Persona [nombre= " + nombre + ", edad= " + edad + "]";
        }
    }
}
