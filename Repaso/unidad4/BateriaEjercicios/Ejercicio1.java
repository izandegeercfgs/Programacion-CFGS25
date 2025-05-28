package org.unidad4.BateriaEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    static int cubo(int numero){
        return numero * numero * numero;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        int resultado = cubo(numero);
        System.out.println("El cubo de " + numero + " es " + resultado);
    }
}



