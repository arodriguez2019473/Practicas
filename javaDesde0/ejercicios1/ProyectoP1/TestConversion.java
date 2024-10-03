import java.util.ArrayList;

public class TestConversion{

    public static void main (String [] Args){
    
        ArrayList<Integer>miListadoAL;
        miListadoAL = new ArrayList<Integer>();
        ArrayList<Integer>tmpAL = new ArrayList<Integer>();
            miListadoAL.add(44);
            miListadoAL.add(7);
            miListadoAL.add(76);
            miListadoAL.add(29);
            miListadoAL.add(17);
        
        for (int i = 1; i<= miListadoAL.size(); i++){
        
            if (miListadoAL.get(i-1)<10){
            
                System.out.println("detectado un objeto ("+i+"): "+miListadoAL.get(i-1)+" ,integer con valor menor de 10, sera eliminado");
                tmpAL.add(i-1);
            }
            
            System.out.println("Elemento en array list("+1+"): " + miListadoAL.get(i-1));
                
            }
        

        for (int i=0; i < tmpAL.size(); i++) {
            System.out.println ("Eliminamos ítem "+ (tmpAL.get(i)+1) +": " + miListadoAL.get(tmpAL.get(i) ) );
            miListadoAL.remove( (int) tmpAL.get(i) );   //Introducida conversión de tipos

        }

        System.out.println("Valor devuelto por size() en miListadoAL después de borrado: " + miListadoAL.size() );
        int tmpInt = 0;
    
        for (Integer tmpObjeto: miListadoAL) {
            
            System.out.println ("Elemento en el array list ("+(tmpInt+1)+") : " + tmpObjeto);
            tmpInt++;
    
        }
    } 
}
    

    

