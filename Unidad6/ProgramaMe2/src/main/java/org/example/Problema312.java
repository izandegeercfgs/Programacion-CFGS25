package org.example;

import java.util.Scanner;

public class Problema312 {
    static Scanner teclado = new Scanner(System.in);

    public static void main() {
        int numero = pedirNumero();

        if (numero == 0) {
            System.exit(0);
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("hola");
            }
        }
    }
    public static int pedirNumero() {
        int numero = teclado.nextInt();
        return numero;
    }
}
