package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean error = true;
        final int edadlegal = 18;
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez
        System.out.printf("Introduce tu nombre: ");
        String nombre = entradaEscaner.nextLine(); // Leer el nombre


        System.out.println("Hola " + nombre + ". Introduce tu edad: "); // Saludar al usuario con su nombre y solicitar su edad

        while (error == true) {
            try {
                int edad = entradaEscaner.nextInt(); // Intentar leer la edad

                if (edad >= edadlegal) {
                    System.out.println("Enhorabuena " + nombre + ". Puedes votar."); // La persona puede votar
                } else {
                    System.out.println("Lo siento " + nombre + ". No puedes votar."); // La persona no puede votar
                    int legal = edadlegal - edad; // Calcular los años restantes para ser mayor de edad
                    System.out.println("Aún te quedan " + legal + " años para ser mayor de edad."); // La persona no puede votar
                }

            }  catch (InputMismatchException e) {
                System.out.println("El número no es válido, por favor, vuelve a introducir un número: "); // Da error
                entradaEscaner.nextLine();
            }
        }
    }
}
