
public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }

    public static int suma(int a, int  b) {
        return a + b;
    }
}
class Coche {
    public int puertas = 4;


    public void sumarPuertas() {
        this.puertas ++;
    }

}