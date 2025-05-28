package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un nuevo escaner

        // Establece la frase y subcadena inicial
        String frase = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";

        // Muestra la frase y la subcadena
        System.out.println("Tu frase es: " + frase);
        System.out.println("La subcadena es: " + subcadena);

        // Calcula el largo de la frase y el largo de la frase sin subcadena
        int fraselength = frase.length();
        int frasesinsubcadena = frase.replace(subcadena, "").length();

        // Hace la división de la resta de la frase y la frase sin subcadena entre el largo de la subcadena, lo que dará igual el numero de veces que muestra la subcadena
        int division = (fraselength - frasesinsubcadena) / subcadena.length();
        System.out.println(division);
    }
