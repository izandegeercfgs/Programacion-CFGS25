package org.example;

import java.io.*;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        File fichero1 = new File("src/main/resources/nombre(1).txt");
        File fichero2 = new File("src/main/resources/nombre(2).txt");

        // EL fichero en el que se juntarán archivos 1 y 2
        File fichero3 = new File("src/main/resources/nombre(3).txt");

        try {
            PrintWriter writerPrincipio = new PrintWriter(new FileWriter(fichero1));
            writerPrincipio.println("Hola Mortadelo.");
            writerPrincipio.close();

            PrintWriter writerPrincipio2 = new PrintWriter(new FileWriter(fichero2));
            writerPrincipio2.println("Hola Filemón.");
            writerPrincipio2.close();


            Scanner lector1 = new Scanner(fichero1);
            Scanner lector2 = new Scanner(fichero2);

            PrintWriter writer = new PrintWriter(new FileWriter(fichero3));

            do {
                if (lector1.hasNext()) {
                    writer.print(lector1.next() + " ");
                } else if (lector2.hasNext()) {
                    writer.print(lector2.next() + " ");
                }
            } while (lector1.hasNext() || lector2.hasNext());

            writer.close();
            lector1.close();
            lector2.close();
            System.out.println("Los archivos han sido combinados.");
            System.out.println("Ruta del nuevo archivo donde se combinan fichero 1 y fichero 2: " + fichero3.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
