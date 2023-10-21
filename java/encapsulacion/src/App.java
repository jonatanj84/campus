public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jonatan");
        persona.setEdad(38);
        persona.setTelefono(304.6589481);
        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        double telefono = persona.getTelefono();
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Telefono: " + telefono);
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