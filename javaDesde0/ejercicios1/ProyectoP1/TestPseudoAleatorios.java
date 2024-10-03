import entradas.usuarios.EntradaDeTeclado1;

public class TestPseudoAleatorios {

    public static void main (String [ ] Args) {

        Integer tmpInteger = 0; 
        EntradaDeTeclado1 entradaMain = new EntradaDeTeclado1();
        char tecla = 'S';

        while (tecla =='S') {

            System.out.print ("Por favor introduzca el número de elementos en la serie de números aleatorios: ");
            entradaMain.pedirEntrada();
            tmpInteger = tmpInteger.valueOf (entradaMain.getEntrada() );
            
            SerieDeAleatorios serieDePrueba = new SerieDeAleatorios ( (int) tmpInteger);
            serieDePrueba.generarSerieDeAleatorios();
            serieDePrueba.mostrarSerie();
            
            tecla = ' ';
            System.out.println ("\n¿Generar otra serie (S/N):");

            while (tecla !='n' && tecla !='N' && tecla !='s' && tecla !='S') {

                entradaMain.pedirEntrada();
                
                //Ojo tenemos que comparar usando equals porque los string son objetos!!!!
                if (entradaMain.getEntrada().equals("n") || entradaMain.getEntrada().equals("N") ) { tecla = 'N'; }
                else if (entradaMain.getEntrada().equals("s") || entradaMain.getEntrada().equals("S") ) { tecla = 'S'; }

            } //Cierre del while interior
        } //Cierre del while exterior

        System.out.println ("Gracias por utilizar el programa");

    }  }   //Cierre del main y de la clase
