public class TestFor{

    public static void main(String [] args){
    
        for (int i = 0; i < 5; i++){// repite gracias cinco veces
            
            System.out.println("Gracias");
    
        }
        
        for (int i = 0; i<("Gracias").length(); i++){ // va devolviendo en cada iteraion una letra mas de la cadena
        
            System.out.println("Gracias".substring(0,i+1));
            
        }
        
    }

}
