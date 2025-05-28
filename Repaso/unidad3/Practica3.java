package org.unidad3;

import java.util.Scanner;

public class Practica3 {
    public static void sopaLetras() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** SOPA DE LETRAS ***");
        System.out.println("----------------------");

        System.out.print("= Introduzca el número de filas: ");
        int filas = teclado.nextInt();

        System.out.print("= Introduzca el número de columnas: ");
        int columnas = teclado.nextInt();

        char contenedor[][] = new char[filas][columnas];


        teclado.nextLine();
        for (int i = 0; i < filas; i++) {
            System.out.print("-> Introduce las letras de la fila " + (i + 1) + " (sin espacios): ");

            String fila = teclado.nextLine();

            if (fila.length() == columnas && fila.matches("[a-zA-Z]+")) {
                for (int j = 0; j < columnas; j++) {
                    contenedor[i][j] = fila.charAt(j);
                }
            } else {
                System.err.println("x FORMATO INCORRECTO. Cerrando programa...");
                break;
            }
        }
        System.out.println("\nSopa de letras:");
        for (int j = 0; j < filas; j++) {
            for (int k = 0; k < columnas; k++) {
                System.out.print(contenedor[j][k] + " ");
            }
            System.out.println();
        }
        System.out.print("\n= Introduce la palabra a buscar: ");
        String palabra = teclado.next();

        System.out.println("* Buscando la palabra " + palabra + "...");
    }
}
