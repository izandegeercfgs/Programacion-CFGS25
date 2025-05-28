package org.unidad3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica1 {
    public static void samurai() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("\n> Equipo 1 (Debes introducir los valores separados por espacios).");
        System.out.print("> Introduce potencia de los samurais: ");

        String equipo1Str = teclado.nextLine();
        String[] equipo1 = equipo1Str.split(" ");

        int suma1 = 0;

        for (int i = 0; i < equipo1.length; i++) {
            suma1 += Integer.parseInt(equipo1[i]);
        }

        boolean valido = false;

        while (!valido) {
            if (suma1 != 30) {
                System.out.println("> ERROR: La potencia total no suma 30.");
                break;
            } else {
                valido = true;
                System.out.println("> Equipo 1 completado");

                System.out.println("\n< Equipo 2 (Debes introducir los valores separados por espacios).");
                System.out.print("< Introduce potencia de los samurais: ");

                String equipo2Str = teclado.nextLine();
                String[] equipo2 = equipo2Str.split(" ");

                int suma2 = 0;

                for (int i = 0; i < equipo2.length; i++) {
                    suma2 += Integer.parseInt(equipo2[i]);
                }

                if (suma2 != 30) {
                    System.out.println("< ERROR: La potencia total no suma 30.");
                    break;
                } else {
                    valido = true;
                    System.out.println("> Equipo 2 completado");

                    Random random = new Random(7);
                    int num = random.nextInt(7);
                    System.out.println("\n= ¡Empieza la batalla!");

                    System.out.println("= La batalla inicia con el samurai nº" + num);

                    int cont1 = 0;
                    int cont2 = 0;

                    for (int i = 0; i < equipo1.length; i++) {
                        if (Integer.parseInt(equipo1[i]) > Integer.parseInt(equipo2[i])) {
                            cont1++;
                            System.out.println("< Samurai " + i + ". Gana equipo 1." + Integer.parseInt(equipo1[i]) + " vs " + Integer.parseInt(equipo2[i]));
                        } else if (Integer.parseInt(equipo1[i]) < Integer.parseInt(equipo2[i])){
                            cont2++;
                            System.out.println("> Samurai " + i + ". Gana equipo 2." + Integer.parseInt(equipo1[i]) + " vs " + Integer.parseInt(equipo2[i]));
                        } else {
                            System.out.println("- Empate." + Integer.parseInt(equipo1[i]) + " vs " + Integer.parseInt(equipo2[i]));
                        }
                    }

                    if (cont1 > cont2) {
                        System.out.println("= ¡Equipo 1 gana!. **Equipo 1: " + cont1 + ".** || Equipo 2: " + cont2 + ".");
                    } else if (cont2 > cont1){
                        System.out.println("= ¡Equipo 2 gana!. Equipo 2: " + cont1 + ". || **Equipo 1: " + cont2 + ".**");
                    } else if (cont1 == cont2){
                        System.out.println("= ¡Es increible, un empate!");
                    } else {
                        System.out.println("= Ha ocurrido un error.");
                    }
                }
            }
        }
    }
}
