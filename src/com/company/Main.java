package com.company;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Joshua", "Bloch",  "joshua@email.com", 'M');
        Autor[] autores = new Autor[3];
        autores[0] = new Autor("Jane", "Bach",  "jane@email.com", 'F');
        autores[1] = new Autor("Jake", "Bick",  "jake@email.com", 'M');
        autores[2] = new Autor("John", "Bane",  "john@email.com", 'M');
        Libro libro = new Libro("Effective Java", 450, 150, autor, autores);

        autor.printAutor();
        System.out.println(" ");
        libro.printLibro();
        System.out.println(" ");
        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        System.out.println(" ");
        System.out.println("Los datos del autor de " + libro.getTitulo() + " son:");
        autor.printAutor();
        System.out.println(" ");
        libro.printDetalleLibro();
        System.out.println(" ");
        libro.printAutoresLibro();

    }
}
