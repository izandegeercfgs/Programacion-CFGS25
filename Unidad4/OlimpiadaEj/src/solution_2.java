import java.util.Scanner;

public class solution_2 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int n = in.nextInt();

        if (n == 0) {
            return false;
        }

        int avesSinAnillo = 0;

        for (int i = 0; i < n; i++) {
            int avesCapturadas = in.nextInt();
            int avesAnilladas = in.nextInt();

            avesSinAnillo += (avesCapturadas - avesAnilladas);
        }

        System.out.println(avesSinAnillo);

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}