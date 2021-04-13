package com.company;

public class libro {
    String titulo;
    double precio;
    int stock;
    autor autor;

    public libro (String titulo, double precio, int stock, autor autor)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public com.company.autor getAutor() {
        return autor;
    }

    public void setAutor(com.company.autor autor) {
        this.autor = autor;
    }
}
