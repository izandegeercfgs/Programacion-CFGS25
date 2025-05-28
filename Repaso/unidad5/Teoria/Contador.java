package org.unidad5.Teoria;

public class Contador {

    public static int contador = 0;

    Contador() {
        contador++;
    }
}

class Main2 {
    public static void main(String[] args) {

        Contador obj1 = new Contador();
        Contador obj2 = new Contador();
        Contador obj3 = new Contador();

        System.out.println("Objetos creados: " + Contador.contador);
    }
}

