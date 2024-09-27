/*
Nombre: Auky Daniel Rodriguez Sey
Codigo Academico: IN5BV
Carné: 2019473
Fecha De Creacion : 14/04/2023
Fecha De Modificacion:
*/
package org.aukysey.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.aukysey.controller.EmpresaController;
import org.aukysey.controller.MenuPrincipalController;
import org.aukysey.controller.PresupuestoController;
import org.aukysey.controller.ProductosController;
import org.aukysey.controller.ProgramadorController;
import org.aukysey.controller.TipoEmpleadoController;
import org.aukysey.controller.TipoPlatoController;

/**
 *
 * @author informatica
 */
public class Principal extends Application {
    
        private final String PAQUETE_VISTA = "/org/aukysey/view/";
        private Stage escenarioPrincipal;
        private Scene escena;
        
        
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Tony´s Kinal 2023");
        escenarioPrincipal.getIcons().add(new Image("/org/aukysey/image/8.png"));
        
        
        
//        Parent root = FXMLLoader.load(getClass().getResource("/org/aukysey/view/MenuPrincipalView.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("/org/aukysey/view/ProgramadorView.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("/org/aukysey/view/EmpresaView.fxml"));
//
//        Scene escena = new Scene(root);
//        escenarioPrincipal.setScene(escena);
//  
        menuPrincipal();
        escenarioPrincipal.show();
        
        
    }

    
    public void menuPrincipal(){
        
        try{
            MenuPrincipalController menu = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml",590,601);
        menu.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
            
          
    }
}
        public void ventanaProgramador(){
        
        try{
            ProgramadorController programador = (ProgramadorController)cambiarEscena("ProgramadorView.fxml",607,601);
        programador.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
         }   
    }
        
    public void ventanaEmpresa(){
        
        try{
            EmpresaController empresa = (EmpresaController)cambiarEscena("EmpresaView.fxml",700,500);
        empresa.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
            
          
    }
} 
    
    public void ventanaPresupuesto(){
        
        try{
            PresupuestoController presupuesto = (PresupuestoController)cambiarEscena("PresupuestoView.fxml",802,500);
        presupuesto.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
        
        }
    }
        
    public void ventanaProductos(){
        
        try{
            ProductosController productos = (ProductosController)cambiarEscena("ProductosView.fxml",700,500);
        productos.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
            
          
    }
}            

    public void ventanaTipoEmpleado(){
        
        try{
            TipoEmpleadoController tipoEmpleado = (TipoEmpleadoController)cambiarEscena("TipoEmpleadoView.fxml",700,500);
        tipoEmpleado.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
            
          
    }
}   

    public void ventanaTipoPlato(){
        
        try{
            TipoPlatoController tipoPlato = (TipoPlatoController)cambiarEscena("TipoPlatoView.fxml",700,500);
        tipoPlato.setEscenarioPrincipal(this);
          
        }
        catch(Exception e){
        e.printStackTrace();
            
          
    }
}
    
        
    public static void main(String[] args){
        launch(args);
    }
    
    public  Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception{

        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader(); 
        
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable) cargadorFXML.getController();
        
        
        
        
        return resultado;
        
    }
    
    }
