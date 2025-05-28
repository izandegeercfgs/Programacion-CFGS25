package org.unidad4.Teoria;

public class Recursividad2 {
    public static int fibonacci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("fib(" + i + ") = " + fibonacci(i));
        }
    }
}
