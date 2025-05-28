package org.unidad4.BateriaEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    static String mayusculas(String cadenaStr){
        return cadenaStr.toUpperCase();
    }

    static String vocales(String cadenaStr){
        String vocales = "aeiouAEIOU"; // Definimos las vocales en mayúsculas y minúsculas
        int contador = 0;

            boolean contiene = cadenaStr.contains(vocales);

        for (int i = 0; i < cadenaStr.length(); i++) {
            if (vocales.indexOf(cadenaStr.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("La palabra " + cadenaStr + " tiene " + contador + " vocales.");
        return vocales;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("= Introduce tu palabra: ");
        String cadenaStr = teclado.next();

        System.out.println("= Escoge tu opción: ");
        System.out.println("> 1. Mayúsculas");
        System.out.println("> 2. Contar vocales");
        int opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("> Has escogido el 1 - mayúsculas");
                System.out.println(mayusculas(cadenaStr));
                break;
            case 2:
                System.out.println("> Has escogido el 2 - vocales");
                vocales(cadenaStr);
                break;
        }
        
    }
}
