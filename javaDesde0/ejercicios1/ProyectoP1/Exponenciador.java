public class Exponenciador{

    public Exponenciador(){
    
    }
    
    public int potencialterado(int m , int n){
        
        int resultado = 1;
        
            for(int i = 1; i<=n; i++){
            
                resultado = resultado*m;
            
            }
        return resultado;
        
    }

    public int potenciaConRecursion(int m, int n){
    
        if(n==0){ return 1;
        }
        else{ return m * potenciaConRecursion(m,n-1);}
    }
}
