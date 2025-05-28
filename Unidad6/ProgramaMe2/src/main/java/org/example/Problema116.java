package org.example;

import java.util.Scanner;

public class Problema116 {
    static Scanner teclado;

    public static void casoDePrueba() {
        System.out.println("Hola Mundo");
    } // casoDePrueba

    public static void main() {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        if (numCasos <= 0 || numCasos >= 5){
            return;
        }
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
