import java.util.Scanner;

public class solution_3 {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        int n1 = teclado.nextInt();

        if (n1 == 0) {
            System.exit(0);
        } else {

            String entrada = "";

            for (int i = 0; i < n1; i++) {
                entrada = teclado.nextLine();
            }

            String[] ninot = entrada.split(" ");

            for (int i = 0; i < ninot.length; i++) {
                boolean duplicado = false;
                String bola = "";
                do {
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (ninot[j].equals(bola)){
                            duplicado = true;
                            break;
                        }
                    }
                } while (duplicado); {
                    ninot[i].equals(bola);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}