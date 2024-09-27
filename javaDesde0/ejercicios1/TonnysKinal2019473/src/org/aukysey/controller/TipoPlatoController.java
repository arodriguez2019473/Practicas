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
import org.aukysey.bean.TipoPlato;
import org.aukysey.main.Principal;


public class TipoPlatoController implements Initializable{
    
    private enum operaciones{NUEVO,GUARDAR,ELIMINAR,ACTUALIZAR,CANCELAR,NINGUNO}
    private operaciones tipoDeOperacion = operaciones.NINGUNO;
    
    private Principal escenarioPrincipal;
    private ObservableList<TipoPlato>listaTipoPlato;
    
//  tablas para escribir
    
    @FXML private TextField txtCodigoTipoPlato;
    @FXML private TextField txtDescripcionTipoPlato;
    
    @FXML private TableView tblTipoPlatos;
    
    @FXML private TableColumn colCodigoTipoPlato;
    @FXML private TableColumn colDescripcionTipoPlato;
    
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
        
        tblTipoPlatos.setItems(getTipoPlato());
        colCodigoTipoPlato.setCellValueFactory(new PropertyValueFactory<TipoPlato,Integer>("codigoTipoPlato"));
        colDescripcionTipoPlato.setCellValueFactory(new PropertyValueFactory<TipoPlato,Integer>("descripcionTipoPlato"));
        
    }
    
    public ObservableList<TipoPlato> getTipoPlato(){
        
        ArrayList<TipoPlato> lista = new ArrayList<TipoPlato>();
        
        try{
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_ListarTipoPlato");
            ResultSet resultado = procedimiento.executeQuery();
            
            while(resultado.next()){
                
                lista.add(new TipoPlato(resultado.getInt("codigoTipoPlato"),
                        resultado.getString("descripcionTipo")));
            }
            
        }
        
        catch (Exception e) {
                
            e.printStackTrace();
            
        }
    
        return listaTipoPlato = FXCollections.observableArrayList(lista);
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
                
                tipoDeOperacion = operaciones.GUARDAR;
                
                
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
                
                tipoDeOperacion = TipoPlatoController.operaciones.NINGUNO;
                
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
                tipoDeOperacion = TipoPlatoController.operaciones.NINGUNO;
                break;
                
            default:
                
                if(tblTipoPlatos.getSelectionModel().getSelectedItem() !=null){
                    
                    int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el regitro","Eliminar Tipo Plato",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    if(respuesta == JOptionPane.YES_OPTION){
                        
                        
                        try{
                        
                            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_EliminarTipoPlato(?)");
                            procedimiento.setInt(1,((TipoPlato)tblTipoPlatos.getSelectionModel().getSelectedItem()).getCodigoTipoPlato());
                            procedimiento.execute();
                            
                            listaTipoPlato.remove(tblTipoPlatos.getSelectionModel().getSelectedItem());
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
            
            if(tblTipoPlatos.getSelectionModel().getSelectedItem()!= null){
            
                btnNuevo.setDisable(true);
                btnEliminar.setDisable(true);
                
                btnEditar.setText("Actualizar");
                btnReporte.setText("Cancelar");
                
                imgEditar.setImage(new Image("/org/aukysey/image/actualizar.png"));
                imgReporte.setImage(new Image("/org/aukysey/image/eliminar.png"));
                
                activarControles();
                
                tipoDeOperacion = TipoPlatoController.operaciones.ACTUALIZAR;
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
                
                tipoDeOperacion = operaciones.NINGUNO;
                
                
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
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_EditarTipoPlato(?,?)");
            
            TipoPlato registro = (TipoPlato)tblTipoPlatos.getSelectionModel().getSelectedItem();
           
            registro.setDescripciontipo(txtDescripcionTipoPlato.getText());

            procedimiento.setInt(1, registro.getCodigoTipoPlato());
            procedimiento.setString(2, registro.getDescripciontipo());

            procedimiento.execute();
            
        } 
        catch (Exception e) {
        
        }
        
    }

    
    public void guardar(){
        
        TipoPlato registro = new TipoPlato();
        
        registro.setDescripciontipo(txtDescripcionTipoPlato.getText());
        try{
            
             PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_AgregarTipoPlato (?)");
             procedimiento.setString(1, registro.getDescripciontipo());

             
             procedimiento.execute();
         
             listaTipoPlato.add(registro);
             cargarDatos();
             
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    public void seleccionarElemento(){
        
        txtCodigoTipoPlato.setText(String.valueOf(((TipoPlato)tblTipoPlatos.getSelectionModel().getSelectedItem()).getCodigoTipoPlato()));
        txtDescripcionTipoPlato.setText(((TipoPlato)tblTipoPlatos.getSelectionModel().getSelectedItem()).getDescripciontipo());

    }
    
    
    public void desactivarControles(){
        
      txtCodigoTipoPlato.setEditable(false);
      txtDescripcionTipoPlato.setEditable(false);
      
    }
    public void activarControles(){
        
        txtCodigoTipoPlato.setEditable(false);
        txtDescripcionTipoPlato.setEditable(true);
        
    }
    
    public void limpiarControles(){
        
        txtCodigoTipoPlato.clear();
        txtDescripcionTipoPlato.clear();
        
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
