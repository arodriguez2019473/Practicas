import java.util.ArrayList; import java.util.Random; 
        //Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se definan
public class SerieDeAleatorios {

    //Campos de la clase
    private ArrayList<Integer> serieAleatoria;
    
    //Constructor
    public SerieDeAleatorios (int numeroItems) {

        serieAleatoria = new ArrayList<Integer> ();
        //Inicializamos el ArrayList lleno de ceros
        for (int i=0; i<numeroItems; i++) { serieAleatoria.add(0); }
        System.out.println ("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems() );

    } //Cierre del constructor

    public int getNumeroItems() { return serieAleatoria.size(); } //Cierre del método

    public void generarSerieDeAleatorios () {

        Random numAleatorio;
        numAleatorio = new Random ();
        
        for (int i=0; i < serieAleatoria.size(); i++) {
        serieAleatoria.set(i, numAleatorio.nextInt(1000) );
         }

        System.out.print ("Serie generada! ");

    } //Cierre del método

 

    public void mostrarSerie() {

        System.out.print ("Procedemos a mostrar la serie: ");

        for (Integer tmpObjeto :  serieAleatoria) {  //Uso de for each
            System.out.print ("   " + tmpObjeto.toString() );   } //Cierre del for extendido

    } //Cierre del método

} //Cierre de la clase
