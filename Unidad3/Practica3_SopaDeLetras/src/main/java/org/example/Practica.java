package org.example;

import java.util.Scanner;

public class Practica {
    public void main() {
        try {
            Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

            System.out.println("\n⦿ Practica 3 - Sopa de letras");

            // Solicitar filas
            System.out.print("\n> Introduce numero de filas: ");
            int filas = teclado.nextInt();

            // Solicitar columnas
            System.out.print("> Introduce numero de columnas: ");
            int columnas = teclado.nextInt();

            // Crear matriz para la sopa de letras
            char[][] matriz = new char[filas][columnas];

            System.out.println("\n⦿ Filas");
            teclado.nextLine(); // Para limpiar el buffer de entrada

            for (int i = 0; i < filas; i++) {
                System.out.print("> Introduce la fila " + (i + 1) + ": "); // Pide las filas desde 0 hasta el nº de filas
                String filaStr = teclado.nextLine();

                boolean formato = filaStr.matches("[a-zA-Z]+");

                if (filaStr.length() != columnas) { // En caso de que el largo del input sea distinto al numero de columnas, da error
                    System.out.println("> ERROR. El input debe tener " + columnas + " caracteres.");
                    return;
                } else if (!formato) { // Comprobación de formato
                    System.out.println("> ERROR. El input no cumple con el formato.");
                    return;
                } else {
                    // Rellenar la matriz con los caracteres
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = filaStr.charAt(j);
                    }
                }
            }

            System.out.println("\n⦿ Sopa de letras");

            // Imprime la matriz
            for (char[] fila : matriz) {
                for (char columna : fila) {
                    System.out.print(columna + " ");
                }
                System.out.println();
            }

            System.out.println("\n⦿ Búsqueda");

            System.out.print("> Introduce la palabra a buscar: ");
            String Busqueda = teclado.nextLine();

            boolean coincidencia = false;

            // Se comprueba en vertical y horizontal si hay coincidencias
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {

                    boolean horizontal = true;

                    // Comprobación horizontal
                    if (columna + Busqueda.length() <= matriz[fila].length) { // Solo si cabe horizontalmente
                        for (int i = 0; i < Busqueda.length(); i++) {
                            if (!String.valueOf(matriz[fila][columna + i]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                                horizontal = false; // Señala que no hay coincidencia
                                break; // Termina la comprobación horizontal
                            }
                        }
                        if (horizontal) { // Si se encuentra una coincidencia horizontal
                            System.out.println("> La palabra " + Busqueda + " existe. Está en la posición (" + fila + "," + columna + ") en horizontal.");
                            coincidencia = true; // Señala que se ha encontrado la palabra
                            break; // Termina el programa
                        }
                    }

                    boolean vertical = true;

                    // Comprobación vertical
                    if (fila + Busqueda.length() <= matriz.length) { // Solo si cabe verticalmente
                        for (int i = 0; i < Busqueda.length(); i++) {
                            if (!String.valueOf(matriz[fila + i][columna]).equalsIgnoreCase(String.valueOf(Busqueda.charAt(i)))) {
                                vertical = false; // Señala que no hay coincidencia
                                break; // Termina la comprobación vertical
                            }
                        }
                        if (vertical) {
                            System.out.println("> La palabra `" + Busqueda + "` existe. Está en la posición (" + fila + "," + columna + ") en vertical.");
                            coincidencia = true; // Señala que se ha encontrado la palabra
                            break; // Termina el programa
                        }
                    }
                }
                if (coincidencia) { // Si la palabra fue encontrada, para el programa
                    break; // Termina el programa
                }
            }

            if (!coincidencia) { // En caso de no haber coincidencia, da error
                System.out.println("> ERROR. La palabra no existe.");
            }
        } catch (Exception e) {
            System.out.println("> ERROR. Ha ocurrido una excepción: " + e.getMessage());
        }
    }
}
