package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Samurai {
    public void samurais() {

        Scanner teclado = new Scanner(System.in);
        int intro_equipo = 1;

        Random random = new Random();
        int SamuraiAleatorio = random.nextInt(7);  // Obtenemos el numero random del Samuráis que luchará

        // Se guarda la potencia de cada samurái de los equipos
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];

        // Configuración de los equipos
        do {
            System.out.println("> Equipo " + intro_equipo);
            System.out.print("> Introduce potencia de los samurais: ");
            String entrada_equipo = teclado.nextLine();
            String equipo[] = entrada_equipo.split(" "); // Divide el número introducido por el usuario en 7 (La potencia de cada samurái)
            int potencia = 0;

            if (equipo.length == 7) {
                int equipo_int[] = new int[equipo.length];
                for (int i = 0; i < equipo.length; i++) {
                    equipo_int[i] = Integer.parseInt(equipo[i]);
                    potencia += equipo_int[i];
                }
                if (potencia != 30) {
                    System.out.println("> ERROR. La potencia total no suma 30."); // Error en caso de que la suma de las potencias no de 30
                    continue; // Se reinicia el ciclo
                } else {
                    if (intro_equipo == 1) {
                        intro_equipo = 2;
                        equipo1 = equipo_int.clone();
                    } else {
                        equipo2 = equipo_int.clone();
                        intro_equipo = 3;
                    }
                }
            } else {
                System.out.println("> ERROR. No hay 7 samuráis."); // Mensaje de error en caso de que haya más o menos que 7 samuráis
            }
        } while (intro_equipo <= 2);

        System.out.println("> Equipo completado");
        System.out.println("> ¡Empieza la batalla!");
        System.out.println("> La batalla inicia por el samurai " + (SamuraiAleatorio + 1) + ".");

        // Cuenta las bajas de cada equipo
        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;

        int turno = SamuraiAleatorio;

        // Empieza el combate hasta que las bajas sean 4 o mayor ("Cuando un equipo tiene más de la mitad de sus
        //samuráis muertos, pierde la partida.")
        while (bajasEquipo1 < 4 && bajasEquipo2 < 4) {
            if (turno == 7) { // En caso de que el turno se pase del 6, vuelve al 0 para que la batalla siga
                turno = 0;
            }

            int samurai1 = equipo1[turno];
            int samurai2 = equipo2[turno];

            System.out.print("> Samurai " + (turno + 1) + ". ");

            if (samurai1 > samurai2) {
                System.out.println("Gana Equipo 1. " + samurai1 + " vs " + samurai2);
                equipo2[turno] = 0; // El samurái muere (pierde su potencia)
                bajasEquipo2++; // Incrementa las bajas
            } else if (samurai1 < samurai2) {
                System.out.println("Gana Equipo 2. " + samurai1 + " vs " + samurai2);
                equipo1[turno] = 0; // El samurái muere (pierde su potencia)
                bajasEquipo1++; // Incrementa las bajas
            } else {
                System.out.println("Empate. Ambos samuráis caen. " + samurai1 + " vs " + samurai2);
                equipo1[turno] = 0; // Ambos samuráis mueren
                equipo2[turno] = 0;
                bajasEquipo1++; // Incrementa las bajas de ambos equipos
                bajasEquipo2++;
            }
            turno++; // Avanza al siguiente samurái
        }

        // Resultado final
        if (bajasEquipo1 >= 4) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
        } else {
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
        }
    }
}
