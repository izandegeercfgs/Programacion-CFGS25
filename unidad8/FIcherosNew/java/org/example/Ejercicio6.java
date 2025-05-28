package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/Ejercicio6.txt"));
            Scanner teclado = new Scanner(System.in);
            Map<String, Integer> contadorPalabras = new HashMap<>();

            String lineaFichero;
            while ((lineaFichero = lector.readLine()) != null) {
                String[] palabras = lineaFichero.split("[\\s.,]+");
                for (String palabra : palabras) {
                    palabra = palabra.trim().toLowerCase(); // Normalizar
                    if (!palabra.isEmpty()) {
                        contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            System.out.print("Introduce palabra a buscar: ");
            String palabra_buscar = teclado.nextLine().trim().toLowerCase();

            int apariciones = contadorPalabras.getOrDefault(palabra_buscar, 0);
            System.out.println("La palabra " + palabra_buscar + " aparece " + apariciones + " veces.");

            lector.close();
            teclado.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
