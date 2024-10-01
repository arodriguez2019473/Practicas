import java.util.Scanner;
import java.util.ArrayList;

public class ListaCantantesFamosos{
    
    private String nombreFamoso;
    private ArrayList<String> listafamosos;
    private String entradaFamosos;
    
    public ListaCantantesFamosos (String nombre){
    
        nombreFamoso = nombre;
        listafamosos = new ArrayList<String>();
        entradaFamosos = "";
        pedirFamosos();
    }
    
    public void ingresarFamosos(){
        entradaFamosos = "";
        pedirFamosos();
    }
        
    public void pedirFamosos(){
    
        Scanner entradaScanner = new Scanner(System.in);
        entradaFamosos = entradaScanner.nextLine();
    }
    
    public String getEntrada() {return entradaFamosos;}
    
    public String getPars(){
        
        for(int i = 0; i<entradaFamosos.length()-1;i++){
        
            if (entradaFamosos.substring (i,i+1).equals("")){
                return entradaFamosos.substring(0,i+1);
            }
                    
        }
        
        return entradaFamosos;

    }
    
    public int getLongitud(){return entradaFamosos.length();}
    
    public void addNombre (String nombreDeFamosos) { listafamosos.add(nombreDeFamosos);}
    
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
