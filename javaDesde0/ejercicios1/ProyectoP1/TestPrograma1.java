import java.util.Scanner; // importacion del codigo de la clase Scanner desde la bibilioteca de java

public class TestPrograma1{

    public static void main (String[]args){
        
        System.out.println("Empezamos el programa");
        System.out.println("Por favor intrudzca una cadena por teclado: ");
        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner(System.in); // creacion de un objeto en Scanner
        entradaTeclado = entradaEscaner.nextLine();
        
        System.out.println("Entrada recibida por teclado es: \"" + entradaTeclado + "\"");
    
    }

}
