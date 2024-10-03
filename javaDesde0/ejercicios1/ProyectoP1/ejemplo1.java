import javax.swing.JOptionPane; 
public class ejemplo1 { 
    public static void main (String[] Args) { 
    
    String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un número:" ); 
    int a = Integer.parseInt(entradaUsuario);
    JOptionPane.showMessageDialog(null,"El doble del número introducido es: " + a*2); 
 
 } 
} 
