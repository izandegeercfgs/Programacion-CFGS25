package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) {
        File fichero = new File("src/main/resources/prueba.txt");
        try {
            Scanner lector = new Scanner(fichero);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Linea: " + linea);
                String[] palabras = linea.split(",");
                if (palabras.length >= 2) {
                    System.out.println("Alumno: " + palabras[0] + " con nota " + palabras[1]);
                } else {
                    System.out.println("Formato incorrecto en la línea.");
                }
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ow error.");
            throw new RuntimeException(e);
        }
    }
}