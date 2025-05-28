public class solution_4 {

    static java.util.Scanner teclado;

    public static boolean casoDePrueba() {
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        if (n1 == 0 && n2 == 0) {
            return false;
        } else {

        }

        return true;
    }

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}