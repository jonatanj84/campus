package com.tema10;

public class CadenaInvertida {
    
    public static void main(String[] args) {
        
        System.out.println(reverse());
        }


        public static String reverse() { 
            String saludar = "Hola Mundo";
        
            StringBuilder cadena = new StringBuilder(saludar);
            
            System.out.println(cadena.reverse());
            return saludar;

        }

        
}
