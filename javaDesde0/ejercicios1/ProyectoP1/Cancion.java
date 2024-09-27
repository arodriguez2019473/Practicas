
public class Cancion
{
    private String nombre;
    private float duracion;

    /**
     * Constructor for objects of class Cancion
     */
    public Cancion()
    {
        // initialise instance variables
        nombre = "";
        duracion = 0;
    }

    public void setNombre(String valorNombre)
    {
        nombre = valorNombre;
    }
    
    public void setDuracion(float valorDuracion)
    {
        duracion = valorDuracion;
    }
}
