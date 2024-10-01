/* Esta clase representa un  depósito cilíndrico donde se almacena aceite  */
public class Deposito{

    // campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;
    
    
    // Constructor sin parametros auxiliares
    public Deposito () { //Lo que hace es llamar al constructor con parámetros pasándole valores vacíos
        
        this(0,0,"");
    }    
    
    // Constructor de la clase que pide los parametros necesarios
    
    public Deposito(float valor_diametro, float valor_altura, String valor_idDeposito){
    
        if (valor_diametro > 0 && valor_altura>0){
            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
            
        }
        else{
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println("Creado deposito con valores por defecto diametro 10 metros altura 5 metros id 000");        
        }
    
    }
    
    public void setValoresDeposito(String valor_idDeposito, float valor_diametro, float valor_altura){
        
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
            if(idDeposito !="" &&valor_diametro > 0 && valor_altura > 0){
            }
            else{
                System.out.println ("valores no adminsibles. No se han establecido valores para deposito");
                // deposito  (0.0f, 0.0f,""); esto no es posible. Un constructor no es un metodo y por tanto no podemos
                // llamarlo
            
                idDeposito = "";
                diametro = 0;
                altura = 0;
            
            }
    }
    
    
    public float getDiametro(){return diametro;}
    public float getAltura (){return altura;}
    public String getIdDeposito(){return idDeposito;}
    public float valorCapacidad(){
        
        float capacidad;
        float pi = 3.1416f; // si no incluimos la f en el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2)*(diametro/2)*altura;
        return capacidad;
    
    }
    
}

    
    
    