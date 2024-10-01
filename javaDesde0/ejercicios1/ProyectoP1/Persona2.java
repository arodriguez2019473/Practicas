public class Persona2{ // Clase

    private String nombre;
    private int edad;
    
    
    public Persona2(String nombrePersona){ // Constructor 1
        
        nombre = nombrePersona;
        edad = 0;
        
    }
    
    public Persona2(){ // Constructor 2
    
        nombre = "";
        edad = 0;
    
    }

    public String getNombre(){return nombre;} // metodo
    
}
