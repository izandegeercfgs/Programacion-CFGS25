package org.unidad5.Teoria.Casa;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private int metrosCuadrados;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion(String nombre, int metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
        listaElectrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    public void agregarElectrodomestico(String nombre, double consumo){
        if (!existeElectrodomestico(nombre)){
            Electrodomestico electrodomestico = new Electrodomestico(nombre,consumo);
            listaElectrodomesticos.add(electrodomestico);
        }

    }

    public boolean existeElectrodomestico(String nombre){

        for (Electrodomestico elec : listaElectrodomesticos){
            if(elec.getNombre().equals(nombre)){
                System.out.println("El electrodoméstico " + nombre + " ya existe");
                return true;
            }
        }

        return false;
    }

    public void mostrarElectrodomesticos(){
        System.out.println(listaElectrodomesticos);
    }

    public double calcularConsumoHabitacion(){

        double consumo = 0;

        for (Electrodomestico elec : listaElectrodomesticos){
            consumo+=elec.getConsumo();
        }

        return consumo;

    }

    @Override
    public String toString() {
        return "Habitación : [ " + getNombre() + " metros=" + getMetrosCuadrados() + " electrodomésticos=" + listaElectrodomesticos + " ]";
    }

}
