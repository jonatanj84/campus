public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jonatan");
        cliente.setEdad(38);
        cliente.setTelefono(304.6589481);
        cliente.setCredito(0.5);
        String nombre = cliente.getNombre();
        int edad = cliente.getEdad();
        double telefono = cliente.getTelefono();
        double credito = cliente.getCredito();

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(1000000);
        int salario = trabajador.getSalario();

        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Telefono: " + telefono + " Credito: " + credito + " Salario: " + salario);
    }
}

class Persona{
    private String nombre;
    private int edad;
    private double telefono;
 
 
     public void setNombre(String nombre) {
         this.nombre =  nombre;
     }
 
     public String getNombre() {
         return this.nombre;
     }
 
     public void setEdad(int edad) {
         this.edad =  edad;
     }
 
     public int getEdad() {
         return this.edad;
     }
     
     public void setTelefono(double telefono) {
         this.telefono =  telefono;
     }
 
     public double getTelefono() {
         return this.telefono;
     }
     
 }

 class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
 }

 final class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
    
 }

