package org.example;

import java.util.Scanner;

public class Problema741 {
    static Scanner teclado;

    public static void casoDePrueba() {
        System.out.println();
    } // casoDePrueba

    public static void main() {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
