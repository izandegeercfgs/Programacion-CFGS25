package org.example;

/**
 * Clase para contar el número de tabletas necesarias para hacer una Tarta Sacher, adaptado al juez de acepta_tu_reto
 *
 * @author Izan de Geer
 * @version 1.0 (13/12/2024)
 */

public class solution_juez {
    static java.util.Scanner teclado;

    public static void casoDePrueba() {
        // TU CÓDIGO AQUÍ

        // Leer entrada
        String x = teclado.nextLine();
        String[] tarta = x.split(" ");

        // Se nombra las variables en las que se divide el String[] tarta
        int n = Integer.parseInt(tarta[0]);
        int m = Integer.parseInt(tarta[1]);
        int r = Integer.parseInt(tarta[2]);

        // Calcular número mínimo de cuadritos para la tarta
        int total = n * m;
        int r_necesario = (r + total - 1) / total;

        System.out.println(r_necesario);
    } // casoDePrueba

    /**
     * Metodo main del programa en el que se pregunta cuantas veces se va a pedir el numero de casos
     * @param args
     */
    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        int numCasos = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    } // main
} // class solution
