package org.unidad4.Teoria;

public class Teoria1 {
    public static void main(String[] args) {

        double base = 4;
        double altura = 2;
        double area = areaRectangulo(4,2);
        System.out.println("El area para un triangulo de base " + base + " y altura " + altura + " es: " + area);
    }

    public static double areaRectangulo(double base, double altura){

        double area = base * altura / 2;

        return area;

    }

}