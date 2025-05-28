package org.example;

import java.util.Scanner;

public class Problema471 {
    static Scanner teclado;

    public static void casoDePrueba() {
        String[] grados = teclado.nextLine().split(" ");

        int num1 = Integer.parseInt(grados[0]);
        int num2 = Integer.parseInt(grados[1]);

        int resultado = num1 - num2;

    } // casoDePrueba

    public static void main() {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
