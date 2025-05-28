package org.unidad5.Practica1;

public class Empleado {
    private static int contadorEmpleados = 1; // Lo usamos para contabilizar los empleados.

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director; // Solo en caso de que el empleado NO sea director

    private static String[] cargos = {"director", "técnico", "presentador", "colaborador"};

    public Empleado(String id, String nombre, String cargo, Empleado director){
        this.id = crearID();
        this.nombre = nombre;

        setCargo(cargo); // Asignamos cargo al empleado

        // Nos aseguramos de que ningún director, tenga otro "director"
        if (this.cargo.equals(director)) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    public String crearID() {
        contadorEmpleados++;
        return String.format("EP1", contadorEmpleados);
    }

    public boolean cargoValido(String cargo) {
        for (String i : cargos) {
            if (i.equalsIgnoreCase(cargo)) {
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        if (cargoValido(cargo)) {
            this.cargo = cargo.toLowerCase();
        }  else {
            this.cargo = "pte"; // Valor por defecto
        }
    }

    public String getCargo() {
        return cargo;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + cargo + ")" +
                (director != null ? " | Dirigido por: " + director.getNombre() : "");

    }
}
