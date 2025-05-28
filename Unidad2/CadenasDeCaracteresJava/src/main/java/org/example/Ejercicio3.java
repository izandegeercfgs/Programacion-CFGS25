package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un nuevo escaner

        System.out.println("Programa que quite a una variable numérica n sus m últimas cifras.");

        // Pedir numero N
        System.out.println("Introduce el numero N: ");
        int numberN = scanner.nextInt();

        // Pedir numero M
        System.out.println("Introduce el numero M: ");
        int numberM = scanner.nextInt();

        // Calcular longitud de N y comprobar si M > longitud de N
        String numberNstring = String.valueOf(numberN);
        if (numberM > numberNstring.length()){
            System.out.println("ERROR. M no puede ser mayor que la longitud de N.");
        } else {
            String resultadoStr = numberNstring.substring(0,numberNstring.length()-numberM);
            int resultado = Integer.parseInt(resultadoStr);

            // Mostrar resultado
            System.out.println("El resultado es: " + resultado);
        }
    }
}