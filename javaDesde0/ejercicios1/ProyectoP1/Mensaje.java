public class Mensaje{

    private String remitente;
    private String para;
    private String texto;

    // constructor con sobrecarga de nombres al coincidir nombres de parametros con los de campos
    
    public Mensaje(String remitente, String para, String texto){
    
    //remitente = remitente; // como va a saber java cual es el parametro y cual es el campo
    //para = para; // como va a saber java cual es el parametro y cual es el campo
    //texto = texto; // como va a saber java cual es el parametro y cual es el campo
      
    this.remitente = remitente; // this.remitente es el campo y remitente el parametro
    this.para = para; // this.para es el campo y para el parametro
    this.texto = texto; // this.texto es el campo y texto el parametro
    
    } // cierre del constructor
    
    // Metodo con sobrecarga de nombres al conincidir un parametro con un campo
    
    public void setRemitente(String remitente){
    
        //remitente = remitente; // como va a saber java cual es el parametro y cual es el campo
        this.remitente = remitente; // this.remitente es el campo y remitente el parametro
    
    }
    
    //metodo con sobrecarga de nombres al coincidir una variable local con un campo
    
    public String extraerFraccionTexto (){
    
        String texto = ""; // esto supone declarar una variable local que "tapa" al campo
        //texto = texto.substring(0,5); // como va a saber java cual es el parametro y cual es el campo
        texto = this.texto.substring(0,5); //this.texto es el campo de los objetos de la clase
        return texto;
    }
    
}
