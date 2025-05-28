package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); // Crear el objeto Scanner una vez

        System.out.println("¿Cómo te llamas?: ");
        String nombre = entradaEscaner.nextLine(); // Leer el nombre

        System.out.println("¿A qué curso vas?: ");
        String curso = entradaEscaner.nextLine(); // Leer el curso

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + "º DAM."); // Saludar al usuario con su nombre y curso

        System.out.println("Introduce el primer número: ");
        int num1 = entradaEscaner.nextInt(); // Leer el primer número

        System.out.println("Introduce el segundo número: ");
        int num2 = entradaEscaner.nextInt(); // Leer el segundo número

        int suma = num1 + num2; // Calcular la suma

        System.out.println("El resultado de sumar los dos numeros es: " + suma); // Mostrar el resultado

        entradaEscaner.close(); // Cerrar el Scanner
    }
}
