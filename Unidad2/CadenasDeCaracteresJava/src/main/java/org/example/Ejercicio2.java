package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un nuevo escaner

        System.out.println("Introduce una palabra o frase: ");
        String Text1 = scanner.nextLine(); // Lee la palabra o frase introducida

        System.out.println("Introduce otra palabra o frase: ");
        String Text2 = scanner.nextLine(); // Lee la segunda palabra o frase introducida

        // Muestra los textos originales
        System.out.println("Los textos originales son: " + Text1 + " y " + Text2);

        // Calcula el largo de los textos (número de carácteres)
        int TextLength1 = Text1.length();
        int TextLength2 = Text2.length();

        // Compara el largo de los textos
        if (Text1.length() > Text2.length()) {
            System.out.println("La frase más larga es: " + Text1);
        } else if (TextLength1 < TextLength2) {
            System.out.println("La frase más larga es: " + Text2);
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
}