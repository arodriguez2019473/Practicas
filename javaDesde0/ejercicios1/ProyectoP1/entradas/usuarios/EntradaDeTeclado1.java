package entradas.usuarios;
import java.util.Scanner; //Importación de la clase Scanner desde la biblioteca Java
public class EntradaDeTeclado1 {  // Definimos la clase EntradaDeTeclado 

    private String entradaTeclado; //Variable de instancia (campo) del método

    //Constructor
    public EntradaDeTeclado1 ()  {
        entradaTeclado=""; } //Cierre del constructor
        
    public void pedirEntrada ()  {  //Método de la clase 
        
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();

    } //Cierre del método pedirEntrada

    public String getEntrada () {
        return entradaTeclado;
 } //Cierre del método getEntrada

} //Cierre de la clase