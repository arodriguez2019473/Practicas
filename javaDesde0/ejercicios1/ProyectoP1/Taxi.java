public class Taxi{ //El nombre de la clase
    private String ciudad; // ciudad de cada objeto taxi
    private String matricula; // Matricula de cada objeto taxi
    private String distrito; // Distrito asiganado a cada objeto taxi
    private int tipoMotor; // tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = disel
 
    
    //Constructor: cuando se cree un objeto taxi se ejecutara el codigo que incluyamos en el constructor
    public Taxi(){
        
        ciudad = "Guatemala";
        matricula = "";
        distrito = "Desconocido";
        tipoMotor = 0;
        
    } //Cierre del constructor ... el codigo continua
    
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
    public String geteDistrito() {return distrito;}//Cierre del metodo
    
    //Metodo para obtener el tipo de motor del objeto taxi
    public int getTipoMotor() {return tipoMotor;}//Cierre del metodo
    
}//cierre de la clase