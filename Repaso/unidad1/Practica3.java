package org.unidad1;

import java.util.Scanner;

public class Practica3 {
    public static void main(){
        Scanner teclado = new Scanner(System.in);

        // Pide el nombre
        System.out.println("Introduce tu nombre: ");

        // Crea el String nombre con la siguiente entrada
        String nombre = teclado.nextLine();

        // Mientras sea verdadero
        while (true){
            // Pide la edad y la guarda en una variable Int
            System.out.println("Hola " + nombre + ". Introduce tu edad (0-100): ");
            int edad = teclado.nextInt();

            // Condiciona según la entrada del usuario
            if (edad >= 18 && edad < 100) {
                System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
            } else if (edad < 18 && 0 <= edad){
                System.out.println("Lo siento, " + nombre + ", no puedes votar.");
                System.out.println("Te faltan " + (18 - edad) + " años para votar.");
            } else {
                System.out.println("Error. Prueba de nuevo: ");
            }
        }
    }
}
