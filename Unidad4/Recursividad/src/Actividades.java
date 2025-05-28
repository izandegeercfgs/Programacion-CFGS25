import java.io.IOException;
import java.util.Scanner;

public class Actividades {

    static Scanner teclado = new Scanner(System.in);

    public static void menu(String[] String) {
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A Binario");
        System.out.println("6 - Orden Alfabético");
        System.out.println("7 - Mostrar suma");
        System.out.print("\nIntroduce el modo que quieras ejecutar: ");
        int ejercicio = teclado.nextInt();

        switch (ejercicio){
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
            case 6:
                Ejercicio6();
                break;
            case 7:
                Ejercicio7();
                break;
        }
    }

    public static void Ejercicio1(){
        System.out.println("\n> Ejercicio 1");

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("Tu numero tiene 0 dígitos.");
            return;
        }

        int contador = 0;

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("Tu numero tiene " + contador + " dígitos.");

        fin();
    }

    public static void Ejercicio2() {
        System.out.println("\n> Ejercicio 2");

        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();

        int potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }

        System.out.println(base + " elevado a " + exponente + " es igual a: " + potencia);
        fin();
    }

    public static void Ejercicio3(){
        System.out.println("\n> Ejercicio 3");

        System.out.println("¿Qué deseas invertir?");
        System.out.println("1. Número");
        System.out.println("2. Cadena de texto");
        System.out.print("\nSelecciona una opción (1 ó 2): ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio3_1();
                break;
            case 2:
                Ejercicio3_2();
                break;
        }
        fin();
    }

    public static void Ejercicio3_1(){
        System.out.print("Introduce el numero a invertir: ");
        int numero = teclado.nextInt();

        if (numero < 10) {
            System.out.println(numero);
        } else {
            System.out.print("Tu numero al revés es: " + (numero % 10) + (numero / 10));
        }
    }

    public static void Ejercicio3_2() {
        System.out.print("Introduce la cadena de texto a invertir: ");
        String cadena = teclado.nextLine();

        System.out.print("Tu cadena al revés es: ");
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();
    }

    public static void Ejercicio4(){
        System.out.println("\n> Ejercicio 4");

        System.out.print("Introduce un número: ");
        long numero = teclado.nextLong();

        if (esBinario(numero)) {
            System.out.println("El número es binario.");
        } else {
            System.out.println("El número no es binario.");
        }
        fin();
    }


    public static void Ejercicio5(){
        System.out.println("\n> Ejercicio 5");

        System.out.println("Introduce el número a convertir en binario: ");

        int numero = teclado.nextInt();

        System.out.println("El número en binario es: " + aBinario(numero));
        fin();
    }

    public static void Ejercicio6() {
        System.out.println("\n> Ejercicio 6");
        System.err.println("El ejercicio no funciona.");

        fin();
    }

    public static void Ejercicio7(){
        System.out.println("\n> Ejercicio 7");

        System.out.println("Introduce un numero: ");

        System.out.println();
        int numero = teclado.nextInt();
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
            System.out.print(i);
            if (i < numero) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + suma);
        fin();
    }


    public static boolean esBinario(long numero){
        if (numero > 9){
            if (numero % 10 == 0 || numero % 10 == 1){
                return esBinario(numero / 10);
            } else {
                return false;
            }
        }
        return numero == 0 || numero == 1;
    }

    public static String aBinario(int numero){
        if (numero == 0 || numero == 1) {
            return Integer.toString(numero);
        } else {
            return aBinario(numero / 2) + numero % 2;
        }
    }

    public static void fin(){
        System.out.println("\nHas terminado el programa. Elige una opción: ");
        System.out.println("    [M] - Volver al menú principal");
        System.out.println("    [X] - Salir");

        System.out.println("\nElige:");
        String opcion = teclado.next().toUpperCase();

        switch (opcion){
            case "M":
                System.out.println("Volviendo al menu principal...");
                try {
                    borrar();
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "X":
                System.out.println("Saliendo...");
                break;
        }
    }

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
