package com.company;

import javax.sound.midi.Soundbank;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro (String titulo, double precio, int stock, Autor autor)
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

    public com.company.Autor getAutor() {
        return autor;
    }

    public void setAutor(com.company.Autor autor) {
        this.autor = autor;
    }

    public void printLibro ()
    {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }

    public void printEligeLibro ()
    {
        System.out.println("El libro, " + getTitulo() + " de " + getAutor().getNombre() + " " + getAutor().getApellido() + ". Se vende a " + getPrecio() + " pesos.");
    }

}
