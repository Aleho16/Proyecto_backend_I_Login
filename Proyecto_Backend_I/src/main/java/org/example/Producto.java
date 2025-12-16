package org.example;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private boolean estado;


    public Producto() {}


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = true;
    }
}