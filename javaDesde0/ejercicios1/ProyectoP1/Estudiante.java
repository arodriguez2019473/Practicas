public class Estudiante{// El nombre de la clase

    private String nombre;//Campo de los objetos estudiantees
    
    public Estudiante(){
    
    nombre = "Pepe";
    
    }//Cierre el constructor
    
    
    //Metodo que devuelve true si el nombre del objeto tipo estudiante es pepe
    
    public boolean esPepe(){
    
        boolean seLLamaPepe = false; // variable local
        
        if(nombre == "Pepe") { seLLamaPepe = true;}
        return seLLamaPepe;
        
    } // cierre del metodo

    public boolean esPepe1(){
    
        boolean seLLamaPepe = true;
        
        if(nombre == "Pepe") { seLLamaPepe = true;}
        return seLLamaPepe;
        
    }
    
} // cierre de la clase
