package com.fucion;

public class Funciones {
    
    public static void main(String[] args) {

        int precioDelProducto = 5500;
        Double iva = 12.5;

        Double precioTotalProducto = precioConIva(precioDelProducto, iva);
        System.out.println("El precio toatal del prodecto es: " + precioTotalProducto);
        
    }

    static Double precioConIva(int precio, Double iva){
        return precio + iva;

    }
}
