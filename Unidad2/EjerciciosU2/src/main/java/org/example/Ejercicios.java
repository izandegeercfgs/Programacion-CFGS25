package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void altura(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu altura (En cm): ");
        int height = teclado.nextInt();

        if (height <= 150) {
            System.out.println("Persona de altura baja.");
        } else if (height >= 151 && height <= 175) {
            System.out.println("Persona de altura media.");
        } else {
            System.out.println("Persona alta.");
        }
    }
    public void calculadora(){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce el primer operando: ");
            int operando1 = teclado.nextInt();

            System.out.println("Introduce el signo de la operación que deseas realizar:");
            System.out.println("(+) Suma");
            System.out.println("(-) Resta");
            System.out.println("(*) Multiplicación");
            System.out.println("(/) División");
            System.out.println("(R) Raíz Cuadrada");
            String signo = teclado.next();

            if (signo.equals("+") || signo.equals("-") || signo.equals("*") || signo.equals("/") || signo.equals("R")) {
                if (signo.equals("R")) {
                    int resultado = (int) Math.sqrt(operando1);
                    System.out.println("Raiz cuadrada de " + operando1 + " = " + resultado);
                } else {
                    System.out.println("Introduce el segundo operando: ");
                    int operando2 = teclado.nextInt();

                    switch (signo){
                        case "+":
                            int suma = operando1 + operando2;
                            System.out.println(operando1 + signo + operando2 + "=" + suma);
                            break;

                        case "-":
                            int resta = operando1 - operando2;
                            System.out.println(operando1 + signo + operando2 + "=" + resta);
                            break;

                        case "*":
                            if (operando2 == 0) {
                                System.out.println(operando1 + signo + operando2 + " = 0");
                            } else {
                                int multiplicacion = operando1 * operando2;
                                System.out.println(operando1 + signo + operando2 + " = " + multiplicacion);
                            }
                            break;
                        case "/":
                            double division = (double) operando1 / operando2;
                            System.out.println(operando1 + signo + operando2 + "=" + division);
                            break;
                        default:
                            System.out.println("ERROR.");
                    }
                }
            } else {
                System.out.println("ERROR. Introduce uno de los signos permitidos.");
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }

}

