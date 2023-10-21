package com.tema10;

import java.util.Vector;

public class Vectores {
    
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("datos del vector: " + vector);

        vector.remove(2);
        vector.remove(3);

        System.out.println("datos del vector nuevo: " + vector);

        System.out.println("tamaño" + vector.size() + "capacidad" + vector.capacity());
    }
}

/*4.	Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si 
tuviésemos 1000 elementos para ser añadidos al mismo. 

El problema de usar un vector con la capcidad por defecto es que se estaria ocupando mucha capcidad de memoria cada 
vez que vector pasa su capacidad y genera una copia.

Se recominda agregar una capcidad de crecimiento inicial lo mas proxima al numeros de elementos que seran añadidos
*/
