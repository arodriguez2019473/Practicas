import java.util.Scanner;
import java.util.ArrayList;

public class ListaCantantesFamosos{
    
    private String nombreFamoso;
    private String discoConMasVentas;
    private ArrayList<String> listafamosos;
    
    public ListaCantantesFamosos(String nombre){
        
        nombreFamoso = nombre;
        listafamosos = new ArrayList<String>();

    }
     
    public void addFamosos (String nombreDeFamosos) { 
        
        listafamosos.add(nombreDeFamosos);
        listafamosos.add("Madonna");
        listafamosos.add("Jorge Negrete");
        
    }
    
    public String getNombre(int posicion){
    
        if(posicion >= 0 && posicion < listafamosos.size()) {
        
            return listafamosos.get(posicion);
        }
    
        else {
            return "No existe nombre para la posicion";
        }
        
    }
        
    public int getTamaño() { return listafamosos.size();}
    
    public void removeNombre (int posicion){
        
        if (posicion >= 0 && posicion < listafamosos.size()){
        
            listafamosos.remove(posicion);
        
        }
        else{}
    }

}
