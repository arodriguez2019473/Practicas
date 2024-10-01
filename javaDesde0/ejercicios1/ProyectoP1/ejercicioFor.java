import java.util.Scanner;

public class ejercicioFor{

    public static void main(String [] args){
        
        System.out.println("Iniciando");
        System.out.println("Ingresemos la palabra que se desea descomponer");
        String palabra = "";
        
        Scanner entradaScanner = new Scanner(System.in);
        palabra = entradaScanner.nextLine();
        
        int length = palabra.length();    

            for (int i = 0; i<length; i++){
            
                System.out.println("Letra "+(i+1)+": "+palabra.substring(0+i,i+1));
            
            }
        
    }
}
