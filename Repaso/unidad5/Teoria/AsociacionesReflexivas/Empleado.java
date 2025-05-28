package org.unidad5.Teoria.AsociacionesReflexivas;

public class Empleado {
    private String nombre;
    private String puesto;
    private Empleado supervisor; // Relación reflexiva

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.supervisor = null; // Default = no supervisor
    }

    // Metodo para asignar supervisro
    public void asignarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    // Metodo para obtener supervisor
    public Empleado getSupervisor() {
        return supervisor;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " - Puesto: " + puesto);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.nombre);
        } else {
            System.out.println("Este empleado NO tiene supervisor.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", "Desarrollador");
        Empleado emp2 = new Empleado("Paco", "Gerente");
        Empleado emp3 = new Empleado("Jose", "Supervisor");

        emp1.asignarSupervisor(emp2);
        emp2.asignarSupervisor(emp3);

        emp1.mostrarInfo();
        emp2.mostrarInfo();
        emp3.mostrarInfo();
    }
}
