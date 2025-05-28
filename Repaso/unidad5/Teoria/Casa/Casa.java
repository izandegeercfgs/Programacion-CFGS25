package org.unidad5.Teoria.Casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void setPropietario(){
        System.out.println("Introduce un propietario: ");
        String nombre = teclado.next();
        System.out.println("Introduce su edad: ");
        int edad = teclado.nextInt();
        propietario=new Propietario(nombre,edad);
    }

    public void agregarHabitacion(String nombre, int metrosCuadrados) {

        if(!existeHabitacion(nombre)){
            Habitacion habitacion = new Habitacion(nombre,metrosCuadrados); //solamente la Casa crea las habitaciones
            habitaciones.add(habitacion);
        }else{
            System.out.println("La habitación ya existe");
        }

    }

    public boolean existeHabitacion(String nombre){

        for (Habitacion hab : habitaciones){
            if(hab.getNombre().equals(nombre)){
                return true;
            }
        }

        return false;
    }

    public void borrarHabitacion(String nombre){

        if(existeHabitacion(nombre)){
            for (int i = 0; i < habitaciones.size(); i++) {

                if(habitaciones.get(i).getNombre().equals(nombre)){
                    habitaciones.remove(i);
                    return;
                }
            }
        }else{
            System.out.println("La habitación no existe");
        }
    }

    public void mostrarHabitaciones() {
        //System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones);
        System.out.println("Casa con propietario " + propietario.getNombre() + " en " + direccion + " tiene " + habitaciones.size() + " habitaciones: ");

        for (Habitacion habitacion : habitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetrosCuadrados() + " m2).");
        }

    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = habitaciones.get(0);

        for (Habitacion habitacion : habitaciones){
            if(habitacion.getMetrosCuadrados()>mayor.getMetrosCuadrados()){
                mayor=habitacion;
            }
        }

        return mayor;
    }

    public void calcularHabitacionMasConsumo(){

        double aux = 0;
        double aux_ant = 0;
        Habitacion mayor = habitaciones.get(0);

        for (Habitacion hab : habitaciones){
            aux = hab.calcularConsumoHabitacion();
            if(aux>aux_ant){
                mayor = hab;
            }
        }

        System.out.println("La habitación que más consume es: " +  mayor.getNombre() + " con " + mayor.calcularConsumoHabitacion() + "kWh");

    }

    public Propietario getPropietario() {
        return propietario;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

}
