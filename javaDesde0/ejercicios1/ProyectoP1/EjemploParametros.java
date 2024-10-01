public class EjemploParametros{
    
    
    private String ejemplo1;
    private int ejemplo2;
    private double ejemplo3;
    private String ejemplo4;
    
    // al momento lo que hacemos aca es que pedimos los datos de cada uno como una variable local
    // que le dara el valor a las variables globales que fueron pedidas y al finalizar este
    // constructor se borran las variables locales para no tener espacio en la memoria que no es utilizada
    public EjemploParametros(int valorEjemplo2,double valorEjemplo3,String valorEjemplo4){
   
        ejemplo1 = "hol";
        ejemplo2 = valorEjemplo2;
        ejemplo3 = valorEjemplo3;
        ejemplo4 = valorEjemplo4;
    
    }
    
    // con esto obtengo los datos de ejemplo 2 
    public int getEjemplo2(){return ejemplo2;}
    // con esto obtengo los datos de ejemplo 3     
    public double getEjemplo3(){return ejemplo3;}
    // con esto obtengo los datos de ejemplo 4     
    public String getEjemplo4(){return ejemplo4;}
    
}
