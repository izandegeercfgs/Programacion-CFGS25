package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MCD {
    static Scanner teclado = new Scanner(System.in);

    public static void main() {
        int[] num = {10, 25, 30};
        int maxDivisor = 0;

        System.out.println(Arrays.toString(num));

        for (int i = num[0]; i > 0; i--) {
            if (num[1] % i == 0 && num[2] % i == 0) {
                maxDivisor = Math.max(maxDivisor, i);
                System.out.println(maxDivisor);
            }
        }
    }
}
