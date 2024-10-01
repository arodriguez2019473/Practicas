import java.util.Scanner;

public class EjercicioWhile{

    public static void main(String [] Args){
       
        int i = 0;
         
        System.out.println("Empezando el Programa");
        System.out.println("Ingrese la palabra a descomponer");
        String palabra = "";
        
        Scanner entradaScanner = new Scanner(System.in);
        palabra = entradaScanner.nextLine();
        
        int length = palabra.length();
        
        while(true){
            i++;
            
            System.out.println("Letra "+(i)+": "+palabra.substring(i-1,i));
            
            if(i==length){
                break;
            }
        }
    }
}
