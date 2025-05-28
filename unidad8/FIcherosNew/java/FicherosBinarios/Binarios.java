package FicherosBinarios;

import java.io.*;

public class Binarios {
    public static void main(String[] args) {
        //DataOutputStream
        //FileOutputStream

        try {
            DataOutputStream fichero_binario = new DataOutputStream(new FileOutputStream(("src/main/resources/ficherito.bin")));
            fichero_binario.writeBoolean(true);
            fichero_binario.writeDouble(3.1415);
            fichero_binario.writeInt(100);
            fichero_binario.writeUTF("Mauro putero");
            fichero_binario.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        try {
            DataInputStream leer = new DataInputStream((new FileInputStream("src/main/resources/ficherito.bin")));
            boolean Booleano = leer.readBoolean();
            double p1 = leer.readDouble();
            int num = leer.readInt();
            String caracteres = leer.readUTF();
            leer.close();
            System.out.println(Booleano + " " + p1 + " " + num + " " + caracteres);
        } catch (IOException e) {
            System.out.println("Algo fue mal papasito.");
            e.printStackTrace();
        }

        try {
            FileInputStream leer_a_ciegas = new FileInputStream("src/main/resources/ficherito.bin");
            int bytes;
            while ((bytes = leer_a_ciegas.read()) != -1) {
                System.out.print((char) bytes);
            }
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}