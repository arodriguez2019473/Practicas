import java.util.Scanner;
import java.util.ArrayList;

public class ListaDiscos{
    
    private String discoConMasVentas;
    private ArrayList<String> listadico;
    
    public ListaDiscos(String dico){
        
        discoConMasVentas = dico;
        listadico = new ArrayList<String>();
    }

    public void addDico (String discoConMasDeVentas) { 

        listadico.add(discoConMasDeVentas);
        listadico.add("All I want is you.");
        listadico.add("Jalisco");

    }
    
    public String getDico(int posicion){
        
        if (posicion >= 0 && posicion < listadico.size()){
         
            return listadico.get(posicion);
        
        }
        
        else {
            
            return "No existe el disco en la posicion";
        }
        
    }
    
    public int getTamañodico() {return listadico.size();}

    
    public void removeDico (int posicion){
    
        if (posicion >= 0 && posicion < listadico.size()){
        
            listadico.remove(posicion);
        }
        
        else{}
    
    }
    

}
