import java.util.ArrayList;

public class ListaNombres{
    
    private String nombreDeLaLista; //Establecemos un atributo nombre de la lista
    private ArrayList<String> listadenombres; //Declaramos un ArrayList que contiene objetos String
    
    public ListaNombres (String nombre){ // constructr crea una lista de nombres vacia

        nombreDeLaLista = nombre;
        listadenombres = new ArrayList<String>(); // creamos el objeto de tipo ArrayList
    
    } //Cierre del constructor
    
    
    public void addNombre (String valor_nombre) { listadenombres.add(valor_nombre);} // cierre del metodo
    
    public String getNombre(int posicion){
        
        if(posicion >= 0 && posicion < listadenombres.size()) {
        
            return listadenombres.get(posicion);}
            
        else{ return "No existe nombre para la posicion solicitada";}
            
        }
    
    public int getTamaño() {return listadenombres.size();}
    
    public void removeNombre (int posicion){
        if (posicion >= 0 && posicion < listadenombres.size()){
        
            listadenombres.remove(posicion);

        }
        else{} // else vacio. no existe nombre para la posicion solicitada, no se ejecuta ninguna
        //instruccion   
    }
}
    
