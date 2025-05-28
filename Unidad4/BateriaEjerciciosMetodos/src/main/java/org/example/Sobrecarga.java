package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Sobrecarga {
    static String saludar()
    {
        return "Hola, cómo estás??";
    }
    static String saludar(String nombre)
    {
        return "Hola " + nombre + ", cómo estás??";
    }
    static String saludar(String nombre, String ciudad)
    {
        return "Hola" + nombre + ", qué tal por "+ciudad+"??";
    }
}

class Trifelios {

    static Scanner teclado;

    public static void casoDePrueba() {

        String datos = teclado.nextLine();
        String datos_linea[] = datos.split(" ");

        System.out.println(Arrays.toString(datos_linea));

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main

}