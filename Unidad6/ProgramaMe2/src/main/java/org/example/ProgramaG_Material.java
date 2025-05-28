package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaG_Material {
    static Scanner teclado;

    public static void casoDePrueba() {

        String[] datos = teclado.nextLine().split(" ");
        Arrays.sort(datos);

        int a = Integer.parseInt(datos[0]);
        int b = Integer.parseInt(datos[1]);
        int c = Integer.parseInt(datos[2]);

        int temporal = 0;

        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }

        int temporal2 = 0;

        while (c != 0) {
            temporal2 = c;
            c = a % c;
            a = temporal2;
        }

        System.out.println(temporal2);

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
