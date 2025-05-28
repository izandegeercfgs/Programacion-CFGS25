package org.unidad4.ActividadesRecursividad;

import java.util.Scanner;

public class Ejercicio1 {

    // Ejercicio 1 - Crea un metodo que obtenga la cantidad de dígitos de un número N mayor que cero. Se debe pasar como parámetro el número N.
    static int contarDigitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            return 1;
        }

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    // Ejercicio 2 - Crea un metodo que obtenga el resultado de elevar un número a otro. Ambos números se deben pasar como parámetros. Los números deben ser positivos.
    static int potencias (int numero, int potencia) {
        int resultado = 1;

        for (int i = 0; i < potencia; i++) {
            resultado *= numero;
        }

        return resultado;
    }

    // Ejercicio 3 - Crea un metodo que dado un número positivo, lo imprima invertido por pantalla. Hay 2 opciones: CADENA o NUMERo
    static String delRevesNumero(int numero) {
        String numeroStr = String.valueOf(numero);

        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            System.out.print(numeroStr.charAt(i));
        }
        return numeroStr.toString();
    }

    static String delRevesCadena(String cadena) {
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        return cadena;
    }

    // Ejercicio 4 - Crea un metodo que compruebe si un número es binario. Un número binario está formado únicamente por ceros y unos.
    static int Binario(int numero) {
        int contador = 0;

        for (int i = 0; i < Integer.toString(numero).length(); i++) {
            if (Integer.toString(numero).charAt(i) == '0' || Integer.toString(numero).charAt(i) == '1') {
                contador++;
            }
        }
        return contador;
    }

    // Ejercicio 5 - Crea un metodo que obtenga el número binario de un número N pasado como parámetro.
    static String aBinario(int numero) {
        if (Binario(numero) == Integer.toString(numero).length()) {
            return "Se considera el número " + Integer.toString(numero) + " como binario.";
        }

        if (numero == 0) {
            return "0";
        }

        String binario = "";

        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }

        return binario;
    }

    // Ejercicio 6 - Crea un metodo que compruebe si una palabra está ordenada alfabéticamente.
    static boolean ordernAlfabetico(String cadena) {
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length() - 1; i++) {
            if (cadena.charAt(i) > cadena.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // Ejercicio 7 - Crea un metodo que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N, siempre mayor que cero. Se debe imprimir toda la cadena por consola.
    static int suma(int numero) {
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            resultado += i;
            System.out.print(i);

            if (i < numero) {
                System.out.print("+");
            }
        }
        System.out.print("=");
        System.out.println(resultado);
        return resultado;
    }

    // Metodo para pedir el número cuando sea necesario
    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt();

        return numero;
    }

    // Metodo para pedir una cadena cuando sea necesario
    public static String pedirCadena() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduzca una cadena: ");
        String cadena = teclado.nextLine();
        System.out.println();

        return cadena;
    }

    // Metodo para dar salida cuando sea necesario
    public static void salida() {
        Scanner teclado = new Scanner(System.in);

        System.err.println("\nEl modo ha terminado. Elija una opción: ");
        System.out.println(" [M] - Volver al menú principal");
        System.out.println(" [X] - Salir");

        String salida = teclado.next().toLowerCase();
        switch (salida) {
            case "m":
                mostrarMenu();
                break;
            case "x":
                System.err.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
                salida();
                break;
        }
    }

    // Metodo en el que mostraremos el menú
    public static void mostrarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n*** Batería de ejercicios sobre recursividad***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar:");
        System.out.println("   1 - Dígitos");
        System.out.println("   2 - Potencias");
        System.out.println("   3 - Del revés");
        System.out.println("   4 - Binario");
        System.out.println("   5 - A binario");
        System.out.println("   6 - Orden alfabético");
        System.out.println("   7 - Mostrar suma");

        System.out.print("Elija una opción: ");
        int modo = teclado.nextInt();
        teclado.nextLine();
        System.out.println();

        switch (modo) {
            case 1: // Digitos
                System.out.println("-> Has elegido dígitos.");

                int numero = pedirNumero();
                int digitos = contarDigitos(numero);

                System.out.println("\nEl número tiene " + digitos + " dígitos.");
                System.out.println();

                salida();
                break;
            case 2: // Potencias
                System.out.println("-> Has elegido Potencias.");

                numero = pedirNumero();

                System.out.print("Introduzca el exponente: ");
                int potencia = teclado.nextInt();

                System.out.println("\nEl resultado de la potencia es: " + potencias(numero, potencia));
                System.out.println();

                salida();
                break;
            case 3: // Del revés
                System.out.println("-> Has elegido Del revés.");

                System.out.println("\n ¿Qué quiere invertir? (CADENA // NUMERO)?");
                String opcion = teclado.nextLine().toLowerCase();

                switch (opcion) {
                    case "numero":
                        System.out.println("   -> Ha elegido numero.");
                        numero = pedirNumero();
                        delRevesNumero(numero);
                        break;
                    case "cadena":
                        System.out.println("   -> Ha elegido cadena.");
                        String cadena = pedirCadena();
                        delRevesCadena(cadena);
                        break;
                    default:
                        System.err.println("x Input no válido");
                }
                break;
            case 4: // Binario
                System.out.println("-> Has elegido Binario.");

                numero = pedirNumero();

                if (Binario(numero) > 1) {
                System.out.println("El número es binario");
                    System.out.println();
                } else {
                System.err.println("El número NO es binario");
                    System.out.println();
            }
                salida();
                break;
            case 5: // A binario
                System.out.println("-> Has elegido A Binario.");
                numero = pedirNumero();
                System.out.println(aBinario(numero));
                System.out.println();

                salida();
                break;
            case 6:
                System.out.println("-> Has elegido Orden Alfabético.");

                String cadena = pedirCadena();

                if (ordernAlfabetico(cadena) == false) {
                    System.err.println("x No está ordenado");
                    System.out.println();
                } else if (ordernAlfabetico(cadena) == true) {
                    System.out.println("= Está ordenado");
                    System.out.println();
                } else {
                    System.out.println("x ERROR.");
                    System.out.println();
                }

                salida();
                break;
            case 7:
                System.out.println("-> Has elegido Mostrar suma.");
                numero = pedirNumero();

                suma(numero);

                salida();
                break;
        }
    }

    // Metodo main para ejecutar el menu
    public static void main(String[] args) {
        mostrarMenu();
    }
}