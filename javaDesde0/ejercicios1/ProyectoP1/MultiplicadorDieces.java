

public class MultiplicadorDieces{

    public MultiplicadorDieces(){}
    
    public double multiplicarPorDieces(double a, int b){
    
        int diez = 1;
        int entero = 10; 
        
            for (int i = 1; i<=b; i++){
        
            diez = entero*diez;
        }
        
        return Math.round(a*diez);
    }
    
}
