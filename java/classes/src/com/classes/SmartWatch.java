package com.classes;

public class SmartWatch extends SmartDevice {
    boolean recibirLlamadas;

    public SmartWatch() {
    }

    public SmartWatch(boolean recibirLlamadas) {
        this.recibirLlamadas = recibirLlamadas;
    }

    // con super se realiza una llamda que que utilice el constructor de la classe padre
    public SmartWatch(int resolucion, int horasDeErasDeEncendido, int capacidadDeAlmacanamineto, int temperatura,
            boolean recibirLlamadas) {
        super(resolucion, horasDeErasDeEncendido, capacidadDeAlmacanamineto, temperatura);
        this.recibirLlamadas = recibirLlamadas;
    }

    
    
    

    
    
}
