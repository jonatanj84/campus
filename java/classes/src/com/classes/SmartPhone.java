package com.classes;

public class SmartPhone extends SmartDevice {

    boolean procesadorPotente;

    public SmartPhone() {
    }

    
    public SmartPhone(int resolucion, int horasDeErasDeEncendido, int capacidadDeAlmacanamineto, int temperatura,
            boolean procesadorPotente) {
        super(resolucion, horasDeErasDeEncendido, capacidadDeAlmacanamineto, temperatura);
        this.procesadorPotente = procesadorPotente;
    }
    
}
