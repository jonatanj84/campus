package tema1.tema1;


public class TiposDeDatos {
    
    public static void main(String[] args) {
        String[] enteros = new String[] {"byte numero1", "short numero2", "int numero3", "long numero4"};
        String[] decimales = new String[] {"float decimal1", "double cedimal2"};
        String[] booleanos = new String[] {"treu = verdadero", "false = falso"};
        String cadenaDeTexto = "String";
        String caracter = "char";

        for(int i = 0; i < enteros.length; i++){
            System.out.println("Tipos de datos enteros: " + enteros[i]);
        }

        for(int i = 0; i < decimales.length; i++){
            System.out.println("Tipos de datos decimales: " + decimales[i]);
        }

        for(int i = 0; i < booleanos.length; i++){
            System.out.println("Tipos de datos booleanos: " + booleanos[i]);
        }

        System.out.println("Dato tipo cadena de texto; " + cadenaDeTexto);

        System.out.println("Dato tipo caracter: " + caracter);

    }

}
