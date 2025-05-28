package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaA_ProgCoins {
        static Scanner teclado;

        public static void casoDePrueba() {

            String datos = teclado.nextLine();
            String datosSpl[] = datos.split(" ");

            int calculo = Integer.valueOf(datosSpl[0]) / Integer.valueOf(datosSpl[1]);
            int resto =  Integer.valueOf(datosSpl[0]) % Integer.valueOf(datosSpl[1]);

            System.out.println(calculo + " " + resto);
        } // casoDePrueba

        public static void main(String[] args) {

            teclado = new Scanner(System.in);

            int numCasos = teclado.nextInt();
            teclado.nextLine();
            for (int i = 0; i < numCasos; i++)
                casoDePrueba();
        } // main
}
