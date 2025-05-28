package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosMetodos {
    public static void main() {
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

    public static void comprobaropcion (String opcion, String resultado){
        if (resultado.equalsIgnoreCase(opcion)) {
            System.out.println("> Ha ganado 2.");
        } else {
            System.out.println("> Ha perdido 2.");
        }
    }

    public static String sorteo() {
        Random aleatorio = new Random();
        String[] opciones = {"Cara", "Cruz"};

        String resultado = opciones[aleatorio.nextInt(2)];

        // También sirve (return opciones(aleatorio.nextInt(2));)
        return resultado;
    }
}
