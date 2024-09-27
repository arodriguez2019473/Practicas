 public class miPrueba{
   
    public String resultado(String dimeUnString){
    
        System.out.println("dime Un String inicialmente vale "+dimeUnString);
        dimeUnString = dimeUnString + " recibido";
        System.out.println("dime Un String ahora vale "+dimeUnString);
        return "El metodo devuelve " + dimeUnString;
    }
    
}
