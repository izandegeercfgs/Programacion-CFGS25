package org.example;

import java.util.Scanner;
import java.lang.String;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner
        boolean formato = false;

        while (!formato) {
            System.out.println("Introduce tu fecha de nacimiento, el formato debe ser (dd/mm/aaaa) y contener numeros válidos: ");
            String fecha = entradaEscaner.nextLine();

            if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
                try {
                    // Establecer posición númerica de dia, mes y año
                    String day = fecha.substring(0, 2);
                    String month = fecha.substring(3, 5);
                    String year = fecha.substring(6, 10);

                    // Pasar a número el string de dia, mes y año
                    int dayint = Integer.parseInt(day);
                    int monthint = Integer.parseInt(month);
                    int yearint = Integer.parseInt(year);

                    // Validar que día, mes y año están dentro de baremos posibles
                    if (dayint >= 1 && dayint <= 31 && monthint >= 1 && monthint <= 12 && yearint >= 1900 && yearint <= 2024) {
                        formato = true;

                        // Crear variable suma, sumando el día, mes y año, lo que da el numero de la suerte
                        int suma = dayint + monthint + yearint;
                        System.out.println(dayint + " + " + monthint + " + " + yearint + " = " + suma);

                        // Suma los dígitos
                        int sumafecha = 0;
                        int i = 0;
                        while (i < valueOf(suma).length()) {
                            sumafecha += Integer.parseInt(String.valueOf(valueOf(suma).charAt(i)));
                            i++;
                        }

                        System.out.println("Tu número de la suerte es: " + sumafecha);
                    } else {
                        // En caso de que el formato dd/mm/aaaa, salta error
                        System.out.println("ERROR. La fecha debe introducirse en formato dd/mm/aaaa con valores válidos. Intenta de nuevo: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: La fecha contiene valores no numéricos. Intenta de nuevo: ");
                }
            } else {
                System.out.println("ERROR. Formato incorrecto. Intenta de nuevo: ");
            }
        }
    }
}