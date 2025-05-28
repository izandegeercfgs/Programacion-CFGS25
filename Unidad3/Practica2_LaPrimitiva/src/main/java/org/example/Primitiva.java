package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    public void primitiva(){

        Scanner teclado = new Scanner(System.in); // Se crea el objeto Scanner para poder leer entrada de usuario
        Random random = new Random(); // Se crea objeto Random para generar números aleatorios

        int[] NumerosBoleto = new int[6]; // Se declara array de 6 elementos para el número del boleto
//        int sorteo [] = new int [6]; // Se declara array de 6 elementos para el número del sorteo
        int sorteo [] = {1, 2, 3, 4, 5, 6};
        int acierto = 0; // Se declara una variable para contar los aciertos del usuario
        int comp_coincide = 0; // Se declara una variable para verificar si el complementario coincide
//        int NumeroComplementario  = random.nextInt(49) + 1; // Se genera un número aleatorio entre 1 y 49 (Num complementario)
        int NumeroComplementario  = 0;
//        int ReintegroSorteo = random.nextInt(10); // Se genera un número aleatorio entre 0 y 9 (Reintegro sorteo)
        int ReintegroSorteo = 7;

        // Se presenta el programa: LA PRIMITIVA
        System.out.println("\nLA PRIMITIVA");
        System.out.println("> Introduce el número de tu boleto: ");
        String BoletoUsuario = teclado.nextLine();

        // Verificamos que el formato es el que pide el enunciado
        if (!BoletoUsuario.matches("(\\d{1,2}-){5}\\d{1,2}/\\d")) {
            System.out.println("> ERROR. El número introducido debe cumplir con el formato (N-N-N-N-N-N/R).");
            return;
        }

        String ReintegroSpl[] = BoletoUsuario.split("/"); // Se divide la cadena en 2 partes, dejando a parte el reintegro
        String Boleto[] = ReintegroSpl[0].split("-"); // Separa los valores del boleto por el guión
        String Reintegro = ReintegroSpl[1]; // Se asigna el valor del reintegro a la variable

        // Se muestra la información del boleto del usuario
        System.out.println("\nINFORMACIÓN SOBRE TU BOLETO:");
        System.out.println("> Boleto original: " + Arrays.toString(Boleto));

        for (int i = 0; i < 6; i++) { // Se recorre el array del boleto para validar cada número
            try{ // Se comprueba una posible excepción
                NumerosBoleto[i] = Integer.parseInt(Boleto[i]); // Se convierte cada número a entero
            } catch (NumberFormatException e) {
                System.out.println("> El número " + Boleto[i] + " no es válido.");
                return;
            }

            if (NumerosBoleto[i] < 1 || NumerosBoleto[i] > 49) { // En caso de que el numero esté fuera de rango, da error
                System.out.println("> ERROR. El número " + NumerosBoleto[i] + " está fuera de rango (1-49)");
                return;
            }
        }

        boolean repetir = true; // Se declara una variable booleana para controlar si hay duplicados o no

        while (repetir) { // Comprueba si hay números dusplicados
            repetir = false; // Se inicia 'repetir' en false, y se volverá true y si hay duplicados
            for (int i = 0; i < NumerosBoleto.length; i++) {
                if (i != NumerosBoleto.length - 1 && NumerosBoleto[i] == NumerosBoleto[i+1]){
                    System.out.println("> Se ha encontrado un número dúplicado: " + NumerosBoleto[i]);
                    NumerosBoleto[i] = random.nextInt(49) + 1; // Cambia el duplicado por un aleatorio
                    repetir = true; // Señala que hay que volver a verificar
                }
            } for (int i = 0; i < NumerosBoleto.length; i++) { // Comprueba si el número complementario está duplicado
                if (NumeroComplementario == NumerosBoleto[i]){
                    System.out.println("> El número complementario es duplicado a: " + NumerosBoleto[i]);
                    NumerosBoleto[i] = random.nextInt(49) + 1; // Cambia el duplicado por un aleatorio
                    repetir = true; // Señala que hay que volver a verificar
                    break; // En caso de encontrar un duplicado, sale del bucle
                }
            }

            Arrays.sort(NumerosBoleto); // Ordena el array del boleto de menos a mayor
        }

        System.out.println("> Boleto actualizado: " + Arrays.toString(NumerosBoleto));
        System.out.println("> Reintegro: " + Reintegro);

        // Se muestra la información del sorteo
        System.out.println("\nSORTEO:");

        // Bucle for que genera aleatoriamente cada uno de los números del sorteo
//        for (int i = 0; i < sorteo.length; i++) {
//            sorteo [i] = random.nextInt(49)+1;
//        }

        Arrays.sort(sorteo); // Ordena el array del sorteo de menor a mayor

        System.out.println("> Boleto sorteo: " + Arrays.toString(sorteo));
        System.out.println("> Numero complementario: " + NumeroComplementario);
        System.out.println("> Reintegro: " + ReintegroSorteo);

        // Se muestra el resultado
        System.out.println("\nRESULTADO:");

        // Bucle for que hace recuento de aciertos (coincidencias entre NumeroBoleto y Sorteo) y lo suma a 'acierto'
        for (int i = 0; i < NumerosBoleto.length; i++) {
            for (int j = 0; j < sorteo.length; j++) {
                if (NumerosBoleto[i] == sorteo[j]){
                    acierto++;
                    break;
                }
            }
        }

        if (NumeroComplementario == ReintegroSorteo) {
            comp_coincide = 1; // Comprueba si hay coincidencia en el complementario
        }

        // 'If' que expresa todas las posibles salidas del sorteo
        if (acierto == 6 && Reintegro.equals(String.valueOf(ReintegroSorteo))) {
            System.out.println("> Has acertado 6 números de la combinación ganadora y el reintegro. Has entrado en la categoría especial.");
        } else if (acierto == 6) {
            System.out.println("> Has acertado 6 números de la combinación ganadora. Has entrado en la 1ª categoría.");
        } else if (acierto == 5 && comp_coincide == 1) {
            System.out.println("> Has acertado 5 números de la combinación ganadora y el número complementario. Has entrado en la 2ª categoría.");
        } else if (acierto == 5) {
            System.out.println("> Has acertado 5 números de la combinación ganadora. Has entrado en la 3ª categoría.");
        } else if (acierto == 4) {
            System.out.println("> Has acertado 4 números de la combinación ganadora. Has entrado en la 4ª categoría.");
        } else if (acierto == 3) {
            System.out.println("> Has acertado 3 números de la combinación ganadora. Has entrado en la 5ª categoría.");
        } else if (Reintegro.equals(String.valueOf(ReintegroSorteo))) {
            System.out.println("> Reintegro; Has acertado el número del reintegro.");
        } else {
            System.out.println("> No coincide nada. No premiado.");
        }
    }
}
