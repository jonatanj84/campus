public class App {
   
    public static void main(String[] args) {
        Coche coche = new Coche();
        //antes de acelerar
        System.out.println(coche.velocidadActual);
        //despues de acelerar
        coche.acelerar();
        System.out.println(coche.velocidadActual);
       
      }

       
}

class Coche {
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    public void acelerar() {
        velocidadActual += 15;
    }

    //estos sobn metodos
    public void acelerar() { }
    public void decelerar() {  }
}



