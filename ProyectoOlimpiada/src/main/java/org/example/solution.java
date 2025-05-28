package org.example;

/**
 * Clase para contar el número de tabletas necesarias para hacer una Tarta Sacher
 *
 * @author Izan de Geer
 * @version 1.6 (13/12/2024)
 */

public class solution { // Asume fichero llamado solution.java
    static java.util.Scanner teclado;

    /**
     * Metodo secundario del programa en el que se hacen pruebas
     */
    public static void casoDePrueba() {
        try { // Comprueba excepciones
            // TU CÓDIGO AQUÍ

            // Leer entrada
            String x = teclado.nextLine();
            String[] tarta = x.split(" ");

            // Se comprueba el largo de la cadena, si es distinto de 3, falla
            if (tarta.length != 3) {
                System.out.println("ERROR. Formato incorrecto. Introduzca tres números separados por espacio.");
                return;
            }

            // Se nombra las variables en las que se divide el String[] tarta
            int n = Integer.parseInt(tarta[0]); // ancho de la tableta
            int m = Integer.parseInt(tarta[1]); // alto de la tableta
            int r = Integer.parseInt(tarta[2]); // cuadrados necesarios para la tarta


            // Comprueba posibles errores en el input que den error de formato según el enunciado
            if ((n < 1) || (m > 1000) || (m < 0) || (r < 1) || (r > 1000)) {
                System.out.println("ERROR. Se debe cumplir lo siguiente:");
                System.out.println("1. n >= 1");
                System.out.println("2. m >= 0 && m <= 1000");
                System.out.println("3. r >= 1 && r <= 1000");
            } else { // En caso de que NO haya error, calcula los cuadrados necesarios
                int total = n * m; // multiplica alto * ancho para sacar las dimensiones

                int r_necesario = (r + total + 1) / total; // calcula los cuadrados necesarios, redondeando hacia arriba
                if (r % total != 0) { // ayuda al redondeo
                    r_necesario++;
                }
                System.out.println(r_necesario - 1); // imprime el numero de cuadrados necesarios
            }
        } catch (NumberFormatException e1) {
            System.err.println("Error, ha ocurrido una excepción: " + e1); // Da mensaje de error en caso de excepción
        }
    } // casoDePrueba

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);

        if (teclado.hasNextInt()) {
            int numCasos = teclado.nextInt();
            teclado.nextLine();
            for (int i = 0; i < numCasos; i++)
                casoDePrueba();
        } else {
            System.out.println("Error.");
        } // main
    }
} // class solution
