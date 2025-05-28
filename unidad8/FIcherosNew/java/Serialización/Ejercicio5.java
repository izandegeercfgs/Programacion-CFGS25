package Ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Ejercicio5 {

    public static void main(String[] args) {

        Jefe jefe = new Jefe("Samuel de Luque", 500);
        Empleado empleado1 = new Empleado("Roberto", 5);
        Empleado empleado2 = new Empleado("David", 4.99);
        Empleado empleado3 = new Empleado("Mauricio", 2.05);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(jefe);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);

        try {
            ObjectOutputStream empleados_serializados = new ObjectOutputStream(new FileOutputStream("src/main/resources/empleados.ser"));
            empleados_serializados.writeObject(listaEmpleados);
            empleados_serializados.close();
        } catch (IOException e) {
            System.out.println("No funciona.");
            throw new RuntimeException(e);
        }

        try{
            ObjectInputStream leerEmpleado = new ObjectInputStream(new FileInputStream("src/main/resources/empleados.ser"));
            ArrayList<Empleado> empleadoLeido = (ArrayList<Empleado>) leerEmpleado.readObject();
            leerEmpleado.close();

            TreeMap<String, Empleado> ordenarEmpleados = new TreeMap<>();
            for (Empleado emp : empleadoLeido) {
                ordenarEmpleados.put(emp.getNombre(), emp);
            }

            for (String nombre : ordenarEmpleados.keySet()) {
                System.out.println("Empleado: " + nombre + " > Datos: " + ordenarEmpleados.get(nombre));
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No funciona.");
            e.printStackTrace();
        }
    }
}
