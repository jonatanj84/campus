package objetos;

public class Main {
    
    public static void main(String[] args) {
        Coche coche = new Coche();
        Sytem.out.printlln(coche.velocidadActual);
        coche.acelerar();
        System.out.println();

       
        
    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    //este es el constructior
    public Coche {
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        
    }

    //estos sosn metodos
    public void acelerar() { 
        velocidadAtual += 15;
    }
    public void decelerar() { }

}

