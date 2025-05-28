package org.unidad3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bateria1 {
    public static void Ejercicio1() {
        String[] num = new String[8];
        Random aleatorio = new Random();
        int suma = 0;

        for (int i = 0; i < num.length; i++) {
            int random = aleatorio.nextInt(500);
            num[i] = String.valueOf(random);
            suma += random;
        }

        System.out.println("La suma de los elementos es: " + suma);
    }

    public static void Ejercicio2() {
        int[] numeros = {1, 2, 3, 4, 5};
        int n = numeros.length;
        int[] invertido = new int[n];

        for (int i = 0; i < n; i++) {
            invertido[i] = numeros[n - 1 - i];
        }

        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }

    public static void Ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        String[] num = new String[100];
        Random aleatorio = new Random();
        System.out.println("Incresa un número a buscar [0,100]: ");
        int nume = teclado.nextInt();
        int cont = 0;


        for (int i = 0; i < num.length; i++) {
            int random = aleatorio.nextInt(100);
            num[i] = String.valueOf(random);

            if (Objects.equals(num[i], String.valueOf(nume))) {
                cont++;
            }
        }

        System.out.println(Arrays.toString(num));

        System.out.println("El numero " + nume + " aparece: " + cont + " veces.");
    }

    public static void Ejercicio4() {
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[5];
        int vector2[] = new int[5];
        int valor = 1;
        int num;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector[i] = entrada.nextInt();

        }

        System.out.println("Ingresa el índice a eliminar: ");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                continue;
            }
            vector2[i] = vector[i];
        }
        System.out.println("El array resultante es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector2[i] + ", ");

        }
        System.out.println("]");
    }

    public static void Ejercicio5() {
        int[] arr = {1, 2, 3, 4, 5};

        int ultimo = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = ultimo;

        System.out.print("Array rotado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void Ejercicio6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los números separados por espacios:");
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }

        boolean esSimetrico = true;
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esSimetrico = false;
                break;
            }
        }

        if (esSimetrico) {
            System.out.println("Sí, es palíndromo");
        } else {
            System.out.println("No, no es palíndromo");
        }
    }

    public static void Ejercicio7() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] combinado = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            combinado[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            combinado[array1.length + i] = array2[i];
        }

        System.out.print("Array combinado: ");
        for (int num : combinado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
