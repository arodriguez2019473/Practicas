public class Bombero{

    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private boolean especialista;
    
    public Bombero(String valorNombre, String valorApellido, int valorEdad, boolean valorCasado, boolean valorEspecialista){
    
        nombre = valorNombre;
        apellidos = valorApellido;
        edad = valorEdad;
        casado = valorCasado;
        especialista = valorEspecialista;
        
    }
    
    public String getNombre(){return nombre;}
    
    public String getApellido(){return apellidos;}
    
    public int getEdad(){return edad;}
    
    public boolean getCasado(){return casado;}
    
    public boolean getEspecialista(){return especialista;}
    
}
