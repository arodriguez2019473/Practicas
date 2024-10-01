
/* Ejemplo - aprenderaprogramar.com */

// Definición de una clase de ejemplo con uso del método length sobre objetos String aprenderaprogramar.com

// Combina las tres primeras letras de dos textos introducidos por el usuario en una sola cadena separada por un espacio

public class Combinador {

    private String texto1;

    private String texto2;

    public Combinador () { texto1 = ""; texto2 = ""; }

 

    //Método que combina las tres primeras letras de cada cadena

    String Combinacion (String valor_texto1, String valor_texto2) {

        if (valor_texto1.length() >= 3 && valor_texto2.length() >= 3) { //Comprobación

            String combinacion = valor_texto1.substring (0, 3) + " " + valor_texto2.substring (0 ,3);

            return combinacion;

        } else { return "No aporta cadenas válidas"; }

    } //Cierre del método  

        //Método que combina las cadenas aunque contengan menos de 3 caracteres (nuevo método)

    String CombinadoSiempre (String valor_texto1, String valor_texto2) {

        int longitud_texto1 = 3;  //Si podemos extraeremos tres caracteres

        int longitud_texto2 = 3;

        String CombinadoSiempre = ""; //Cadena vacía, variable local
        if (valor_texto1.length() < 3) {//Si hay menos de 3 caracteres extraemos los que haya

            longitud_texto1 = valor_texto1.length();

        }

        if (valor_texto2.length() < 3) { longitud_texto2 = valor_texto2.length(); }

    CombinadoSiempre = valor_texto1.substring (0,longitud_texto1)+" "+ valor_texto2.substring (0, longitud_texto2);

    return CombinadoSiempre;

    } //Cierre del método

 
} //Cierre
