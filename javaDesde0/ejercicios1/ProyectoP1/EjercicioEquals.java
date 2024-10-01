import java.util.Scanner;

public class EjercicioEquals{
    
    public static void main (String [] args){
    
        int i = 0;
        
        String S1 = "cocodr";
        String S2 = "avispa";

        
        while(true){
        
            i++;
            
            boolean res = S1.substring(i-1,i).equals(S2.substring(i-1,i));
            
                
            System.out.println("Letra en la posicion "+ i + " es: "+ res );
        
            if(i==6){
                break;
            }
            
        }
        
    }
    
}
