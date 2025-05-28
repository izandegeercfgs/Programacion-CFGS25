package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static void entrada() {
        String[] dias = {"Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Scanner teclado = new Scanner(System.in);

        int filas = 1;
        int columnas = dias.length;

        int[][] valor = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("¿Cuanto se ganó el " + dias[j] + "?:  ");
                valor[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(dias[j] + ": ");
                System.out.println(valor[i][j]+ "€" + " ");
            }
            System.out.println();
        }
    }

//    public static void mas_ventas() {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < ; j++) {
//                System.out.println(valor[i][j]);
//        }
//    }
}
