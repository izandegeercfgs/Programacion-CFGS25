package org.unidad4.Teoria;

public class Recursividad1 {
    public static void triangulo(int contadorA, int numero) {
        if (contadorA < numero) {
            for (int i = 0; i <= contadorA; i++) {
                System.out.print("* ");
            }
            System.out.println();
            triangulo(contadorA + 1, numero);
        }
    }

    public static void main(String[] args){
        int altura = 3;
        triangulo(0, altura);
    }
}
