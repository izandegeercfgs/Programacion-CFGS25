package org.example;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            Scanner lector = new Scanner(new File("src/main/resources/Ejercicio6.txt"));
            lector.useDelimiter("[.,]+");

            Map<String, Integer> contadorPalabras = new HashMap<>();

            while (lector.hasNext()) {
                String palabra = lector.next().trim().toLowerCase();
                if (!palabra.isEmpty()) {
                    contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                }
            }

            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce palabra a buscar: ");
            String palabraBuscar = teclado.nextLine().trim().toLowerCase();

            int apariciones = contadorPalabras.getOrDefault(palabraBuscar, 0);
            System.out.println("La palabra " + palabraBuscar + " aparece " + apariciones + " veces.");

            lector.close();
            teclado.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
