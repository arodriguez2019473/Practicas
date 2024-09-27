package org.aukysey.controller;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;

import org.aukysey.bean.Empresa;
import org.aukysey.db.Conexion;
import org.aukysey.main.Principal;
import org.aukysey.report.GeneralReporte;


public class EmpresaController implements Initializable{
    
    private enum operaciones{NUEVO, GUARDAR, ELIMINAR, ACTUALIZAR, CANCELAR, NINGUNO};
    private operaciones tipoDeOperacion = operaciones.NINGUNO;
    
    
    private Principal escenarioPrincipal;
    private ObservableList<Empresa>listaEmpresa;
    
    @FXML private TextField txtCodigoEmpresa;
    @FXML private TextField txtNombreEmpresa;
    @FXML private TextField txtDireccionEmpresa;
    @FXML private TextField txtTelefonoEmpresa;
    
    @FXML private TableView tblEmpresas;
    
    @FXML private TableColumn colCodigoEmpresa;
    @FXML private TableColumn colNombreEmpresa;
    @FXML private TableColumn colDireccionEmpresa;
    @FXML private TableColumn colTelefonoEmpresa;
    
    @FXML private Button btnNuevo;
    @FXML private Button btnEditar;
    @FXML private Button btnEliminar;
    @FXML private Button btnReporte;
    
//    @FXML private Button btnRegresar;
    
    @FXML private ImageView imgNuevo;
    @FXML private ImageView imgEditar;
    @FXML private ImageView imgEliminar;
    @FXML private ImageView imgReporte;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        cargarDatos();
        
    }
    
    public void cargarDatos(){
        
        tblEmpresas.setItems(getEmpresa());
        colCodigoEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa,Integer>("codigoEmpresa"));
        colNombreEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa,Integer>("nombreEmpresa"));
        colDireccionEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa,Integer>("direccion"));
        colTelefonoEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa,Integer>("Telefono"));
        
    }
    
    public ObservableList<Empresa> getEmpresa(){
        
        ArrayList<Empresa> lista = new ArrayList<Empresa>();
        
        try{
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_ListarEmpresas");
            ResultSet resultado = procedimiento.executeQuery();
            
            while(resultado.next()){
                
                lista.add(new Empresa(resultado.getInt("codigoEmpresa"),
                        
                        resultado.getString("nombreEmpresa"),
                        resultado.getString("direccion"),
                        resultado.getString("telefono")));
                
            }
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        return listaEmpresa = FXCollections.observableArrayList(lista);
    }
    
    public void nuevo(){
        
        switch(tipoDeOperacion){
            case NINGUNO:
                
                activarControles();
                limpiarControles();
                
                btnNuevo.setText("Guardar");
                btnEliminar.setText("Cancelar");
                
                btnEditar.setDisable(true);
                btnReporte.setDisable(true);
//                btnRegresar.setDisable(true);
                
                imgNuevo.setImage(new Image("/org/aukysey/image/guardar.png"));
                imgEliminar.setImage(new Image("/org/aukysey/image/cancelar.png"));
                
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
                
                tipoDeOperacion = operaciones.NINGUNO;
                
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
                tipoDeOperacion = operaciones.NINGUNO;
                break;
                
            default:
                
                if(tblEmpresas.getSelectionModel().getSelectedItem() !=null){
                    
                    int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el regitro","Eliminar Empresa",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    
                    if(respuesta == JOptionPane.YES_OPTION){
                        
                        
                        try{
                        
                            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_EliminarEmpresas(?)");
                            procedimiento.setInt(1,((Empresa)tblEmpresas.getSelectionModel().getSelectedItem()).getCodigoEmpresa());
                            procedimiento.execute();
                            
                            listaEmpresa.remove(tblEmpresas.getSelectionModel().getSelectedItem());
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
            
            if(tblEmpresas.getSelectionModel().getSelectedItem()!= null){
            
                btnNuevo.setDisable(true);
                btnEliminar.setDisable(true);
                
                btnEditar.setText("Actualizar");
                btnReporte.setText("Cancelar");
                
                imgEditar.setImage(new Image("/org/aukysey/image/actualizar.png"));
                imgReporte.setImage(new Image("/org/aukysey/image/eliminar.png"));
                
                activarControles();
                
                tipoDeOperacion = operaciones.ACTUALIZAR;
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
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_EditarEmpresa(?,?,?,?)");
            
            Empresa registro = (Empresa)tblEmpresas.getSelectionModel().getSelectedItem();
           
            registro.setNombreEmpresa(txtNombreEmpresa.getText());
            registro.setDireccion(txtDireccionEmpresa.getText());
            registro.setTelefono(txtTelefonoEmpresa.getText());
        
            procedimiento.setInt(1, registro.getCodigoEmpresa());
            procedimiento.setString(2, registro.getNombreEmpresa());
            procedimiento.setString(3, registro.getDireccion());
            procedimiento.setString(4, registro.getTelefono());
            
            procedimiento.execute();
            
        } 
        catch (Exception e) {
        
        }
        
    }
    
    public void guardar(){
        
        Empresa registro = new Empresa();
//        registro.setCodigoEmpresa(Integer.parseInt(txtCodigoEmpresa.getText()));
        registro.setNombreEmpresa(txtNombreEmpresa.getText());
        registro.setDireccion(txtDireccionEmpresa.getText());
        registro.setTelefono(txtTelefonoEmpresa.getText());
        
        try{
            
             PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_AgregarEmpresa (?,?,?)");
             procedimiento.setString(1, registro.getNombreEmpresa());
             procedimiento.setString(2, registro.getDireccion());
             procedimiento.setString(3, registro.getTelefono());
             
             procedimiento.execute();
         
             listaEmpresa.add(registro);
             cargarDatos();
             
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void seleccionarElemento(){
        
        txtCodigoEmpresa.setText(String.valueOf(((Empresa)tblEmpresas.getSelectionModel().getSelectedItem()).getCodigoEmpresa()));
        txtNombreEmpresa.setText(((Empresa)tblEmpresas.getSelectionModel().getSelectedItem()).getNombreEmpresa());
        txtDireccionEmpresa.setText(((Empresa)tblEmpresas.getSelectionModel().getSelectedItem()).getDireccion());
        txtTelefonoEmpresa.setText(((Empresa)tblEmpresas.getSelectionModel().getSelectedItem()).getTelefono());
    
    }
    
    public void generarReporte(){
        
        switch(tipoDeOperacion){
            
            case NINGUNO:
                
                imprimirReporte();
                        
                        break;
            
            case ACTUALIZAR:
                
                break;
                        
        }    
    }
    
    public void imprimirReporte(){
        Map parametros = new HashMap();
        parametros.put("codigoEmpresa", null);
        GeneralReporte.mostrarReporte("ReporteEmpresas.jasper", "Reporte de Empresas", parametros);
        
    }
    
    public void desactivarControles(){
        
      txtCodigoEmpresa.setEditable(false);
      txtCodigoEmpresa.setEditable(false);
      txtTelefonoEmpresa.setEditable(false);
      txtDireccionEmpresa.setEditable(false);
      
    }
    public void activarControles(){
        
        txtCodigoEmpresa.setEditable(false);
        txtNombreEmpresa.setEditable(true);
        txtDireccionEmpresa.setEditable(true);
        txtTelefonoEmpresa.setEditable(true);
        
    }
    
    public void limpiarControles(){
        
        txtCodigoEmpresa.clear();
        txtNombreEmpresa.clear();
        txtDireccionEmpresa.clear();
        txtTelefonoEmpresa.clear();
        
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

    public void ventanaPresupuesto(){
        escenarioPrincipal.ventanaPresupuesto();
    }
}