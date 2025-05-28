package org.unidad2;

import java.util.Random;
import java.util.Scanner;

public class Examen {
    public static void Ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(0,100);

        System.out.println("Número random: " + rand);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Intento nº" + i + ". Introduce un número: ");
            int num = teclado.nextInt();

            if (num == rand) {
                System.out.println(">>>> Has ganado <<<<");
                break;
            } else {
                if (i == 10) {
                    System.out.println(">> Has perdido <<");
                } else {
                    System.out.println("> ERROR.");
                    System.out.println("----------------------------");
                }
            }
        }
    }
}
