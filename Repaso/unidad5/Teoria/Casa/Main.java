package org.unidad5.Teoria.Casa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio",40);
        casa.agregarHabitacion("Cocina",50);
        casa.agregarHabitacion("Baño",70);

        casa.mostrarHabitaciones();

        System.out.println("La habitación más grande es " + casa.getHabitacionMasGrande());

        casa.borrarHabitacion("Baño");
        casa.borrarHabitacion("Baño");

        casa.getHabitaciones().get(0).agregarElectrodomestico("tv",23);
        casa.getHabitaciones().get(1).agregarElectrodomestico("tv",30);
        System.out.println(casa.getHabitaciones());

        casa.calcularHabitacionMasConsumo();




    }



}