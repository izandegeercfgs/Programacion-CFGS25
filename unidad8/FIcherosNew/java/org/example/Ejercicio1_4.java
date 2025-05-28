package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos ficheros quieres?: ");
        int num = teclado.nextInt();
        System.out.print("¿En qué carpeta los quieres?: ");
        teclado.nextLine();

        String carpeta = teclado.next();

        File comprobarCarpeta = new File(carpeta);
        if (comprobarCarpeta.exists()) {
            for (int i = 1; i <= num; i++) {
                File fichero = new File(carpeta + "/nombre(" + i + ").txt");
                try {
                    fichero.createNewFile();
                    System.out.println("Fichero " + fichero.getName() + " ñeñeñeñeñeñeñeñe creado.");
                } catch (IOException e) {
                    System.out.println("Fichero " + fichero.getName() + " ñeñeñeñeñeñeñeñe fallado.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Cagaste papuñuelo.");
        }
    }
}
