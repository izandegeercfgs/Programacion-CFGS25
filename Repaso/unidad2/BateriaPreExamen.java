package org.unidad2;

import java.util.Random;
import java.util.Scanner;

public class BateriaPreExamen {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de números a introducir: ");
        int nums = teclado.nextInt();
        int num = 0;

        int cont_menor = 0;
        int cont_mayor = 0;
        int cont = 0;

        for (int i = 1; i <= nums; i++) {
            System.out.print("Introduce el número nº" + i + ": ");
            num = teclado.nextInt();
            if (num < 0) {
                cont_menor++;
            } else if (num > 0) {
                cont_mayor++;
            } else if (num == 0) {
                cont++;
            }
        }

        System.out.println("> Disponemos de:  ");
        System.out.println(cont_menor + " números menores a cero");
        System.out.println(cont_mayor + " números mayores a cero");
        System.out.println(cont + " números iguales a cero");
    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        int factorial = 1;

        for (int i = 0; i < exponente; i++) {
            factorial *= base;
        }

        System.out.println(base + "^" + exponente + "=" + factorial);
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        int factorial = 1;

        for (int i = 0; i < exponente; i++) {
            factorial *= base;
        }

        System.out.println(base + "^" + exponente + "=" + factorial);
    }

    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int nota = teclado.nextInt();

        switch (nota) {
            case 0:
                System.out.println("Insuficiente.");
                break;
            case 1:
                System.out.println("Insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Insuficiente.");
                break;
            case 4:
                System.out.println("Insuficiente.");
                break;
            case 5:
                System.out.println("Suficiente.");
                break;
            case 6:
                System.out.println("Bien.");
                break;
            case 7:
                System.out.println("Notable.");
                break;
            case 8:
                System.out.println("Notable.");
                break;
            case 9:
                System.out.println("Sobresaliente.");
                break;
            case 10:
                System.out.println("Excelente.");
                break;
            default:
                System.out.println("Nota no válida.");
        }
    }

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);

        int cont_menor = 0;
        int cont_mayor = 0;
        int cont = 0;
        int max = 0;

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce el sueldo nº" + i + ": ");
            nums[i] = teclado.nextInt();

            if (nums[i] < 1000) {
                cont_menor++;
            } else if (nums[i] > 1000) {
                cont_mayor++;
            } else {
                cont++;
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("----------------------------");
        System.out.println(cont_menor + " números menores a 1.000€");
        System.out.println(cont_mayor + " números mayores a 1.000€");
        System.out.println(cont + " números iguales a 1.000€");
        System.out.println("----------------------------");
        System.out.println("El mayor sueldo es de: " + max);

    }

    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce nº de alumnos a evaluar: ");
        int num_alumnos = teclado.nextInt();

        int cont_edad = 0;
        int cont_altura = 0;
        int sumaEdades = 0;
        int sumaAlturas = 0;

        System.out.println("----------------------------");

        int[] edad = new int[num_alumnos];
        int[] altura = new int[num_alumnos];

        for (int i = 0; i < num_alumnos; i++) {
            System.out.print("Introduce la edad del alumno nº " + (i + 1) + ": ");
            edad[i] = teclado.nextInt();
            if (edad [i] > 18) {
                cont_edad++;
            }

            System.out.print("Introduce la altura del alumno nº " + (i + 1) + " (cm): ");
            altura[i] = teclado.nextInt();
            if (altura [i] > 175) {
                cont_altura++;
            }

            sumaAlturas += altura[i];
            sumaEdades += edad[i];

            System.out.println("----------------------------");
        }

        double edad_media = (double) sumaEdades / num_alumnos;
        double altura_media = (double) sumaAlturas / num_alumnos;

        System.out.println("Edad media: " + edad_media);
        System.out.println("Estatura media: " + altura_media);

        System.out.println("----------------------------");

        System.out.println("Alumnos +18: " + cont_edad);
        System.out.println("Alumnos +175cm: " + cont_altura);
    }

    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        int a = 0, b = 1, c;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
