package com.mycompany;

public class producto {
    private int id, cantidad;
    private String producto;
    private double precio;

    public producto(int id, int cantidad, String producto, double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }

    public producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
