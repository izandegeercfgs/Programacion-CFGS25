package org.example;

public class Producto {

    private String nombre;
    private double precio;
    private String categorias;

    public Producto(String nombre, double precio, String categorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategorias() {
        return categorias;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categorias='" + categorias + '\'' +
                '}';
    }
}
