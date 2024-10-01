import java.util.Scanner;
public class ejerciciomain{

    public static void main(String[] args) {
        
        System.out.println("Empezamos programa");
        System.out.println("Ingrese la palabra para la cadena de texto");
        String palabra = "";
        
        Scanner entradaEscaner = new Scanner(System.in);
        palabra = entradaEscaner.nextLine();
        
        int length = palabra.length();
        
        if (length>= 5 && length <= 15 && palabra.startsWith("a")) {
            System.out.println("La cadena introducida tiene entre 5 y 15 caracteres ,comienza por a");
        }
        else {
            System.out.println("La cadena introducida no tiene entre 5 y 15 caracteres esta tiene "+length+" y esta no comienza con a");
        }
    
    }

}
