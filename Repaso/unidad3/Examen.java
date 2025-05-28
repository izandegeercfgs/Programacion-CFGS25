package org.unidad3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    public static void examen(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numBolas = random.nextInt(10,40);

        Integer[] bombo = new Integer[numBolas];

        for (int i = 0; i < bombo.length; i++) {
            int nuevoNumero;
            boolean esDuplicado;
            do {
                nuevoNumero = random.nextInt(1, 90 + 1);
                esDuplicado = false;

                for (int j = 0; j < i; j++) {
                    if (bombo[j] != null && bombo[j] == nuevoNumero) {
                        esDuplicado = true;
                        break;
                    }
                }
            } while (esDuplicado);

            bombo[i] = nuevoNumero;
        }

        Integer[] bomboOrd = bombo.clone();

        Arrays.sort(bomboOrd);

        int filas = 3;
        int columnas = 3;

        String carton[][] = new String[filas][columnas];

        System.out.println("\n** BINGO CASINO BRITÁNICO **");
        System.out.println("-----------------------------");

        System.out.print("** " + numBolas + " extraidas hasta el momento: ");

        System.out.println(Arrays.toString(bomboOrd));
        System.out.print("\n= Bienvenido, introduzca los datos de su cartón: \n");

        for (int i = 0; i < filas; i++) {
            System.out.print("-> Fila nº" + (i + 1) + ": ");
            String fila = teclado.next();
            String[] filaSpl = fila.split("-");

            if (filaSpl.length != columnas) {
                System.err.println("x ERROR. Debe introducir exactamente " + columnas + " números. Repita la fila...");
                i--;
                continue;
            }

            for (int j = 0; j < columnas; j++) {
                carton[i][j] = filaSpl[j];
            }
        }

        // Imprimir boleto
        System.out.println("\n= Su boleto es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(carton[i][j] + "\t");
            }
            System.out.println();
        }

        int numero = 0;
        int contBingo = 0;
        int contLinea = 0;

        System.out.println("= Procedemos a comprobar posibles premios...");
        // Comprobar bingo
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numero = Integer.parseInt(carton[i][j]);
                boolean contenido = Arrays.asList(bomboOrd).contains(numero);

                if (contenido) {
                    contBingo++;
                }
            }
        }
        // Comprobar lineas
        for (int i = 0; i < filas; i++) {
            int contFila = 0;
            for (int j = 0; j < columnas; j++) {
                numero = Integer.parseInt(carton[i][j]);
                boolean contenido = Arrays.asList(bomboOrd).contains(numero);

                if (contenido) {
                    contFila++;
                }
            }
            if (contFila == columnas) {
                contLinea++;
            }
        }


        System.out.println("\n** PREMIOS **");
        System.out.println("---------------");

        // Comprobar bingo
        if (contBingo == 9) {
            System.out.print("Bingo: ");
            System.out.println("¡ENHORABUENA! Ha ganado usted el bingo.");
        } else {
            System.out.print("Bingo: ");
            System.err.println("¡Lo sentimos! No ha habido suerte.");
        }

        // Comprobar lineas

        for (int i = 0; i < filas; i++) {
            int contFila = 0;
            for (int j = 0; j < columnas; j++) {
                numero = Integer.parseInt(carton[i][j]);
                boolean contenido = Arrays.asList(bomboOrd).contains(numero);

                if (contenido) {
                    contFila++;
                }
            }
            if (contFila == columnas) {
                System.out.print("Linea " + (i + 1) + ":");
                System.out.println("¡ENHORABUENA! Ha ganado usted la línea " + (i + 1) + ".");
            } else {
                System.out.print("Linea " + (i + 1) + ":");
                System.err.println("¡Lo sentimos! No ha habido suerte.");
            }
        }
    }
}
