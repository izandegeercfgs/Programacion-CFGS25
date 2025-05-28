package org.example;

public class Problema105_2 {
    static java.util.Scanner teclado;

    public static void main() {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        float numero = teclado.nextFloat();

        if (numero == -1) {
            return false;
        } else {
            float[] semana = nums(numero);
            return true;
        }
    }

    public static float[] nums(float numero) {

        float[] nums2 = new float[6];

        nums2[0] = numero;

        for (int i = 1; i < nums2.length; i++) {
            nums2[i] = teclado.nextFloat();
        }

        return nums2;
    }

    public static String max(float[] semana) {

        float max = 0;

        for (float v : semana) {
            if (v > max) {
                max = v;
            }
        }

        return "";
    }
}
