package org.aukysey.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.aukysey.db.Conexion;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;
import org.aukysey.bean.TipoEmpleado;
import java.util.ResourceBundle;
import org.aukysey.main.Principal;



public class TipoEmpleadoController implements Initializable{
    
 private enum operaciones{NUEVO,GUARDAR,ELIMINAR,ACTUALIZAR,CANCELAR,NINGUNO}
    private operaciones tipoDeOperacion = operaciones.NINGUNO;
    
    private Principal escenarioPrincipal;
    private ObservableList<TipoEmpleado>listaTipoEmpleado;
    
//  tablas para escribir
    
    @FXML private TextField txtCodigoTipoEmpleado;
    @FXML private TextField txtDescripcionTipoEmpleado;
    
    @FXML private TableView tblTipoEmpleados;
    
    @FXML private TableColumn colCodigoTipoEmpleado;
    @FXML private TableColumn colDescripcionTipoEmpleado;
    
    @FXML private Button btnNuevo;
    @FXML private Button btnEditar;
    @FXML private Button btnEliminar;
    @FXML private Button btnReporte;
    
    @FXML private ImageView imgNuevo;
    @FXML private ImageView imgEditar;
    @FXML private ImageView imgEliminar;
    @FXML private ImageView imgReporte;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    cargarDatos();
   
    }

    public void cargarDatos(){
        
        tblTipoEmpleados.setItems(getTipoEmpleado());
        colCodigoTipoEmpleado.setCellValueFactory(new PropertyValueFactory<TipoEmpleado,Integer>("codigoTipoEmpleado"));
        colDescripcionTipoEmpleado.setCellValueFactory(new PropertyValueFactory<TipoEmpleado,Integer>("descripcion"));
        
    }
    
    public ObservableList<TipoEmpleado> getTipoEmpleado(){
        
        ArrayList<TipoEmpleado> lista = new ArrayList<TipoEmpleado>();
        
        try{
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_ListarTipoEmpleado");
            ResultSet resultado = procedimiento.executeQuery();
            
            while(resultado.next()){
                
                lista.add(new TipoEmpleado(resultado.getInt("codigoTipoEmpleado"),
                
                        resultado.getString("descripcion")));
            }
            
        }
        
        catch (Exception e) {
                
            e.printStackTrace();
            
        }
    
        return listaTipoEmpleado = FXCollections.observableArrayList(lista);
    }        
    
    public void nuevo(){
    
        switch(tipoDeOperacion){
            
            case NINGUNO:
                
                activarControles();
                
                
                btnNuevo.setText("Guardar");
                btnEliminar.setText("Cancelar");
                
                btnEditar.setDisable(true);
                btnReporte.setDisable(true);
                
                imgNuevo.setImage(new Image("/org/aukysey/image/guardar.png"));
                imgNuevo.setImage(new Image("/org/aukysey/image/guardar.png"));
                
                tipoDeOperacion = TipoEmpleadoController.operaciones.GUARDAR;
                
                
            break;
            
            
            case GUARDAR:
                
                guardar();
                
                limpiarControles();
                desactivarControles();
                
                btnNuevo.setText("Nuevo");
                btnEliminar.setText("Eliminar");
                
                btnEditar.setDisable(false);
                btnReporte.setDisable(false);
                
                imgNuevo.setImage(new Image("/org/aukysey/image/nuevo.png"));
                imgEliminar.setImage(new Image("/org/aukysey/image/eliminar2.png"));
                
                tipoDeOperacion = TipoEmpleadoController.operaciones.NINGUNO;
                
                break;
        }
        
    }
    
 
    public void eliminar(){
        
        switch(tipoDeOperacion){
        
            case GUARDAR:
            
                limpiarControles();
                desactivarControles();
                
                btnEliminar.setText("Eliminar");
                btnEditar.setDisable(false);
                btnReporte.setDisable(false);
        
                imgNuevo.setImage(new Image("/org/aukysey/image/nuevo.png"));
                imgEliminar.setImage(new Image("/org/aukysey/image/eliminar2.png"));
                tipoDeOperacion = TipoEmpleadoController.operaciones.NINGUNO;
                break;
                
            default:
                
                if(tblTipoEmpleados.getSelectionModel().getSelectedItem() !=null){
                    
                    int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el regitro","Eliminar Tipo Empleado",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    if(respuesta == JOptionPane.YES_OPTION){
                        
                        
                        try{
                        
                            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_EliminarTipoEmpleado(?)");
                            procedimiento.setInt(1,((TipoEmpleado)tblTipoEmpleados.getSelectionModel().getSelectedItem()).getCodigoTipoEmpleado());
                            procedimiento.execute();
                            
                            listaTipoEmpleado.remove(tblTipoEmpleados.getSelectionModel().getSelectedItem());
                            limpiarControles();
                            cargarDatos();
                        }
                        catch(Exception e){
                            e.printStackTrace();
                            
                        }
                        
                    }
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento");
                }
               
        }
    }
        
        public void editar(){

        switch(tipoDeOperacion){
            
            case NINGUNO:
            
            if(tblTipoEmpleados.getSelectionModel().getSelectedItem()!= null){
            
                btnNuevo.setDisable(true);
                btnEliminar.setDisable(true);
                
                btnEditar.setText("Actualizar");
                btnReporte.setText("Cancelar");
                
                imgEditar.setImage(new Image("/org/aukysey/image/actualizar.png"));
                imgReporte.setImage(new Image("/org/aukysey/image/eliminar.png"));
                
                activarControles();
                
                tipoDeOperacion = TipoEmpleadoController.operaciones.ACTUALIZAR;
            }
            
            else{
            
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un elemento");
              
            }
            
                break;
        
            case ACTUALIZAR:
                
                actualizar();
        
                limpiarControles();
                desactivarControles();
                
                btnNuevo.setDisable(false);
                btnEliminar.setDisable(false);
                
                btnEditar.setText("Editar");
                btnReporte.setText("Reporte");
                
                imgEditar.setImage(new Image("/org/aukysey/image/editar1.png"));
                imgReporte.setImage(new Image("/org/aukysey/image/report.png"));
                
                cargarDatos();
                
                tipoDeOperacion = TipoEmpleadoController.operaciones.NINGUNO;
                
                
            break;
        }
        
    }
    
    public void reporte(){
       
        switch(tipoDeOperacion){
           
            case ACTUALIZAR:
                
                actualizar();
                limpiarControles();
                desactivarControles();
                
                btnNuevo.setDisable(false);
                btnEliminar.setDisable(false);
                
                btnEditar.setText("Editar");
                btnReporte.setText("Reporte");
                
                imgEditar.setImage(new Image("org/aukysey/image/editar1.png"));
                imgReporte.setImage(new Image("org/aukysey/image/report.png"));
           
       }
    }

        public void actualizar(){
        
        try {
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_EditarTipoEmpleado(?,?)");
            
            TipoEmpleado registro = (TipoEmpleado)tblTipoEmpleados.getSelectionModel().getSelectedItem();
           
            registro.setDescripcion(txtDescripcionTipoEmpleado.getText());

            procedimiento.setInt(1, registro.getCodigoTipoEmpleado());
            procedimiento.setString(2, registro.getDescripcion());

            procedimiento.execute();
            
        } 
        catch (Exception e) {
        
        }
        
    }

    
    public void guardar(){
        
        TipoEmpleado registro = new TipoEmpleado();
        
        registro.setDescripcion(txtDescripcionTipoEmpleado.getText());
        try{
            
             PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_AgregarTipoEmpleado (?)");
//             registro.setCodigoTipoEmpleado(Integer.parseInt(txtCodigoTipoEmpleado.getText()));
             procedimiento.setString(1, registro.getDescripcion());

             
               procedimiento.execute();
         
             listaTipoEmpleado.add(registro);
             cargarDatos();
             
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    public void seleccionarElemento(){
        
        txtCodigoTipoEmpleado.setText(String.valueOf(((TipoEmpleado)tblTipoEmpleados.getSelectionModel().getSelectedItem()).getCodigoTipoEmpleado()));
        txtDescripcionTipoEmpleado.setText(((TipoEmpleado)tblTipoEmpleados.getSelectionModel().getSelectedItem()).getDescripcion());

    }
    
    
    public void desactivarControles(){
        
      txtCodigoTipoEmpleado.setEditable(false);
      txtDescripcionTipoEmpleado.setEditable(false);
      
    }
    public void activarControles(){
        
        txtCodigoTipoEmpleado.setEditable(false);
        txtDescripcionTipoEmpleado.setEditable(true);
        
    }
    
    public void limpiarControles(){
        
        txtCodigoTipoEmpleado.clear();
        txtDescripcionTipoEmpleado.clear();
        
    }
    
    
    

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void menuPrincipal(){
        escenarioPrincipal.menuPrincipal();
    }
}

