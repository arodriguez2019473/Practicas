public class Taxi{ //El nombre de la clase
    private String ciudad; // ciudad de cada objeto taxi
    private String matricula; // Matricula de cada objeto taxi
    private String distrito; // Distrito asiganado a cada objeto taxi
    private int tipoMotor; // tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = disel
 
    
    //Constructor: cuando se cree un objeto taxi se ejecutara el codigo que incluyamos en el constructor
    public Taxi(){
        
        ciudad = "Guatemala";
        matricula = "Foc2813";
        distrito = "Desconocido";
        tipoMotor = 2;
        
    } //Cierre del constructor ... el codigo continua
    
    public Taxi(String valorMatricula, String valorDistrito, int valorTipoMotor){
    
        ciudad = "Guatemala";
        matricula = valorMatricula;
        distrito = valorDistrito;
        tipoMotor = valorTipoMotor;
        
    }
    
    //Metodo para establecer la matricula de un taxi
    public void setMatricula(String valorMatricula){
        
        matricula = valorMatricula;// La matricula del objeto taxi adopta el valor que contenga valorMatricula
    
    }//Cierre del metodo
    
    public void setDistrito(String valorDistrito){
        
        distrito  = "Distrito " + valorDistrito;// el valor distrito del objeto taxi odopta el valor indicado
        
    }
    
    //Metodo para establecer el distrito de un taxi
    public void setTipoMotor(int valorTipoMotor){
    
        tipoMotor = valorTipoMotor; //El tipoMotor del objeto taxi adopta el valor que contenga valorTipoMotor
    
    } // cierre metodo
    
    //Metodo para obtener la matricula del objeto taxi
    public String getMatricula() {return matricula;} //Cierre del metodo
    
    //Metodo para obtener el distrito del objeto taxi
    public String getDistrito() {return distrito;}//Cierre del metodo
    
    //Metodo para obtener el tipo de motor del objeto taxi
    public int getTipoMotor() {return tipoMotor;}//Cierre del metodo
    
}//cierre de la clase