import java.util.Arrays;

public class TestMetodoFillArrays {

    public static void main (String [ ] Args) { 
        
        int [ ] miArray = new int[10];
        Arrays.fill(miArray, 33);

        for (int tmp: miArray) {
            
            System.out.print (tmp + ","); 
            
        }    //Recorrido del array con un for each   

    } 
} //Cierre del main y de la clase
