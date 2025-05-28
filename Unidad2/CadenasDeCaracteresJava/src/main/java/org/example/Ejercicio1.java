package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un nuevo escaner

        System.out.println("Introduce una palabra o frase: ");
        String OriginalText = scanner.nextLine(); // Lee la palabra o frase introducida

        // Muestra el texto original
        System.out.println("Texto original: " + OriginalText);

        // Muestra el largo del texto (número de carácteres)
        int TextLength = OriginalText.length();
        System.out.println("La longitud del texto es: " + TextLength);

        // Elimina los espacios del texto (si los hay) y muestra como queda (replace(,)).
        String textoSinEspacios = OriginalText.replace(" ", "");
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        // Divide la cadena de texto en dos partes iguales (por la mitad) para posteriormente concatenarlas y mostrarlas de nuevo, pero con el siguiente formato: "Primera mitad del texto es " + mitad1 + "y la segunda mitad del texto es " + mitad2. (substring + concat).
        int PrimeraMitad = (TextLength / 2);
        String PrimeraMitadSout = OriginalText.substring(0,PrimeraMitad);

        int SegundaMitad = (PrimeraMitad);
        String SegundaMitadSout = OriginalText.substring(SegundaMitad, TextLength);
        System.out.println("Texto dividido en 2 mitades: Primera mitad del texto es: " + PrimeraMitadSout + " y la segunda mitad del texto es: " + SegundaMitadSout);

        // Transforma la cadena de texto a mayúsculas (toUpperCase()).
        String CapitalText = OriginalText.toUpperCase();
        System.out.println("Texto a mayúsculas. " + CapitalText);
    }
    }