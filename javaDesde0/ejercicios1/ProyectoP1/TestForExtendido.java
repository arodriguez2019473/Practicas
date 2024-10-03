import java.util.ArrayList;

public class TestForExtendido {

    public static void main (String [] Args) {

        ArrayList <String> jugadoresDeBaloncesto = new ArrayList<String> ();
        
        jugadoresDeBaloncesto.add ("Michael Jordan");
        jugadoresDeBaloncesto.add ("Kobe Briant");
        jugadoresDeBaloncesto.add ("Pau Gasol"); 
        jugadoresDeBaloncesto.add ("Drazen Petrovic");

        int i = 0;
        System.out.println ("Los jugadores de baloncesto en la lista son: ");
        
        for (String nombre : jugadoresDeBaloncesto) {
            
            System.out.println ((i+1) + ".- " +nombre);
            
            i++; 
        }
    } 
}
