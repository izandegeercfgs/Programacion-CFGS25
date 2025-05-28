package org.example;

import java.io.File;
import java.nio.file.Files;
import java.sql.ClientInfoStatus;

public class Listar {
    public static void main(String[] args) {
        File carpeta = new File("src/main/resources");

        String ficheros[] = carpeta.list();

        if (ficheros != null && ficheros.length > 0) {
            for(String fichero : ficheros) {
                System.out.println(fichero);
            }
        } else {
            System.out.println("El directorio está vacio.");
        }

        File[] ficheritos = carpeta.listFiles();

        if (ficheritos != null && ficheritos.length > 0) {
            for (File fichero : ficheritos) {
                if (fichero.isFile()) {
                    System.out.println("Fichero con nombre " + fichero.getName() + " con tamaño " + fichero.length() + " bytes.");
                }
            }
        } else {
            System.out.println("El directorio está vacio :(");
        }

    }
}
