package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaMatrices {
    public void ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nBatería de matrices - Ejercicio 1");

        int matriz[][] = new int[3][3];

        // Pide la matriz al usuario
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("> Introduce la posición (" + i + "," + j + "): ");
                matriz[i][j] = teclado.nextInt();
            }
            System.out.println();
        }

        // Imprime la matriz
        for (int[] fila : matriz){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.print("\n> Introduce qué número quieres buscar: ");
        final int busqueda = teclado.nextInt(); // Al poner final pasa de variable a constante

        System.out.println("> Número a buscar: " + busqueda);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] == busqueda){
                    System.out.println("> El número " + busqueda + " existe. Está en la posición (" + fila + "," + columna + ").");
                    return;
                }
            }
        }
        System.out.println("\n> El número " + busqueda + " no existe.");
    }

    public void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int Aleatorio = random.nextInt(5)+1;

        System.out.println("\nBatería de matrices - Ejercicio 2");

        int matriz[][] = new int[Aleatorio][Aleatorio];

        // Genera una matriz random
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\n> Tu matriz:");
        // Imprime la matriz
        for (int[] fila : matriz){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("\n> Suma de filas:");

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + ": " + suma);
            suma = 0;
        }

        System.out.println("\n> Suma de columnas:");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[j][i];
            }
            System.out.println("La suma de la columna " + i + ": " + suma);
            suma = 0;
        }
    }

    public void ejerciciocalentamiento() {
        Random random = new Random();
        int Aleatorio = random.nextInt(5)+1;

        System.out.println("\nBatería de matrices - Ejercicio 2.5 (Calentamiento)");

        int matriz[][] = new int[Aleatorio][Aleatorio];
        int matriz2[][] = new int[Aleatorio][Aleatorio];

        // Genera una matriz random
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\n> 1ª matriz:");
        // Imprime la matriz 1
        for (int[] fila : matriz){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("\n> 2ª matriz:");
        // Imprime la matriz 2
        for (int[] fila : matriz2){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("\n> Comparación columnas (Sacar el mayor):");
        int matrizfinal[][] = new int[Aleatorio][Aleatorio];

        // Comprueba Matriz y Matriz 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if (matriz[i][j] > matriz2[i][j]){
                    matrizfinal[i][j] += matriz[i][j];
                } else if (matriz2[i][j] > matriz[i][j]) {
                    matrizfinal[i][j] += matriz2[i][j];;
                } else if (matriz[i][j] == matriz2[i][j]){
                    matrizfinal[i][j] += matriz[i][j];;
                }
            }
        }

        // Imprimir la matriz final
        for (int[] fila : matrizfinal){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        double media = 0;

        System.out.println("\nBatería de matrices - Ejercicio 3");


        System.out.println("\n> Hola! ¿Cuántos estudiantes tienes? ");
        int estudiantes = teclado.nextInt();

        System.out.println("\n> ¿Cuántas asignaturas tienen? ");
        int asignaturas = teclado.nextInt();
        System.out.println();

        String matriz[][] = new String[estudiantes + 1][asignaturas + 1];
        matriz[0][0] = "Estudiantes";

        System.out.println("\nEstudiantes");
        // Pide el nombre de los estudiantes
        for (int i = 1; i <= estudiantes; i++) {
            System.out.println("> Introduce el nombre del estudiante " + i + ": ");
            matriz[i][0] = teclado.next();
        }

        System.out.println("\n✖ Asignaturas");
        // Pide el nombre de las asignaturas
        for (int j = 1; j <= asignaturas; j++) {
            System.out.println("> Introduce el nombre de la asignatura " + j + ": ");
            matriz[0][j] = teclado.next();
        }

        System.out.println("\n✖ Notas");
        // Pide las notas de cada asignatura
        for (int i = 1; i <= estudiantes; i++) {
            System.out.println("\n" + matriz[i][0]);
            for (int j = 1; j <= asignaturas; j++) {
                System.out.println("> Introduce la nota de " + matriz[i][0] + " en " + matriz[0][j] + ": ");
                matriz[i][j] = teclado.next();
            }
        }

        // Recoge los datos de los estudiantes
        System.out.println("\n✖ Tabla");
        for (String[] fila : matriz){
            for (String columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        // Calcula la nota media de cada estudiante
        System.out.println("\n✖ Media alumnos");

        for (int i = 1; i <= estudiantes; i++) { // Recorre las filas de estudiantes
            double sumaNotas = 0;
            for (int j = 1; j <= asignaturas; j++) { // Recorre las columnas de asignaturas
                sumaNotas += Double.parseDouble(matriz[i][j]); // Convierte la nota a número
            }
            media = sumaNotas / asignaturas;
            System.out.println("> La nota media de " + matriz[i][0] + " es: " + media);
        }

        // Calcula la nota media de cada asignatura
        System.out.println("\n✖ Media asignaturas");

        for (int i = 1; i <= asignaturas; i++) { // Recorre las filas de asignaturas
            double sumaNotas = 0;
            for (int j = 1; j <= estudiantes; j++) { // Recorre las columnas de alumnos
                sumaNotas += Double.parseDouble(matriz[j][i]); // Convierte la nota a número
            }
            media = sumaNotas / asignaturas;
            System.out.println("> La nota media de " + matriz[0][i] + " es: " + media);
        }
    }

    public void VectorMatrices1facil() {
        int vector[] = {3,5,4,1};
        int matriz[][] = new int[2][4];

        System.out.println("\n> Matriz original: ");
        for (int[] fila : matriz){
            for (int columna : fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("\n> Vector a añadir: " + Arrays.toString(vector));


        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = vector[i];
        }

        System.out.println("\n> Vector + Matriz: ");
        for (int[] filas : matriz) {
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }
    }

    public void VectorMatrices2dificil() {
        Scanner entrada  = new Scanner(System.in);

        String matriz [][] = new String[10][10];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce la fila " + i + ": ");
            String valor_fila [] = entrada.next().split("");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor_fila[j];
            }
        }
        for (String[] x : matriz){
            for (String y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }
    }
}
