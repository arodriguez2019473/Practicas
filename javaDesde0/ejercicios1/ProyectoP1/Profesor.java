public class Profesor{

    private String nombre;
    private String apellidos; 
    private int edad;
    private boolean casado;
    private boolean especialista;
    
    
    public Profesor(){
    
    }
    
    public Profesor(String nombre, String apellidos, int edad){
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    public String extraerNombre(){
        
        String nombre = "";
        nombre = this.nombre.substring(0,5);
        
        return nombre;
    
    }
    
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public void setApellido(String apellidos){this.apellidos = apellidos;}
    
    public void setEdad(int edad){this.edad = edad;}
    
    
    public String getNombre(){return nombre;}
    
    public String getApellidos(){return apellidos;}
    
    public int getEdad(){return edad;}
    
}
