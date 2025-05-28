package org.unidad4.Teoria.RecursividadEj;

import java.util.Scanner;

public class Ejercicio1 {
    public static int recuento (int numero) {
        return numero + 1;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(recuento(i));
        }
    }
}
