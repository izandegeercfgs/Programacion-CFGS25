package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {

    public void ejercicio1() {

        System.out.println("Introduce tu contraseña: ");

        Scanner teclado = new Scanner(System.in);

        String passuser;
        String password = "contraseña";

        do {
            passuser = teclado.nextLine();
            if (!passuser.equals(password)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }
        } while (!passuser.equals(password));

        System.out.println("La contraseña es correcta.");
    }
    public void ejercicio2() {

        System.out.println("Introduce un número mayor que 1: ");

        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();

        if (num > 1){
            for (int i = 0; i < num; i++) {
                int numb = num-i;
                System.out.println(numb);
            }
        } else {
            System.out.println("ERROR. El número debe de ser mayor que 1.");
        }
    }
    public void ejercicio3() {

        int num = 50;

        if (num > 1){
            for (int i = 0; i < num; i++) {
                int numb = num-i;
                if (numb % 3 == 1) {
                    int numc = numb-1;
                    System.out.println(numc);
                }
            }
        } else {
            System.out.println("ERROR. El número debe de ser mayor que 1.");
        }
    }
    public void ejercicio4() {

        System.out.println("Introduce una cadena: ");

        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
    public void ejercicio5() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numInt = teclado.nextInt();
        int num = 10;

        if (numInt > 1) {
            for (int i = 1; i <= num; i++) {
                int resultado = numInt * i;
                System.out.println(numInt + "*" + i + "=" + resultado);
            }
        } else {
            System.out.println("ERROR. El número debe ser mayor que 1.");
        }
    }

}