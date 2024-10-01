public class nose{

    public nose(){
    }

    
    String combinacion(String valor_text1, String valor_text2, String valor_text3){
        
        String combinacion = valor_text1.substring(0,2)+"_"+valor_text2.substring(0,4)+"_"+valor_text3.substring(0,6);
        
        return combinacion;
        
    }
    

}
