public class SalonCasa{

    private int numeroDeTelevisores;
    private String tipoSalon;
    
    public SalonCasa(){
        
        numeroDeTelevisores = 0;
        tipoSalon = "desconocido";
        
    }
    
    
    public SalonCasa(int valorNumeroDeTelevisores, String valorTipoSalon){
        
        numeroDeTelevisores = valorNumeroDeTelevisores;
        tipoSalon = valorTipoSalon;
    
    }
    
    public int getNumeroDeTelevisores(){return numeroDeTelevisores;}
    public String getTipoSalon(){return tipoSalon;}
    
}
