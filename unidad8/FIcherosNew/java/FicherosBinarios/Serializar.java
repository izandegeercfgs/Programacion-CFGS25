package FicherosBinarios;

import java.io.*;
import java.util.Date;

public class Serializar {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objeto_serializado = new ObjectOutputStream(new FileOutputStream("src/main/resources/festival.ser"));
            Festival mileanial = new Festival("Nostalgia Milennial", new Date(2024-8-22), 5000, "Alicante");
            objeto_serializado.writeObject(mileanial);
            objeto_serializado.close();
        } catch (IOException e) {
            System.out.println("David el malo se hizo caca en el saco de patatas.");
            e.printStackTrace();
        }

        try {
            ObjectInputStream leer_objeto = new ObjectInputStream((new FileInputStream("src/main/resources/festival.ser")));
            Festival millenials_leido = (Festival) leer_objeto.readObject();
            leer_objeto.close();
            System.out.println("Nombre del festival: " + millenials_leido.getNombre() + "\nFecha:  " + millenials_leido.getFecha() + "\nAforo: " + millenials_leido.getAforo() + "\nLugar: " + millenials_leido.getLugar());
        } catch (IOException | ClassNotFoundException  e) {
            System.out.println("David el malo se hizo caca en el saco de patatas.");
            e.printStackTrace();
        }
    }
}
