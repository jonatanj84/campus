package com.tema10;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CopiaDeFichero {
    
    public static void main(String[] args) {
      try {
        InputStream in = new FileInputStream("fileIn" );
        byte [] datos = in.readAllBytes();

        PrintStream out = new PrintStream("fileOut");
        out.write(datos);

      } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Excecion: " + e.getMessage());
        
      }  
        
      
    }
}
