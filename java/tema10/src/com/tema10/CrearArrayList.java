package com.tema10;

import java.util.ArrayList;

public class CrearArrayList {
    
    public static void main(String[] args) {

        ArrayList<Integer> listaNum = new ArrayList();
        
        
        for(int i = 0; i < 10; i++){
            int suma = i + 1;
            listaNum.add(suma);

            System.out.println("Estoy en i " + listaNum.get(i));

            
            }
             
            for(int j = 0; j < listaNum.get(j); j++){
               // int resta = 1;
                
 
                  if (listaNum.get(j) % 2 == 0) {
                    listaNum.remove(j);

                     System.out.println("Estoy en j " + listaNum.get(j));
                 }
              

            
        }
        
    }
}
