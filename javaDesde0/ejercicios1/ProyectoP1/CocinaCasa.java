public class CocinaCasa{
    
    private boolean esIndependiente;
    private int numeroDeFuegos;
    
    public CocinaCasa(){
    
        esIndependiente = false;
        numeroDeFuegos = 0;
        
    }
    
    public CocinaCasa(boolean valorEsIndependiente,int valorNumeroDeFuegos){
    
    esIndependiente = valorEsIndependiente;
    numeroDeFuegos = valorNumeroDeFuegos;
    
    }
    
    public boolean getEsIndependiente(){return esIndependiente;}
    public int getNumeroDeFuegos(){return numeroDeFuegos;}
        
}
