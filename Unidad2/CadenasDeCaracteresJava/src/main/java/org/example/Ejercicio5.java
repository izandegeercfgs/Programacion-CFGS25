package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un nuevo escáner

        int intentos = 10;
        boolean acierto = false;  // Inicializamos el booleano en false

        // Establece la frase y subcadena inicial
        System.out.println("Introduce la frase inicial: ");
        String frase = scanner.nextLine();

        while (intentos > 0 && !acierto) {  // Continua hasta que acierte o se quede en intentos = 0
            System.out.println("Introduce la subcadena (Debe formar parte de la frase inicial): ");
            String subcadena = scanner.nextLine();

            // Solo será acierto si la frase contiene la subcadena, por lo que se actualizará
            acierto = frase.contains(subcadena);

            if (acierto) {
                System.out.println("¡Enhorabuena, has acertado una palabra!");
            } else {
                intentos -= 1;
                System.out.println("ERROR. Te quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("Has perdido.");
                }
            }
        }
    }
}
