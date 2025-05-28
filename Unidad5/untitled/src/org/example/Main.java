package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco", "Ruiz", "5050508693H", 'H', 35);

        persona1.mostrarInfo();
        persona2.mostrarInfo();

        // Accede a la edad usando el getter
        System.out.println("La edad de " + persona2.getNombre() + " es " + persona2.getEdad());

        // Cambia el apellido y muestra la profesión
        persona1.setApellido("Sin Nombre");
        System.out.println("Profesión de persona1: " + persona1.getProfesion());
    }
}
