package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

    public static void main(String[] args) {

        try {
            BufferedWriter escribir = new BufferedWriter((new FileWriter("src/main/resources/prueba_escribir.txt")));
            escribir.write("David bueno vs David Malo.");
            escribir.flush();
            escribir.newLine();
            escribir.write(("Esto es una linea flusheada."));
        } catch (IOException e) {
            System.out.println("Ha ocurrido un problema.");
            e.printStackTrace();
        }


    }
}
