package org.example;

import javax.lang.model.util.ElementScanner6;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramaE_Seguridad {
    static Scanner teclado;

    public static void casoDePrueba() {

        // inferior a 100
        // ordenados no decreciente (de menor a mayor, si repetidos)
        // AL MENOS UN PRIMO

        String[] datosSpl = teclado.nextLine().split(" ");

        int suma = 0;

        for (int i = 0; i < datosSpl.length; i++) {
            suma += Integer.parseInt(datosSpl[i]);
        }

        if (suma > 100) {
            System.out.println("INVALIDO");
        } else {
            boolean primo = true;

            for(int i = 2; i < datosSpl.length; i++) {
                if (Integer.parseInt(datosSpl[i]) % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("VALIDO");
            }
            else {
                System.out.println("INVALIDO");
            }
        }
    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
