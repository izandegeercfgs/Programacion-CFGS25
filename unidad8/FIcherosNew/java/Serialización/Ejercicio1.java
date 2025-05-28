package Ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Ejercicio1 {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat", "Leon", 150);
        Coche coche2 = new Coche("Peugeot", "308", 130);
        Coche coche3 = new Coche("Toyota", "Corolla", 180);

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        try {
            ObjectOutputStream coche_serializado = new ObjectOutputStream(new FileOutputStream("src/main/resources/coche.ser"));
            coche_serializado.writeObject(listaCoches);
            coche_serializado.close();
        } catch (IOException e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }

        try {
            ObjectInputStream leer_coche = new ObjectInputStream((new FileInputStream("src/main/resources/coche.ser")));
            ArrayList<Coche> coches_leido = (ArrayList<Coche>) leer_coche.readObject(); 
            leer_coche.close();

            for (Coche coche_i : coches_leido) {
                System.out.println("Marca del coche: " + coche_i.getMarca() +
                        ". \nModelo: " + coche_i.getModelo() +
                        ". \nCaballos: " + coche_i.getCaballos() + ".\n");
            }        } catch (IOException | ClassNotFoundException  e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }
    }
}
