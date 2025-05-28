import java.util.Scanner;

public class Teoria2 {
    static double areaCuadrado(double lado) {
        return lado * lado;
    }

    static double perimetroCuadrado(double lado) {
        return lado * 4;
    }

    static void mostrarMenu(){
        System.out.println("Esto es un método que muestra un menú");
        System.out.println("1- Obtener área");
        System.out.println("2- Obtener perímetro");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el valor del lado del cuadrado: ");
        double lado = teclado.nextDouble();

        mostrarMenu();
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            double area = areaCuadrado(lado);
            System.out.println("El área es: " + area);
        } else if (opcion == 2) {
            double perimetro = perimetroCuadrado(lado);
            System.out.println("El perímetro es: " + perimetro);
        } else {
            System.out.println("No se reconoce la acción.");
        }
    }
}


