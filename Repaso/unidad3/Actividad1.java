package org.unidad3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Actividad1 {
    public static void ruleta(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String[] colores = {"rojo", "negro"};
        Integer[] numeros = new Integer[37];
        String[] paridad = {"par", "impar"};

        for (int i = 0; i < numeros.length; i++) {numeros[i] = i;}

        int numero = 0;
        String par = "";
        String color = "";
        boolean token = false;

        int ran_numero = random.nextInt(37);
        int random_numero = numeros[ran_numero];
        int ran_color = random.nextInt(2);
        String random_color = colores[ran_color];
        boolean random_par = false;

        if (random_numero % 2 == 0) {
            random_par = true;
        }

        System.out.println("** LA RULETA DE LA SUERTE **");
        System.out.println("-----------------------------");
        System.out.print("= Bienvenido, introduzca un número: ");
        numero = teclado.nextInt();

        boolean num_valido = Arrays.asList(numeros).contains(numero);

        if (!num_valido) {
            System.err.println("x Error. Saliendo del programa...");
        } else if (num_valido) {
            System.out.print("= Número valido. Escoja color (rojo-negro): ");
            color = teclado.next();

            boolean color_valido = Arrays.asList(colores).contains(color);

            if (color_valido) {
                System.out.print("= Color válido. Escoja paridad (par-impar): ");
                par = teclado.next();

                boolean par_valido = Arrays.asList(paridad).contains(par);

                if (par_valido) {
                    token = true;
                } else {
                    System.err.println("x Error. Saliendo del programa...");
                }
            } else {
                System.err.println("x Error. Saliendo del programa...");
            }
        }

        if (token) {
            System.out.println("\n = Procedemos a hacer el sorteo...");
            System.out.println("** El resultado del sorteo ha sido el siguiente: ");
            System.out.println("-----------------------------");

            if (random_par) {
                System.out.println("* Número ganador (PAR): " + random_numero);
                System.out.println("* Color ganador: " + random_color);
            } else if (!random_par) {
                System.out.println("* Número ganador (IMPAR): " + random_numero);
                System.out.println("* Color ganador: " + random_color);
            }

            System.out.println("\n = Comprobando resultado...");
            System.out.println("-----------------------------");

            int cont = 0;

            if (numero == random_numero) {
                System.out.println("* Su numero: " + numero + " ha sido seleccionado como ganador. ¡Enhorabuena!");
                cont++;
            } else {
                System.err.println("* Su numero: " + numero + " NO ha sido seleccionado como ganador. ¡Lo sentimos!");
            }

            if (Objects.equals(color, random_color)) {
                System.out.println("* Su color: " + color + " ha sido seleccionado como ganador. ¡Enhorabuena!");
                cont++;
            } else {
                System.err.println("* Su color: " + color + " NO ha sido seleccionado como ganador. ¡Lo sentimos!");
            }

            if (cont > 2) {
                System.out.println("*** ¡Enhorabuena, ha ganado! ***");
            } else {
                System.err.println("*** ¡Lo sentimos, ha perdido! ***");
            }
        }


    }
}
