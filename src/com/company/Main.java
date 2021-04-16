package com.company;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Joshua", "Bloch",  "joshua@email.com", 'M');
        Libro libro = new Libro("Effective Java", 450, 150, autor);
        autor.printAutor();
        libro.printLibro();
        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        System.out.println("Los datos del autor de: " + libro.getTitulo() + "son:");
        autor.printAutor();
    }
}
