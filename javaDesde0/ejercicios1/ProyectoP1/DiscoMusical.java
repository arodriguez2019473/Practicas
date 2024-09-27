public class DiscoMusical{

    private String titulo;
    private String autor;
    private int añoEdicion;
    private String formato;
    private boolean digital;
    private float tiempo;
    
    
    public DiscoMusical()
    {
  
        titulo = "a";
        autor = "yo";
        añoEdicion = 2024;
        formato = ".png";
        digital = true;
        
        
    }
    
    
    
    
    public void setTitulo(String valorTitulo){
        titulo = valorTitulo;
    }
    
    public void setAutor(String valorAutor){
        autor = valorAutor;
    }
    
    public void setAñoEdicion(int valorAñoEdicion){
        añoEdicion = valorAñoEdicion;
    }
    
    public void setFormato(String valorFormato){
        formato = "formato" + valorFormato;
    }
    
    public void setDigital(boolean valorDigital){
        digital = valorDigital;
    }
    
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public int getañoEdicion(){return añoEdicion;}
    public String getFormato(){return formato;}
    public boolean getDigital(){return digital;}
        
}   
