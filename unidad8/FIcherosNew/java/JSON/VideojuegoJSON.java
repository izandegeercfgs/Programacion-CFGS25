package JSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VideojuegoJSON {
    
    static Scanner teclado = new Scanner(System.in);
    static List<Videojuego> listaVideojuegos = new ArrayList<>();
    
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("GESTIÓN DE INVENTARIO - VIDEOJUEGOS");
        System.out.println("***********************************");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Introduce los datos del videojuego nº" + i + ": ");
            nuevoJuego(listaVideojuegos);
        }

        try (FileWriter writer = new FileWriter("src/main/resources/videojuego.json")) {
            gson.toJson(listaVideojuegos, writer);
            System.out.println("JSON guardado en videojuego.json");
        } catch (Exception e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }


        List<Videojuego> videojuegosFiltrados = new ArrayList<>();

        System.out.println("\nLista de videojuegos");
        System.out.println("********************");
        for (Videojuego v : listaVideojuegos) {
                System.out.println(v);
        }


        System.out.println("\nLista de videojuegos (Reconstruida)");
        System.out.println("*************************************");
        try {
            FileReader reader = new FileReader("src/main/resources/videojuego.json");
            Videojuego[] listaArray = gson.fromJson(reader, Videojuego[].class);

            List<Videojuego> nuevaLista = new ArrayList<>(Arrays.asList(listaArray));

            for (Videojuego v : nuevaLista) {
                System.out.println(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Añadir nuevo juego: ");
        nuevoJuego(listaVideojuegos);

        System.out.println("\nLista de videojuegos <30€");
        System.out.println("*************************");
        for (Videojuego v : listaVideojuegos) {
            if (v.getPrecio() < 30) {
                System.out.println(v);
                videojuegosFiltrados.add(v);
            }
        }

        listaVideojuegos = videojuegosFiltrados;

        try (FileWriter writer = new FileWriter("src/main/resources/videojuego_filtro.json")) {
            gson.toJson(listaVideojuegos, writer);
            System.out.println("\nJSON guardado en videojuego.json");
        } catch (Exception e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }

    public static void nuevoJuego(List<Videojuego> listaVideojuegos) {
        System.out.print("> Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("> Plataforma: ");
        String plataforma = teclado.nextLine();

        System.out.print("> Precio: ");
        double precio = teclado.nextDouble();

        System.out.print("> Disponibilidad ('true': Sí / 'false': No): ");
        boolean disponible = teclado.nextBoolean();

        teclado.nextLine();

        System.out.print("> Género/s (En caso de haber más de uno, debe de ir separado por un slash (/): ");
        List<String> generos = Arrays.asList(teclado.nextLine().split("/"));
        System.out.println("");

        listaVideojuegos.add(new Videojuego(nombre, plataforma, precio, disponible, generos));

        System.out.println("El vieojuego ha sido introducido con éxito. \n");
    }
}
