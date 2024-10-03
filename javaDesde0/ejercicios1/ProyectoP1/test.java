import java.util.Scanner;
import java.util.ArrayList;

public class test{
    
    private ListaCantantesFamosos addFamosos;
    private String validar;
    
        public static void main (String [] args){
           
            int a = 1;  
            String validar = "";
            Scanner entradadScanner = new Scanner(System.in);
            
            do{
                
                System.out.println("Empezamos el programa");      

                System.out.println("Nombre: ");
                EntradaFamosos famoso = new EntradaFamosos();
                
                System.out.println("Disco con mas ventas: ");
                EntradaFamosos dicos = new EntradaFamosos();
                
                System.out.println("la lista actualizada de los datos son");
                
                ListaCantantesFamosos lista1 = new ListaCantantesFamosos("nombres introducidos por usuario");
                ListaDiscos lista2 = new ListaDiscos("discos introducidos por el usuario");
                
                lista1.addFamosos(famoso.getEntrada());
                lista2.addDico(dicos.getEntrada());
                

                for (int i = 0; i<lista1.getTamaño()-1; i++){
                               
                    System.out.println("Nombre: " + lista1.getNombre(1-i));
                    System.out.println("Disco con mas ventas:" + lista2.getDico(1-i));
                     
                }
                
                System.out.println("Deseas Ingresar otro dato: ");   
                System.out.println("1) si    2) no");
                                
                validar = entradadScanner.nextLine();
                
            }
            while(!validar.equals("no") && !validar.equals("No"));

            System.out.println("hola si saliste");
            
                
        }
}
