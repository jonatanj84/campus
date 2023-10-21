package com.tema10;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista {
    
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

       for(String nombre : listaEnlazada){
            System.out.println(nombre);
       }

    }
}
