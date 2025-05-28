package org.unidad2;

import java.util.Scanner;

public class Practica2 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido, introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre + ". Introduce el primer operando: ");
        int Operando1 = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Ahora introduce el tipo de operación: ");
        System.out.println("Suma (+)");
        System.out.println("Resta (-)");
        System.out.println("Multiplicación (x)");
        System.out.println("División (/)");
        System.out.println("Raiz cuadrada (R)");

        String operacion;
        do {
            operacion = teclado.nextLine();
        } while (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("x") && !operacion.equals("/") && !operacion.equals("R"));

        int Operando2 = 0;
        if (!operacion.equals("R")) {
            System.out.println("Introduce el segundo operando: ");
            Operando2 = teclado.nextInt();
        }

        switch (operacion) {
            case "+":
                int suma = Operando1 + Operando2;
                System.out.println("El resultado es " + suma);
                return;
            case "-":
                int resta = Operando1 - Operando2;
                System.out.println("El resultado es " + resta);
                return;
            case "x":
                int multiplicacion = Operando1 * Operando2;
                System.out.println("El resultado es " + multiplicacion);
                return;
            case "/":
                int division = Operando1 / Operando2;
                System.out.println("El resultado es " + division);
                return;
            case "R":
                double R = Math.sqrt(Operando1);
                System.out.println("El resultado es " + R);
                return;
            default:
                System.out.println("Error.");
        }
    }
}
