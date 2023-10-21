package com.tema10;

public class ArrayBidimencional {
    public static void main(String[] args) {
        int arreglo[][] = new int[2][5];
        arreglo[0][0] = 10;
        arreglo[0][1] = 20;
        arreglo[0][2] = 30;
        arreglo[0][3] = 40;
        arreglo[0][4] = 50;
        
        arreglo[1][0] = 60;
        arreglo[1][1] = 70;
        arreglo[1][2] = 80;
        arreglo[1][3] = 90;
        arreglo[1][4] = 100;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("valor de i: " + i);
        

            for (int j = 0; j < arreglo[1].length; j++) {
                System.out.println("valor de i: " + i + " y j= " + j);
                System.out.println(arreglo[i][j]);
            }
        }
    }

}
