package org.example;

import java.io.*;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo a modificar: ");
        String ruta = teclado.nextLine();

        File ficheroModificado = new File(ruta);

        if (!ficheroModificado.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        File ficheroTemporal = new File(ficheroModificado.getParent(), "archivoTemporal_" + ficheroModificado.getName());

        try (
                BufferedReader reader = new BufferedReader(new FileReader(ficheroModificado));
                BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroTemporal))
        ) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split(" ");
                StringBuilder lineaFormateada = new StringBuilder();
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        String palabraMayus = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                        lineaFormateada.append(palabraMayus).append(" ");
                    }
                }
                writer.write(lineaFormateada.toString().trim());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        if (ficheroModificado.delete()) {
            ficheroTemporal.renameTo(ficheroModificado);
            System.out.println("Archivo modificado correctamente.");
        } else {
            System.out.println("No se ha podido reemplazar el archivo original.");
        }

    }
}