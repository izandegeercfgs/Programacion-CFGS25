package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuclesAnidados {
    public void bucles1arbol(){
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void bucles3tablas(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nTABLAS DE MULTIPLICAR");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("-----------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j + " ");
            }
            System.out.println("");
        }
    }

    public void bucles4primos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("> Introduce m: ");
        int m = teclado.nextInt();

        antonio:
        for (int i = 2; i <= m; i++) {
            for (int j = i-1; j >= 2 ; j--) {
                if (i % j == 0){
                    continue antonio;
                }
            }
            System.out.print(i + " ");
        }
    }

    public void matriz(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nMATRIZ 1"); // MATRIZ 1

        int matriz[][] = new int[3][3]; // Se crea una variable 3x3

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Se muestra cada uno de los valores del 3x3
            }
            System.out.println();
        }

        System.out.println("\nMATRIZ 2"); // MATRIZ 2

        int matriz2[][] = {{2,3,5,1}, {5,10,32,6}}; // Se crea una variable 2x4

        for (int[] fila : matriz2){
            System.out.println(Arrays.toString(fila)); // Se muestra cada valor en formato [X, X, X, X]
        }

        System.out.println("\nMATRIZ 3"); // MATRIZ 3

        int matriz3[][] = new int[3][3];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print("> Introduce la posición (" + i + "," + j + "): ");
                matriz3[i][j] = teclado.nextInt();
            }
            System.out.println();
        }

        for (int[] fila : matriz3){
            System.out.println(Arrays.toString(fila)); // Se muestra cada valor en formato [X, X, X, X]
        }
    }

    public void matriz2(){
        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][3]; // Se crea una variable 3x3

        System.out.println("\nMATRIZ ORIGINAL");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        System.out.println("\nMATRIZ INVERSA");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                if (i == j){
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
