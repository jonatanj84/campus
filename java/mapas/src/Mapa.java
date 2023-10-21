import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {
        
        Map<String, String> personas = new HashMap<>();

        //el metodo put permite espedcificar una clave
        personas.put("1234", "Nombre Apellido 1");
        personas.put("56787", "Nombre Apellido 2");
        personas.put("91234", "Nombre Apellido 3");
        
        System.out.println(personas);


        //KeySet() nospernmite intera sobre las claves
        for (String Key : personas.keySet()) {
            System.out.println(Key);
        }
        
        //values nos permite iterar sobre los valores
        for (String values : personas.values()) {
            System.out.println(values);
        }

        //este metodo itera clave y valor
        for (Map.Entry<String, String> pair: personas.entrySet() ) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }


    }
}
