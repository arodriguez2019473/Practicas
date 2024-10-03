import java.util.Arrays;

public class TestUso_copyOf_1 {

    public static void main (String [ ] Args) {

        int [ ] miArray1 = { 2, -4, 3, -7 };

        for (int i=0; i<miArray1.length; i++) {

            System.out.print ("miArray1[" + i +"]= " + miArray1[i]+"; ");

        }

        System.out.println ("");
        int [ ] otroArray = { 1, 2, 4, 8 };

        for (int i=0; i<otroArray.length; i++) {

            System.out.print ("otroArray[" + i +"]= " + otroArray[i]+"; ");

        }

        System.out.println ("¿Son el mismo objeto? ... " + (miArray1==otroArray) );
        System.out.println ("¿Tienen el mismo contenido (relación de igualdad)? ... " + Arrays.equals(miArray1, otroArray) );

        //Copiamos el array utilizando el método copyOf de la clase Arrays

        otroArray = Arrays.copyOf(miArray1, miArray1.length); 

        for (int i=0; i<otroArray.length; i++) {

            System.out.print ("otroArray[" + i +"]= " + otroArray[i]+"; "); 
        
        }

        System.out.println ("¿Son el mismo objeto? ... " + (miArray1==otroArray) );
        System.out.println ("¿Tienen el mismo contenido (relación de igualdad)? ... " + Arrays.equals(miArray1, otroArray) );

    } //Cierre del main

} //Cierre de la clase
