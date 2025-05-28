package org.unidad2;

import java.util.Scanner;

public class BateriaBucles {
    public static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);

        String password = "password";
        String prueba;

        do {
            System.out.println("Hola usuario, introduzca su contraseña: ");
            prueba = teclado.nextLine();

            if (!password.matches(prueba)){
                System.out.println("Error. La contraseña no es correcta.");
            }

        } while (!password.matches(prueba));

        System.out.println("Enhorabuena. La contraseña es correcta.");

    }
    public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(numero-i);
        }
    }
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0){
                System.out.println(i + " / " +  3  + " = " + i);
            }
        }
    }
    public static void ejercicio4(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(i, i+1));
        }
    }
    public static void ejercicio5(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i <= (numero * 12); i++) {
            if (i % numero == 0){
                System.out.println(numero + " * " +  i  + " = " + i);
            }
        }
    }
    public static void ejercicio6(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres sumar?: ");
        int numero = teclado.nextInt();
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.print("Inserta nº" + i + ": ");
            resultado += teclado.nextInt();
        }

        System.out.println("El resultado es: " + resultado);
    }
    public static void ejercicio7(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            int num = numero * (numero - i);
            System.out.println(num);
        }
    }
    public static void ejercicio8(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.println(cadena.charAt(i));
        }
    }
}
