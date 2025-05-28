package org.unidad5.Teoria.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teoria2 {
    public static void ArraysList() {
        // a) Crear una nueva lista de la compra y verificar si está vacía
        ArrayList<String> listaCompra = new ArrayList<>();
        boolean estaVacia = listaCompra.isEmpty();
        System.out.println("¿La lista está vacía? " + estaVacia);

        // Añadir un elemento y verificar de nuevo
        listaCompra.add("Pan");
        estaVacia = listaCompra.isEmpty();
        System.out.println("¿La lista está vacía después de añadir 'Pan'? " + estaVacia);

        // b) Añadir 5 elementos más, todos a la vez
        ArrayList<String> nuevosProductos = new ArrayList<>(List.of("Leche", "Huevos", "Arroz", "Manzanas", "Café"));
        listaCompra.addAll(nuevosProductos);

        // Mostrar el contenido de la lista
        System.out.println("Lista de la compra actual: " + listaCompra);

        // c) Mostrar el tercer elemento de la lista (índice 2)
        System.out.println("Tercer elemento de la lista: " + listaCompra.get(2));

        // d) Cambiar el segundo elemento (índice 1) por "Queso", solo si no está ya en la lista
        if (!listaCompra.contains("Queso")) {
            listaCompra.set(1, "Queso");
        } else {
            System.out.println("No se puede reemplazar con 'Queso' porque ya existe en la lista.");
        }

        System.out.println("Lista tras posible modificación del segundo elemento: " + listaCompra);

        // e) Comprobar si "Leche" está en la lista
        boolean contieneLeche = listaCompra.contains("Leche");
        System.out.println("¿La lista contiene 'Leche'? " + contieneLeche);

        // f) Controlar duplicados al añadir un nuevo elemento
        String nuevoElemento = "Cereal";
        if (!listaCompra.contains(nuevoElemento)) {
            listaCompra.add(nuevoElemento);
            System.out.println(nuevoElemento + " añadido a la lista.");
        } else {
            System.out.println(nuevoElemento + " ya está en la lista. No se añadió.");
        }

        // Intentar modificar un elemento con duplicado
        if (!listaCompra.contains("Huevos")) {
            listaCompra.set(0, "Huevos");
        } else {
            System.out.println("No se puede modificar porque 'Huevos' ya existe en la lista.");
        }

        // g) Mostrar el número de elementos
        System.out.println("Número de productos en la lista: " + listaCompra.size());

        // h) Clonar la lista actual
        ArrayList<String> listaClonada = new ArrayList<>(listaCompra);
        System.out.println("Lista clonada: " + listaClonada);

        // i) Limpiar la lista clonada y verificar que está vacía
        listaClonada.clear();
        boolean clonVacia = listaClonada.isEmpty();
        System.out.println("¿La lista clonada está vacía tras limpiar? " + clonVacia);

        // j) Comparar las listas
        boolean sonIguales = listaCompra.equals(listaClonada);
        System.out.println("¿La lista original y la clonada son iguales? " + sonIguales);

        // k) Añadir dos elementos a la lista clonada
        listaClonada.add("Zumo");
        listaClonada.add("Yogur");
        System.out.println("Lista clonada después de añadir elementos: " + listaClonada);

        // l) Mostrar elementos que faltan en la clonada respecto a la original
        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.removeAll(listaClonada);
        System.out.println("Elementos faltantes en la lista clonada: " + faltantes);

        // m) Crear una lista de precios aleatorios para cada producto en la lista original
        ArrayList<Integer> precios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listaCompra.size(); i++) {
            precios.add(random.nextInt(11)); // Números entre 0 y 10
        }

        // Mostrar ambas listas
        System.out.println("\nProductos:");
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i) + " - " + precios.get(i) + "€");
        }
    }
}
