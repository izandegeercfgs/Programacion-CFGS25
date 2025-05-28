import java.util.Scanner;

public class solution_1 {
    static Scanner teclado;

    public static void casoDePrueba() {

        String palabra = teclado.next().toLowerCase();

        if (palabra.equals("colgadas")){
            System.out.println("Bien");
        } else {
            System.out.println("Mal");
        }

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
