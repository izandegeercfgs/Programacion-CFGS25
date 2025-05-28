package Ejercicios;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class Ejercicio4 {

    public static void main(String[] args){

        Futbolista futbolista1 = new Futbolista("Iker Casillas", "El España", 114);
        Futbolista futbolista2 = new Futbolista("Leo Messi", "Barsa", 1500000);
        Futbolista futbolista3 = new Futbolista("Nino", "Elche", 943);

        HashMap<String, Futbolista> mapaFurbo = new HashMap<>();
        mapaFurbo.put("El españa", futbolista1);
        mapaFurbo.put("Barsa", futbolista2);
        mapaFurbo.put("Elche", futbolista3);

        try {
            ObjectOutputStream mapaSerializacion = new ObjectOutputStream(new FileOutputStream("src/main/resources/futbolistas.ser"));
            mapaSerializacion.writeObject(mapaFurbo);
            mapaSerializacion.close();
        } catch (IOException e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }

        try{
            ObjectInputStream leerMapa = new ObjectInputStream(new FileInputStream("src/main/resources/futbolistas.ser"));
            HashMap<String, Futbolista> mapaLeido = (HashMap<String, Futbolista>) leerMapa.readObject();
            leerMapa.close();

            TreeMap<String, Futbolista> ordenarMapa = new TreeMap<>(mapaLeido);
            for (String o:ordenarMapa.keySet()) {
                System.out.println("Equipo: " + o + " > Datos: " + ordenarMapa.get(o));
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }

    }
}
