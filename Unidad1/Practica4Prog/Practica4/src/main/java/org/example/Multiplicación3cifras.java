package org.example;

import java.util.Scanner;

public class Multiplicación3cifras {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez
        int multiplicando = 0;
        int multiplicador = 0;

        try {
            // Primer número
            System.out.print("Introduce el multiplicando (3 cifras): "); // Pedir primer número
            multiplicando = entradaEscaner.nextInt();

            while (multiplicando < 100 || multiplicando > 999) { // Si es 99 o 1000 deja de tener 3 cifras
                System.out.println("ERROR. Introduce un número de 3 cifras, positivo y mayor que 0.");
                multiplicando = entradaEscaner.nextInt();
            }
            System.out.println("Tu primer número es " + multiplicando);

            // Segundo número
            System.out.print("Introduce otro multiplicando (3 cifras): "); // Pedir segundo número
            multiplicador = entradaEscaner.nextInt();

            while (multiplicador < 100 || multiplicador > 999) { // Si es 99 o 1000 deja de tener 3 cifras
                System.out.println("ERROR. Introduce un número de 3 cifras.");
                multiplicador = entradaEscaner.nextInt();
            }
            System.out.println("Tu segundo número es " + multiplicador);

            // Conversión multiplicando a cadena para obtener las primeras tres cifras
            String multiplicandoStr = Integer.toString(multiplicando);
            String multiplicando_1Str = multiplicandoStr.substring(0, 1);
            String multiplicando_2Str = multiplicandoStr.substring(1, 2);
            String multiplicando_3Str = multiplicandoStr.substring(2, 3);
            int multiplicando_1 = Integer.parseInt(multiplicando_1Str);
            int multiplicando_2 = Integer.parseInt(multiplicando_2Str);
            int multiplicando_3 = Integer.parseInt(multiplicando_3Str);

            // Conversión multiplicador a cadena para obtener las tres cifras del multiplicador
            String multiplicadorStr = Integer.toString(multiplicador);
            String multiplicador_1Str = multiplicadorStr.substring(0, 1);
            String multiplicador_2Str = multiplicadorStr.substring(1, 2);
            String multiplicador_3Str = multiplicadorStr.substring(2, 3);
            int multiplicador_1 = Integer.parseInt(multiplicador_1Str);
            int multiplicador_2 = Integer.parseInt(multiplicador_2Str);
            int multiplicador_3 = Integer.parseInt(multiplicador_3Str);

            System.out.println("El producto de la multiplicación es: " + multiplicador * multiplicando);

            System.out.println("\s\s\s" + multiplicando);
            System.out.println("x  " + multiplicador);
            System.out.println("------");
            System.out.println(("\s\s" + multiplicando * multiplicador_1));
            System.out.println(("\s" + multiplicando * multiplicador_2) + "x");
            System.out.println((multiplicando * multiplicador_3) + "xx");
            System.out.println("------");
            System.out.println((multiplicando * multiplicador));

        } catch (Exception e) {
            System.out.println("ERROR. Se ha producido una excepción, vuelve a iniciar el programa e introduce un número válido.");
        }
    }
}
