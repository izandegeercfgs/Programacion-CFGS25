package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Smartphone", 150.0, "Electrónica"));
        listaProductos.add(new Producto("Tablet", 72.0, "Electrónica"));
        listaProductos.add(new Producto("Perfume Árabe", 1272.0, "Droguería"));
        listaProductos.add(new Producto("Kebab", 2.0, "Alimentación"));

        FiltroProducto filtro = (producto) -> {
            if (producto.getCategorias().equals("Electrónica") && producto.getPrecio()>100) {
                return true;
            }
            return false;
        };

        List<Producto> prodtos_filtrados = new ArrayList<>();

        for (Producto producto : listaProductos) {
            if (filtro.filtrar(producto)) {
                prodtos_filtrados.add(producto);
            }
        }

        for (Producto producto : prodtos_filtrados) {
            System.out.println(producto);
        }
    }
}
