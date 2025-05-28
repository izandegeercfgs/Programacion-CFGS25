package org.example;

import java.util.Scanner;

public class Problema105 {

    static Scanner teclado = new Scanner(System.in);  // Inicialización directa

    public static boolean casoDePrueba() {
        //leer caso de prueba
        float dato = teclado.nextFloat();

        if (dato == -1)//es el caso que marca el final
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            String[] semana = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};

            float[] datos = new float[6];
            datos[0] = dato;

            for (int i = 1; i < datos.length; i++) {
                datos[i] = teclado.nextFloat();
                if (datos[i] == -1) return false; // Terminar si en cualquier punto se introduce -1
            }

            float contador_min = datos[0];
            float contador_max = datos[0];
            String contador_sem1 = semana[0];
            String contador_sem2 = semana[0];

            for (int i = 1; i < datos.length; i++) {
                if (datos[i] < contador_min) {
                    contador_min = datos[i];
                    contador_sem1 = semana[i];
                } else if (datos[i] == contador_min) {
                    contador_sem1 = "EMPATE";
                };
                if (datos[i] > contador_max) {
                    contador_max = datos[i];
                    contador_sem2 = semana[i];
                } else if (datos[i] == contador_max) {
                    contador_sem2 = "EMPATE";
                }
            }

            float suma = 0;
            for (float v : datos) {
                suma += v;
            }
            float media = suma / datos.length;

            if (datos[5] > media)
                System.out.println(contador_sem2 + " " + contador_sem1 + " SI");
            else {
                System.out.println(contador_sem2 + " " + contador_sem1 + " NO");
            }

            return true;
        }
    } // casoDePrueba


    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}