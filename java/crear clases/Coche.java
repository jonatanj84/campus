public class Coche {
    
    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructores

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = mmodelo;
        this.peso = peso;
        this.largo = largo;
      

        
    }

    //comportamineto o metodos

    public void acelerar(Integer cantidad){
        this.velocidad += cantidad;
    }


}
