package com.tema10;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class Divirdir {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       double valor1;
       double valor2;

       System.out.println("ingresa valor 1");

       valor1 = scanner.nextInt();
      
       try {
      
      
       System.out.println("ingresa valor 2");
       valor2 = scanner.nextInt();

       if (valor2 == 0) {
            throw new ArithmeticException();
       }else{
        double res = valor1/valor2;
       
        System.out.println("El resutado es: " + res);

       }
       
       } catch (ArithmeticException ar) {
        //TODO: handle exception
        System.out.println( "Esto no se puede hacerse" );
       }
            
       
       
       }

           
    
   

}
