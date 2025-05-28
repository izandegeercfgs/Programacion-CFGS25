package org.unidad2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BateriaEjercicios {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        // Pide la cadena de los carácteres al usuario
        System.out.print("Introduce una cadena de carácteres: ");
        String cadena = teclado.nextLine();

        // Cuenta los carácteres de la cadena
        int cadena_length = cadena.length();
        System.out.println("La cadena tiene " + cadena_length + " carácteres.");

        // Quita los espacios a la cadena
        String cadena_replace = cadena.replace(" ", "");
        System.out.println("La cadena introducida sin espacios: " + cadena_replace);

        // Divide la cadena de texto
        int mitad = cadena.length() / 2;

        String mitad1 = cadena.substring(0, mitad);
        String mitad2 = cadena.substring(mitad);

        System.out.println("Primera mitad del texto es ".concat(mitad1) + " y la segunda mitad es ".concat(mitad2));

        // Convierte la cadena a mayúsculas
        String cadena_upper = cadena.toUpperCase();
        System.out.println("La cadena en mayúsculas es " + cadena_upper);
    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        // Primera cadena de texto
        System.out.println("Introduce una cadena de texto: ");
        String cadena1 = teclado.nextLine();
        int cadena_largo_1 = cadena1.length();

        // Segunda cadena de texto
        System.out.println("Introduce la segunda cadena de texto: ");
        String cadena2 = teclado.nextLine();
        int cadena_largo_2 = cadena2.length();

        // Comparación de cadenas
        if (cadena_largo_1 > cadena_largo_2) {
            System.out.println("La cadena 1 es más larga.");
        } else if (cadena_largo_2 > cadena_largo_1) {
            System.out.println("La cadena 2 es más larga.");
        } else {
            System.out.println("Las cadenas son iguales");
        }
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        // Variable numérica 1
        System.out.println("Introduce una variable numérica: ");
        int varN = teclado.nextInt();

        // Variable numérica 2
        System.out.println("¿Cuántos números vas a mostrar?");
        int varM = teclado.nextInt();

        // Variable final
        String varN_M = Integer.toString(varN).substring(0, varM);
        System.out.println(varN_M);
    }

    public static void ejercicio4() {
        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";

        int apariciones = texto.split(subcadena, -1).length - 1;

        System.out.println(texto);
        System.out.println("La subcadena '" + subcadena + "' aparece " + apariciones + " veces en el texto.");
    }

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);

        // Jugador 1 introduce la cadena
        System.out.print("Jugador 1, introduce una cadena: ");
        String cadena = teclado.nextLine();

        int intentos = 10;
        boolean acertado = false;

        while (intentos > 0 && !acertado) {
            // Jugador 2 introduce una palabra
            System.out.print("Jugador 2, introduce una palabra: ");
            String palabra = teclado.nextLine();

            // Verificar si la palabra está en la cadena
            if (cadena.contains(palabra)) {
                System.out.println("¡Enhorabuena, has acertado una palabra!");
                acertado = true;
            } else {
                intentos--;
                System.out.println("Intento fallido. Te quedan " + intentos + " intentos.");
            }
        }

        if (!acertado) {
            System.out.println("¡Se acabaron los intentos! Fin del juego.");
        }
    }

    public static void Practica1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");

        String fecha = teclado.nextLine();
        System.out.println(fecha);

        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String anyo = fecha.substring(6);

        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anyo);

        int suma = Integer.parseInt(dia) + Integer.parseInt(mes) + Integer.parseInt(anyo);
        String StrSUma = Integer.toString(suma);

        String Total = StrSUma.substring(0, 1) + " + " + StrSUma.substring(1, 2) + " + " + StrSUma.substring(2, 3) + " + " + StrSUma.substring(3, 4) + " = " + (Integer.parseInt(StrSUma.substring(0, 1)) + Integer.parseInt(StrSUma.substring(1, 2)) + Integer.parseInt(StrSUma.substring(2, 3)) + Integer.parseInt(StrSUma.substring(3, 4)));
        System.out.println(Total);

        int num_suerte = (Integer.parseInt(StrSUma.substring(0, 1)) + Integer.parseInt(StrSUma.substring(1, 2)) + Integer.parseInt(StrSUma.substring(2, 3)) + Integer.parseInt(StrSUma.substring(3, 4)));

        System.out.println("Tu número de la suerte es: " + num_suerte);
    }

    public static void Actividad_hasNextInt() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige un modo: ");
        int modo = teclado.nextInt();
        teclado.nextLine();

        switch (modo) {
            case 1:
                System.out.println("¿Cuál es tu año de nacimiento?");
                String Nacimiento = teclado.nextLine();
                int NacimientoInt = Integer.parseInt(Nacimiento);

                LocalDateTime hoy = LocalDateTime.now();

                if (NacimientoInt >= 1900 && NacimientoInt <= hoy.getYear()) {
                    System.out.print("Perteneces a la siguiente generación: ");
                    if (NacimientoInt >= 1900 && NacimientoInt <= 1927) {
                        System.out.println("Sin generación bautizada (1900-1928)");
                    } else if (NacimientoInt >= 1928 && NacimientoInt <= 1944) {
                        System.out.println("Generación Silent (1928-1944)");
                    } else if (NacimientoInt >= 1945 && NacimientoInt <= 1964) {
                        System.out.println("Baby Boomers (1945-1965)");
                    } else if (NacimientoInt >= 1965 && NacimientoInt <= 1981) {
                        System.out.println("Generación X (1965-1981)");
                    } else if (NacimientoInt >= 1982 && NacimientoInt <= 1994) {
                        System.out.println("Generación Y / Millenial (1982-1994)");
                    } else if (NacimientoInt >= 1995) {
                        System.out.println("Generación Z / Centenial (1995-Presente)");
                    } else {
                        System.out.println("Tu fecha no es correcta");
                    }
                }
        }
    }
}

