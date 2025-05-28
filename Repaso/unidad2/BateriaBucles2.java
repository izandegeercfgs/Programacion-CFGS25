package org.unidad2;

import java.util.Scanner;

public class BateriaBucles2 {
    public static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu contraseña: ");
        String pass = teclado.next();

        String pass2 = "";

        while (!pass.equals(pass2)) {
            System.out.print("Repite tu contraseña: ");
            pass2 = teclado.next();

            if (!pass.equals(pass2)) {
                System.out.println("Error. Contraseña incorrecta. Pruebe de nuevo.");
            }
        }

        System.out.println("Contraseña confirmada correctamente.");
        teclado.close();
    }

    public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
    }

    public static void ejercicio3(){
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio4(){
        Scanner teclado = new Scanner(System.in);

        String palabra = teclado.next();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }

    public static void ejercicio5(){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            int mult = num * i;

            System.out.println(mult);
        }
    }

    public static void ejercicio6(){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
        int num2 = 0;

        for (int i = 0; i < num; i++) {
            num2 += teclado.nextInt();
        }

        System.out.println(num2);
    }

    public static void ejercicio7(){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            long factorial = 1;

            for (i = 1; i <= num; i++) {
                factorial *= i;
            }
            
        }
    }
}
