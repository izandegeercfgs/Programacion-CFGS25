package org.unidad3;

import java.util.Scanner;

public class Bateria2 {
    public static void Ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Tabla de multiplicar del número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (i*numero));
        }
    }

    public static void Ejercicio4() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
