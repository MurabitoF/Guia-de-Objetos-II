package com.company.ejercicio2;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void showItemVenta(){
        String output = String.format("ItemVenta[id=%d, descripcion=%s, cantidad=%d, pUnitario=%1.2f, pTotal=%1.2f]", this.id, this.descripcion, this.cantidad, this.pUnitario);
        System.out.println(output);
    }
}
