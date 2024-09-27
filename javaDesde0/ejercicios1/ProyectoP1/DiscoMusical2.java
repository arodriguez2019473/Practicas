import java.util.ArrayList;
import java.util.List;

public class DiscoMusical2 extends Cancion{
    
    private String nombre;
    private double tiempo;
    private double resultado;
    private List<Cancion> listDiscos = new ArrayList<Cancion>();
    
    public DiscoMusical2(){
        String nombre = "as";
        double resultado = 0.00f;
        int disco = 0;
    
    }
    
    public void setNombre(String valorNombre){
        nombre = valorNombre;
    }
    
    public float tiempoCancion(float tiempo){
        resultado = resultado+tiempo;
        return tiempo;
    }
    
    public void addCancion(String nombreCancion, float duracionCancion)
    {
        Cancion newDisco = new Cancion();
        newDisco.setNombre(nombreCancion);
        newDisco.setDuracion(duracionCancion);
        listDiscos.add(newDisco);
        
    }
    
    public double getTiempo(){return tiempo;}
    public double getResultado(){return resultado;}
    public String getNombre(){return nombre;}

}
