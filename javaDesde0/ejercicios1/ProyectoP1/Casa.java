public class Casa{

    private double superficie;
    private String direccion;
    private SalonCasa salonCasa;
    private CocinaCasa cocina;
    
    
    public Casa(){
        
        superficie = 2.5;
        direccion = "AUHSIH";
        salonCasa = new SalonCasa();
        cocina = new CocinaCasa();
    
    } 
    
    
    public Casa(double valorsuperficie, String valordireccion, SalonCasa objetoSalonCasa, CocinaCasa objetoCocina){
        
        superficie = valorsuperficie;
        direccion = valordireccion;
        salonCasa = new SalonCasa(objetoSalonCasa.getNumeroDeTelevisores(),objetoSalonCasa.getTipoSalon());
        cocina = new CocinaCasa(objetoCocina.getEsIndependiente(),objetoCocina.getNumeroDeFuegos());
        
    }

    
    
    
    
}
