package org.unidad4.Teoria.RecursividadEj;

import java.util.Scanner;

public class Ejercicio2 {
    public static int suma (int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + suma(numero - 1);  // Llamada recursiva con el número decrementado
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int resultado = suma(numero);

        System.out.println(resultado);
    }
}
