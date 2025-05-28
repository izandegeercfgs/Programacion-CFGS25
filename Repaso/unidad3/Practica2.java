package org.unidad3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2 {
    public static void Primitiva() {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        Integer[] bombo = new Integer[50];
        for (int i = 0; i < bombo.length; i++) {bombo[i] = i;}

        System.out.println("** LA PRIMITIVA **");
        System.out.println("------------------");
        System.out.print("= Bienvenido, introduzca los datos de su boleto: ");

        String boleto = teclado.next();
        int reintegro = 0;
        String[] numeros = null;

        boolean formatoCorrecto = boleto.matches("\\d+-\\d+-\\d+-\\d+-\\d+-\\d+/\\d+");

        if (formatoCorrecto) {
            String[] partes = boleto.split("/");
            numeros = partes[0].split("-");
            reintegro = Integer.parseInt(partes[1]);

            System.out.println("> Boleto: " + Arrays.toString(numeros));
            System.out.println("> Reintegro: " + reintegro);
        } else {
            System.err.println("x FORMATO INCORRECTO. Cerrando programa...");
        }

        int[] numerosBoleto = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosBoleto[i] = Integer.parseInt(numeros[i]);
        }

        System.out.println("\n= Datos correctos. Sorteando...");

        Integer[] sorteoBoleto = new Integer[6];
        for (int i = 0; i < sorteoBoleto.length; i++) {sorteoBoleto[i] = random.nextInt(50);}

        String sorteoBoletoStr = Arrays.toString(sorteoBoleto);

        int complementario = random.nextInt(50);
        int sorteoReintegro = random.nextInt(10);

        System.out.println("< Boleto: " + sorteoBoletoStr);
        System.out.println("< Complementario: " + complementario);
        System.out.println("< Reintegro: " + sorteoReintegro);

        System.out.println("\n= Sorteo hecho. Comprobando resultados...");

        System.out.println("\n*** Resultados ***");

        int aciertos = 0;
        for (int i = 0; i < numerosBoleto.length; i++) {
            if (Arrays.asList(sorteoBoleto).contains(numerosBoleto[i])) {
                aciertos++;
            }
        }

        boolean reintegroAcertado = reintegro == sorteoReintegro;
        boolean complementarioAcertado = Arrays.asList(sorteoBoleto).contains(complementario);

        if (aciertos == 6 && reintegroAcertado) {
            System.out.println("¡Felicidades! Has acertado los seis números y el reintegro. **Categoría Especial**.");
        } else if (aciertos == 6) {
            System.out.println("¡Felicidades! Has acertado los seis números. **1ª Categoría**.");
        } else if (aciertos == 5 && complementarioAcertado) {
            System.out.println("Has acertado cinco números y el número complementario. **2ª Categoría**.");
        } else if (aciertos == 5) {
            System.out.println("Has acertado cinco números. **3ª Categoría**.");
        } else if (aciertos == 4) {
            System.out.println("Has acertado cuatro números. **4ª Categoría**.");
        } else if (aciertos == 3) {
            System.out.println("Has acertado tres números. **5ª Categoría**.");
        } else if (reintegroAcertado) {
            System.out.println("Has acertado el reintegro. **Reintegro**.");
        } else {
            System.out.println("No has acertado suficientes números ni el reintegro. **No premiado**.");
        }

    }
}

// 1-1-1-1-1-1/1
