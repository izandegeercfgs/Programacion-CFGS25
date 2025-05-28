package org.unidad2;


import java.util.Random;
import java.util.Scanner;

public class BateriaRandom {
    public static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        int random1 = random.nextInt(0,50);
        int random2 = random.nextInt(0,50);

        int suma = random1 + random2;

        System.out.println("Los numeros random son: " + random1 + " y " + random2 + ". Cuya suma es: " + suma);
    }

    public static void ejercicio2(){
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

    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce el rango mínimo: ");
        int min = teclado.nextInt();

        System.out.print("Introduce el rango máximo: ");
        int max = teclado.nextInt();


        if (min > max) {
            System.out.println("El mínimo debe de ser más pequeño que el grande.");
        } else {
            System.out.print("Introduce la cantidad de números: ");
            int num = teclado.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println(random.nextInt((max - min + 1) + min));
            }
        }
    }

    public static void ejercicio4(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        int longitud = random.nextInt(6,8);
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
