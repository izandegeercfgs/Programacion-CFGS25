package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos ficheros quieres?: ");
        int num = teclado.nextInt();
        System.out.print("¿En qué carpeta los quieres?: ");
        teclado.nextLine();

        String carpeta = teclado.next();

        File comprobarCarpeta = new File(carpeta);
        if (comprobarCarpeta.exists()) {
            BufferedWriter escribir = null;
            for (int i = 1; i <= num; i++) {
                File fichero = new File(carpeta + "/nombre(" + i + ").txt");
                try {
                    fichero.createNewFile();
                    escribir = new BufferedWriter((new FileWriter("src/main/resources/" + fichero.getName())));
                    escribir.write("Este es el fichero " + fichero.getName());
                    escribir.newLine();
                    System.out.println("Fichero " + fichero.getName() + " ñeñeñeñeñeñeñeñe creado.");
                } catch (IOException e) {
                    System.out.println("Fichero " + fichero.getName() + " ñeñeñeñeñeñeñeñe fallado.");
                    e.printStackTrace();
                }
                try {
                    escribir.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            System.out.println("Cagaste papuñuelo.");
        }
    }
}
