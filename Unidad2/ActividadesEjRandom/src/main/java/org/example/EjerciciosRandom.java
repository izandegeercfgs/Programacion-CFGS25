package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosRandom {
    public static void aleatorio() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(899) + 100;
        System.out.println("Número aleatorio generado: " + numero);
    }

    public static void ejercicio1() {
        Random random = new Random();

        int dado1 = (int) random.nextInt(6) + 1;
        int dado2 = (int) random.nextInt(6) + 1;

        System.out.println("El dado 1 ha salido: " + dado1 + " y el dado 2 ha salido: " + dado2);
        System.out.println("La suma de ambos es: " + (dado1 + dado2));
    }
    public static void ejercicio2() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contrasenya = "";

        int posicion;

        for (int i = 0; i <= longitud; i++){
                Random aleatorio = new Random();
                posicion = aleatorio.nextInt(caracteres.length());
                contrasenya += caracteres.charAt(posicion);
        }
        System.out.println("Tu contrasenya es: " + contrasenya);
    }
    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el rango mínimo: ");
        int rangomin = teclado.nextInt();

        System.out.println("Introduce el rango máximo: ");
        int rangomax = teclado.nextInt();

        while (true) {
            if (rangomax < rangomin){
                System.out.println("ERROR. El rango mínimo debe de ser menor que el máximo.");
                break;
            } else {
                Random random = new Random();
                System.out.println("¿Cuántos números aleatorios quieres?");
                int numaleatorios = teclado.nextInt();
                for (int i = 0; i < numaleatorios; i++){
                System.out.println(random.nextInt((rangomax - rangomin + 1) + rangomin));
                }
            }
        }
    }
    public static void ejercicio4() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = random.nextInt(2) + 6;

        String contrasenya = "";

        int posicion;

        for (int i = 0; i <= longitud; i++){
            Random aleatorio = new Random();
            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);
        }
        System.out.println("Tu contrasenya es: " + contrasenya);
    }

}
