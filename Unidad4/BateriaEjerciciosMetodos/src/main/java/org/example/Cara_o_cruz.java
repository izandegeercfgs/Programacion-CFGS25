package org.example;

import java.util.Random;
import java.util.Scanner;

import static org.example.EjerciciosMetodos.sorteo;

public class Cara_o_cruz {
    public static void Principal() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("> Elija: Cara o cruz.");
        String opcion = teclado.next();

        String resultado_sorteo = sorteo();
        if (!resultado_sorteo.equals(opcion)) {
            System.out.println("> Ha ganado");
            System.out.println("> El sorteo ha dado como resultado: " + sorteo());
        } else {
            System.out.println("> Ha perdido");
            System.out.println("> El sorteo ha dado como resultado: " + sorteo());
        }
    }
}
