package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    private Autor[] autores;

    public Libro (String titulo, double precio, int stock, Autor autor, Autor[] autores)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
        this.autores = autores;
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
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor.getNombre() + " " + this.autor.getApellido());
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }

    public void printDetalleLibro ()
    {
        System.out.println("El libro, " + getTitulo() + " de " + getAutor().getNombre() + " " + getAutor().getApellido() + ". Se vende a " + getPrecio() + " pesos.");
    }

    public void printAutoresLibro ()
    {
        System.out.print("El libro, " + getTitulo() + " de los autores ");
        for (int i=0; i < autores.length; i++)
        {
            System.out.print(autores[i].getNombre() + " " + autores[i].getApellido() + " ");
        }
        System.out.print(". Se vende a " + this.precio + " pesos.");
    }

}
