public class TaxiCond{

    private Taxi vehiculoTaxi;
    private Persona conductorTaxi;
    
    public TaxiCond(){
    
        vehiculoTaxi = new Taxi(); // creamos un objeto con el constructor general de Taxi
        conductorTaxi = new Persona(); // creamos un objeto Persona con el constructor general de Persona

    }
    
    public TaxiCond(Taxi objetoTaxi, Persona objetoPersona){
    
        vehiculoTaxi = new Taxi (objetoTaxi.getMatricula(),objetoTaxi.getDistrito(), objetoTaxi.getTipoMotor());
        conductorTaxi = new Persona(objetoPersona.getNombre() );
        
    }
    
    
    public void setMatricula(String valorMatricula){vehiculoTaxi.setMatricula(valorMatricula);}
    
    //Metodo que devuelve la informacion sobre el objeto TaxiCond
    
    public String getDatosTaxiCond(){
    
        String matricula = vehiculoTaxi.getMatricula();
        String distrito = vehiculoTaxi.getDistrito();
        int tipoMotor = vehiculoTaxi.getTipoMotor();
        String cadenaTipoMotor = "";
        
        if (tipoMotor == 0){cadenaTipoMotor = "desconocido";}
        else if (tipoMotor == 1){cadenaTipoMotor = "gasolina";}
        else if (tipoMotor == 2){cadenaTipoMotor = "disel";}
        
        String datosTaxiCond = "el objeto TaxiCond presenta estos datos. Matricula: " 
        + matricula + " Distrito "+distrito+" Tipo de motor: "+ cadenaTipoMotor;
        
        
        System.out.println(datosTaxiCond);
        return datosTaxiCond;
    }
   
}
