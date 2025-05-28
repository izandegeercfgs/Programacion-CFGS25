package Ejercicios;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        Turron turron1 = new Turron("Turrones y Dulces", "Xixona", 290);
        Turron turron2 = new Turron("Turrones Xixona", "Xixona", 190);
        Turron turron3 = new Turron("Turrones Paco", "Berlin", 150);

        ArrayList<Turron> listaTurrones = new ArrayList<>();
        listaTurrones.add(turron1);
        listaTurrones.add(turron2);
        listaTurrones.add(turron3);

        try {
            ObjectOutputStream turronSerializado = new ObjectOutputStream(new FileOutputStream("src/main/resources/turrones.ser"));
            turronSerializado.writeObject(listaTurrones);
            turronSerializado.close();
        } catch (IOException e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }

        try {
            ObjectInputStream leerTurron = new ObjectInputStream(new FileInputStream("src/main/resources/turrones.ser"));
            ArrayList<Turron> turronLeido = (ArrayList<Turron>) leerTurron.readObject();
            leerTurron.close();

        for (Turron turron_i : turronLeido) {
            System.out.println("Marca del turrón: " + turron_i.getMarca() +
                    ". \nProcedencia: " + turron_i.getProcedencia() +
                    ". \nGramos: " + turron_i.getGramos() + ".\n");
        }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe. Se han creado datos por defecto.");
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException  e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }
    }

    public static void datosDefault() {
        ArrayList<Turron> listaTurronesDefault = new ArrayList<>();
        listaTurronesDefault.add(new Turron("Turrones y Dulces", "Xixona", 350));
        listaTurronesDefault.add(new Turron("Turrones Paco", "Berlin", 250));

        try {
            ObjectOutputStream turronSerializado = new ObjectOutputStream(new FileOutputStream("src/main/resources/turrones.ser"));
            turronSerializado.writeObject(listaTurronesDefault);
            turronSerializado.close();
        } catch (IOException e) {
            System.out.println("No funciona.");
            throw new RuntimeException(e);
        }

        for (Turron turron_i : listaTurronesDefault) {
            System.out.println("Marca del turrón: " + turron_i.getMarca() +
                    ". \nProcedencia: " + turron_i.getProcedencia() +
                    ". \nGramos: " + turron_i.getGramos() + ".\n");
        }
    }
}
