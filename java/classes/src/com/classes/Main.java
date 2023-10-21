package com.classes;

public class Main {
    

    public static void main(String[] args) {
        
        SmartDevice smartDevice = new SmartDevice(450, 24, 10, 50);
        System.out.println(smartDevice.temperatura);

        SmartWatch smartwatch = new SmartWatch(150, 48, 5, 30, true);

        SmartDevice smartphone = new SmartPhone(500, 30, 15, 50, true);
        System.out.println("fin");

        SmartPhone.apagar(55);
        System.out.println(SmartPhone.temperatura);



    }
}
