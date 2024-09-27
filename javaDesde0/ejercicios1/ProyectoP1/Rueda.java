public class Rueda{
    
    private String tipo;
    private double grosor;
    private double diametro;
    private String marca;

    public Rueda(){
    
        tipo = "";
        grosor = 0.25;
        diametro = 1.4;
        marca = "";
        
    }
    
    
    public void comprobarDimensiones(){
    
    if(diametro>1.5 && grosor<=0.4){
        
        System.out.println("La rueda es para un vehiculo grande");
    
    }
    
    else if(diametro<=1.4 && diametro>=0.8 && grosor<=0.25){
            
        System.out.println("la rueda es para un vehiculo mediano");
    
    }
    
    else{
        System.out.println("El grosor para esta rueda es inferior al recomendado");
    }
    
    }

}
