package org.unidad1;

import java.util.Scanner;

public class Examen {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce la nota del primer trimestre (0-10): ");
        int first_term = teclado.nextInt();

        System.out.print("Introduce la nota del segundo trimestre (0-10): ");
        int second_term = teclado.nextInt();

        System.out.print("Introduce la nota del terce trimestre (0-10): ");
        int third_term = teclado.nextInt();

        System.out.println("Las notas de " + nombre + " son los siguientes:");
        System.out.println("1ª Trimestre: " + first_term);
        System.out.println("2ª Trimestre: " + second_term);
        System.out.println("3ª Trimestre: " + third_term);

        int media = ((first_term + second_term + third_term) / 3);
        System.out.println("La media obtenida es: " + media);

        if (media >= 5) {
            System.out.println("Enhorabuena " + nombre + ". Estás aprobado.");
        } else {
            System.out.println("Lo siento " + nombre + ". Estás suspenso.");
        }
    }
}
