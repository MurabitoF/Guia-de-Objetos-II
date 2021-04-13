package com.company;

public class Main {

    public static void main(String[] args) {
	    ej2();
    }

    public static void ej2(){
        Cliente cliente1 = new Cliente("Franco","email", 15);
        ItemVenta producto1 = new ItemVenta(1,"Monitor",2,5000.00);
        ItemVenta producto2 = new ItemVenta(2,"Teclado",1,800.00);
        ItemVenta producto3 = new ItemVenta(3,"Mouse",1,1000.00);
        Factura factura1 = new Factura(cliente1);

        System.out.println(factura1.getFactura());
        factura1.agregarItem(producto1);
        factura1.agregarItem(producto2);
        factura1.agregarItem(producto3);
        System.out.println(factura1.getFactura());
    }
}
