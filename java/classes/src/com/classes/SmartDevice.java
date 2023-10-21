package com.classes;

public class SmartDevice {
    
    int resolucion;
    int horasDeEncendido;
    int capacidadDeAlmacanamineto;
    static int temperatura;

    public SmartDevice() {
    }

    public SmartDevice(int resolucion, int horasDeErasDeEncendido, int capacidadDeAlmacanamineto, int temperatura) {
        this.resolucion = resolucion;
        this.horasDeEncendido = horasDeErasDeEncendido;
        this.capacidadDeAlmacanamineto = capacidadDeAlmacanamineto;
        this.temperatura = 0;

    }

    public static void apagar(int temperaturaMaxima) {

        temperatura += temperaturaMaxima;

        if (temperatura > 50) {
            System.out.println("apagar");
            
        }
        
    }
    

}



