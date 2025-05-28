package org.unidad4.BateriaEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

    static int suma (int a, int b) {
        return a + b;
    }

    static int resta (int a, int b) {
        return a - b;
    }

    static int multiplicacion (int a, int b) {
        return a * b;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un primer valor: ");
        int a = teclado.nextInt();

        System.out.print("Introduce un segundo valor: ");
        int b = teclado.nextInt();

        System.out.println("> Escoge una opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Salir");

        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("= Resultado de la suma: " + suma(a,b));
                break;
            case 2:
                System.out.println("= Resultado de la resta: " + resta(a,b));
                break;
            case 3:
                System.out.println("= Resultado de la multiplicacion: " + multiplicacion(a,b));
                break;
            case 4:
                break;
        }
    }
}
