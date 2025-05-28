package org.unidad4.BateriaEjercicios;

public class Ejercicio4 {

    static java.util.Scanner teclado;

    public static boolean casoDePrueba() {
        double valor = teclado.nextDouble();

        if (valor == -1) {
            return false;
        }

        String[] semana = {"MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
        int diaMaximo = 0;
        int diaMinimo = 0;

        double maxValor = valor;
        double minValor = valor;
        double media = valor;

        for (int i = 1; i < semana.length; i++) {
            valor = teclado.nextDouble();

            if (valor > maxValor) {
                maxValor = valor;
                diaMaximo = i;
            }
            if (valor < minValor) {
                minValor = valor;
                diaMinimo = i;
            }

            media += valor;
        }

        double resultado = media / 6;
        media = resultado;

        System.out.println(semana[diaMaximo] + " " + semana [diaMinimo] + " ");
        if (valor > media) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}