import java.util.Scanner;

public class EntradaFamosos{

    private String entradaTeclado;
    
    public EntradaFamosos (){ 
        
        entradaTeclado = "";
        pedirEntradaFamoso();
        
    } 
    
    public void pedirEntradaFamoso(){ 
        
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine(); 
    
    } 
    
    public String getEntrada() {return entradaTeclado;} 
    
    public String getPrimeraPalabra() {
        
        for(int i = 0; i<entradaTeclado.length()-1;i++){
        
            if (entradaTeclado.substring (i,i+1).equals("")){
                return entradaTeclado.substring(0,i+1);
            }
                    
        }
        
        return entradaTeclado;

    }
    
    public int getLongitud(){
        return entradaTeclado.length();
    }
    
    
    
}

