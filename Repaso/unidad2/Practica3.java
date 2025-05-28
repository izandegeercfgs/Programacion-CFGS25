package org.unidad2;

import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Crea el scanner una vez

        // PIde el ISBN a comprobar
        System.out.println("Introduce ISBN-10: ");
        String isbn = teclado.nextLine(); // Pasa el ISBN a mayúscula
        isbn = isbn.toUpperCase();

        while (isbn.length() != 10 || isbn.equals("0000000000")){
            // En caso de que el largo del ISBN sea otro que 10, da fallo
            if (isbn.length() != 10) {
                System.out.println("ERROR: El ISBN debe tener exactamente 10 caracteres y estar compuesta de números positivos.");
            } else {
                System.out.println("El ISBN no puede estar compuesto de 0s únicamente");
                break;
            }
            break;
        }


        // Establace suma y contador en 0 y posicion de la x (111111111X) en -1
        int suma = 0;
        int contador = 0;
        int posicionx = -1; // Posición es -1 para que empiece comprobando por la posición 0, al sumar +1 cada vez que comprueba hasta que encuentra '?'

        // Abre un for para comprobar en cada posición de la 0 al 10 si hay algún carácter que sea igual a '?'
        for (int i = 0; i < 10; i++) {
            int numero;
            if (isbn.charAt(i) == '-') {
                contador++;
                posicionx = i;
                System.out.println("No puede contener un '-'");
                continue;
            }


            // Comprueba si existe el cáracter '?` y guarda su posición
            if (isbn.charAt(i) == '?') {
                contador++;
                posicionx = i;
                continue;
            }

            try {
                numero = Integer.parseInt(String.valueOf(isbn.charAt(i)));
            } catch (NumberFormatException e) {
                // Comprueba si en la posición 9 hay una X, en caso de que la X esté en otra posición que no sea la última, da fallo
                if (i == 9 && isbn.charAt(i) == 'X') {
                    numero = 10;
                } else {
                    System.out.println("ERROR: El ISBN debe contener solo dígitos y un 'X' en la última posición.");
                    break;
                }
            }
            suma += numero * (i + 1); // Esto suma 10 (El valor dado por 'X') a suma
        }

        // Aquí comprueba en caso de que falte un número, cuál es
        if (contador == 1) {
            for (int i = 0; i < 10; i++) {
                int sumatemporal = suma + (i * (posicionx + 1));
                if (sumatemporal % 11 == 0) {
                    System.out.println("El valor que falta es: " + i);
                    break;
                }
            }
            if (posicionx == 9) { // Aquí hace la comprobación únicamente si la posición de la X es la 0
                int sumatemporal = suma + (10 * (posicionx + 1));
                if (sumatemporal % 11 == 0) {
                    System.out.println("El valor que falta es: X");
                }
            }
        }
        // Se comprueba si el numero es divisible entre 11 con el módulo, y da respuesta a si el ISBN es correcto o no
        if (suma % 11 == 0) {
            System.out.println("El ISBN es correcto.");
        } else {
            System.out.println("El ISBN no es correcto.");
        }
    }
}
