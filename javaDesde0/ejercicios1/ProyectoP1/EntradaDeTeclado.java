import java.util.Scanner;

public class EntradaDeTeclado{

    private String entradaTeclado; // variable de instancia (campo) de la clase
    
    public EntradaDeTeclado (){ // constructor
    
        entradaTeclado = "";
        pedirEntrada(); // esto es una llamada a un metodo interno. Al crear un objeto ejecutamos el metodo
    
    } // Cierre del constructor
    
    public void pedirEntrada(){ // metodo de la clase
    
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine(); 
    
    } // cierre del metodo pedirEntrada
    
    public String getEntrada() {return entradaTeclado;} // cierre del metodo pedir entrada
    
    public String getPrimeraPalabra() {
        /* Importante: en javba los objetos no se pueden comparar usando == por eso esto no
         * funcionara
        */
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
