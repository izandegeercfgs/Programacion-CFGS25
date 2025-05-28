import java.util.Scanner;

public class solution_5 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero = pedirNumero();

        if (numero==0){
            System.exit(0);
        }else{
            int vector[] = new int[numero];
            for (int i = 0; i < numero; i++) {
                vector[i] = teclado.nextInt();
            }
        }


    }

    public static int pedirNumero(){

        int  numero = teclado.nextInt();

        return numero;

    }


}
