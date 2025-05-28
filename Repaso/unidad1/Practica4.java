package org.unidad1;

import java.util.Scanner;

public class Practica4 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        // Pide el multiplicando
        System.out.print("Introduce el multiplicando (3 cifras): ");
        int multiplicando = teclado.nextInt();
        String Str_multiplicando = Integer.toString(multiplicando);
        String Str_multiplicando_1 = Str_multiplicando.substring(0,1);
        String Str_multiplicando_2 = Str_multiplicando.substring(1,2);
        String Str_multiplicando_3 = Str_multiplicando.substring(2,3);
        int multiplicando_1 = Integer.parseInt(Str_multiplicando_1);
        int multiplicando_2 = Integer.parseInt(Str_multiplicando_2);
        int multiplicando_3 = Integer.parseInt(Str_multiplicando_3);

        // Pide el multiplicador
        System.out.print("Introduce el multiplicador (3 cifras): ");
        int multiplicador = teclado.nextInt();
        String Str_multiplicador = Integer.toString(multiplicando);
        String Str_multiplicador_1 = Str_multiplicador.substring(0,1);
        String Str_multiplicador_2 = Str_multiplicador.substring(1,2);
        String Str_multiplicador_3 = Str_multiplicador.substring(2,3);
        int multiplicador_1 = Integer.parseInt(Str_multiplicador_1);
        int multiplicador_2 = Integer.parseInt(Str_multiplicador_2);
        int multiplicador_3 = Integer.parseInt(Str_multiplicador_3);

        // Multiplica multiplicando * multiplicador
        int producto = multiplicando * multiplicador;
        int producto_1 = multiplicando * multiplicador_1;
        int producto_2 = multiplicando * multiplicador_2;
        int producto_3 = multiplicando * multiplicador_3;
        String lineas = "--------";

        System.out.println("El producto de la multiplicación es: " + producto);
        System.out.println("  " + multiplicando);
        System.out.println("x " + multiplicador);
        System.out.println(lineas);
        System.out.println("  " + producto_1);
        System.out.println("  " + producto_2 + "x");
        System.out.println("  " + producto_3 + "xx");
        System.out.println(lineas);
        System.out.println("  " + producto);
    }
}
