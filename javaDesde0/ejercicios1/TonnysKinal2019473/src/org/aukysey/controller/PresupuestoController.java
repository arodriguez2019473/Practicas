package org.aukysey.controller;

import eu.schudt.javafx.controls.calendar.DatePicker;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import org.aukysey.bean.Empresa;
import org.aukysey.bean.Presupuesto;
import org.aukysey.db.Conexion;
import org.aukysey.main.Principal;
import org.aukysey.report.GeneralReporte;

public class PresupuestoController implements Initializable{
    private Principal escenarioPrincipal;
    
    
    private enum operaciones {GUARDAR,ELIMINAR,ACTUALIZAR,NINGUNO};
    private operaciones tipoDeOperacion = operaciones.NINGUNO;
    
    private ObservableList<Presupuesto> listaPresupuesto;
    private ObservableList<Empresa> listaEmpresa;
    
    private DatePicker fecha;
    
    @FXML private TextField txtCodigoPresupuesto;
    @FXML private TextField txtCantidadPresupuesto;
    
    @FXML private GridPane grpFecha;
    
    @FXML private ComboBox cmbCodigoEmpresa;
    
    @FXML private TableView tblPresupuestos;
    
    @FXML private TableColumn colCodigoPresupuesto;
    @FXML private TableColumn colCodigoEmpresa;
    @FXML private TableColumn colFechaSolicitud;
    @FXML private TableColumn colCantidadPresupuesto;
    
    @FXML private Button btnNuevo;
    @FXML private Button btnEliminar;
    @FXML private Button btnReporte;
    @FXML private Button btnEditar;
    
    @FXML private ImageView imgNuevo;
    @FXML private ImageView imgEliminar;
    @FXML private ImageView imgReporte;
    @FXML private ImageView imgEditar;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        cargarDatos();
        
        fecha = new DatePicker(Locale.ENGLISH);
        fecha.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        fecha.getCalendarView().todayButtonTextProperty().set("Today");
        fecha.getCalendarView().setShowWeeks(true);
        
        fecha.getStylesheets().add("/org/aukysey/resource/TonysKinal.css");
        
        grpFecha.add(fecha, 3, 0);
        cmbCodigoEmpresa.setItems(getEmpresa());
        
    }

    public void cargarDatos(){
        
        tblPresupuestos.setItems(getPresupuesto());
      
        colCodigoPresupuesto.setCellValueFactory(new PropertyValueFactory<Presupuesto,Integer>("codigoPresupuesto"));
        colFechaSolicitud.setCellValueFactory(new PropertyValueFactory<Presupuesto,Date>("fechaSolicitud"));
        colCantidadPresupuesto.setCellValueFactory(new PropertyValueFactory<Presupuesto,Integer>("cantidadPresupuesto"));
        colCodigoEmpresa.setCellValueFactory(new PropertyValueFactory<Presupuesto,Integer>("codigoEmpresa"));
        
    }
    
//     __________________________________________________________________________________________________________________________________    
    
        public ObservableList<Presupuesto>getPresupuesto(){
        
        ArrayList<Presupuesto>lista = new ArrayList<Presupuesto>();
        try {
          
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_ListarPresupuestos");
            ResultSet resultado = procedimiento.executeQuery();
            
            while(resultado.next()){
                
                lista.add(new Presupuesto(resultado.getInt("codigoPresupuesto"),
                        resultado.getDate("fechaSolicitud"),
                        resultado.getDouble("cantidadPresupuesto"),
                        resultado.getInt("codigoEmpresa")));
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaPresupuesto = FXCollections.observableArrayList(lista);
    }
        
//      __________________________________________________________________________________________________________________________________
        
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

// __________________________________________________________________________________________________________________________________
            
    public Empresa buscarEmpresa(int codigoEmpresa){
        
        Empresa resultado = null;
        
        try {
            
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_BuscarEmpresas(?)");
            procedimiento.setInt(1, codigoEmpresa);
            ResultSet registro = procedimiento.executeQuery();
            while(registro.next()){
                
                resultado = new Empresa(registro.getInt("codigoEmpresa"),
                                        registro.getString("nombreEmpresa"),
                                        registro.getString("direccion"),
                                        registro.getString("telefono"));
            
            }
            
            
        } 
        
        catch (Exception e) {
                e.printStackTrace();
            
            
        }
        
        return resultado;
    }        


    



// __________________________________________________________________________________________________________________________________

    
    
    
    public void nuevo(){
        switch(tipoDeOperacion){
         
            case NINGUNO:
                
                activarControles();
                limpiarControles();
            
                btnNuevo.setText("Guardar");
                btnEliminar.setText("Cancelar");
                
                btnEditar.setDisable(true);
                btnReporte.setDisable(true);
                
                imgNuevo.setImage(new Image("/org/aukysey/image/guardar.png"));
                imgEliminar.setImage(new Image("/org/aukysey/image/cancelar.png"));
                
                tipoDeOperacion = PresupuestoController.operaciones.GUARDAR;
                
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
                
                tipoDeOperacion = PresupuestoController.operaciones.NINGUNO;
                break;
        }
    }
    
    
    

    
    


    
    public void actualizar(){
        
        try {
        
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("call sp_EditarPresupuesto (?,?,?,?)");
            
            Presupuesto registro = (Presupuesto)tblPresupuestos.getSelectionModel().getSelectedItem();
            
            registro.setFechaSolicitud(fecha.getSelectedDate());
            registro.setCantidadPresupuesto(Double.parseDouble(txtCantidadPresupuesto.getText()));
            registro.setCodigoEmpresa(((Empresa)cmbCodigoEmpresa.getSelectionModel().getSelectedItem()).getCodigoEmpresa());
            
            procedimiento.setInt(1, registro.getCodigoPresupuesto());
            procedimiento.setDate(2, new java.sql.Date(registro.getFechaSolicitud().getTime()));
            procedimiento.setDouble(3, registro.getCantidadPresupuesto());
            procedimiento.setInt(4, registro.getCodigoEmpresa());
            procedimiento.execute();
        
        } 
        catch (Exception e) {
        
            e.printStackTrace();
            
        }
    }
    
        public void guardar(){
        
        Presupuesto registro = new Presupuesto();
        
//        registro.setCodigoPresupuesto(Integer.parseInt(txtCodigoPresupuesto.getText()));
        registro.setFechaSolicitud(fecha.getSelectedDate());
        registro.setCantidadPresupuesto(Double.parseDouble(txtCantidadPresupuesto.getText()));
        registro.setCodigoEmpresa(((Empresa)cmbCodigoEmpresa.getSelectionModel().getSelectedItem()).getCodigoEmpresa());
        
        try {
            PreparedStatement procedimiento = Conexion.getInstance().getConexion().prepareCall("Call sp_AgregarPresupuesto(?,?,?)");
            
//            procedimiento.setInt(1, registro.getCodigoPresupuesto());
            procedimiento.setDate(1, new java.sql.Date(registro.getFechaSolicitud().getTime()));
            procedimiento.setDouble(2, registro.getCantidadPresupuesto());
            procedimiento.setInt(3, registro.getCodigoEmpresa());
            
            procedimiento.execute();
            listaPresupuesto.add(registro);
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    public void SeleccionarElemento(){
        
        txtCodigoPresupuesto.setText(String.valueOf(((Presupuesto)tblPresupuestos.getSelectionModel().getSelectedItem()).getCodigoPresupuesto()));
        fecha.selectedDateProperty().set(((Presupuesto)tblPresupuestos.getSelectionModel().getSelectedItem()).getFechaSolicitud());
        txtCantidadPresupuesto.setText(String.valueOf(((Presupuesto)tblPresupuestos.getSelectionModel().getSelectedItem()).getCantidadPresupuesto()));
        cmbCodigoEmpresa.getSelectionModel().select(buscarEmpresa(((Presupuesto)tblPresupuestos.getSelectionModel().getSelectedItem()).getCodigoEmpresa()));
        
    }
    
    public void desactivarControles(){
     
        txtCodigoPresupuesto.setEditable(false);
//        grpFecha.setEditable(false);
        txtCantidadPresupuesto.setEditable(false);
        cmbCodigoEmpresa.setEditable(false);
        
        
    }
    
    
    public void activarControles(){
    
        txtCodigoPresupuesto.setEditable(false);
//        grpFecha.setEditable(false);
        txtCantidadPresupuesto.setEditable(true);
        cmbCodigoEmpresa.setEditable(true);
        
    }
    
    public void limpiarControles(){
        
        txtCodigoPresupuesto.clear();
//        grpFecha.clear();
        txtCantidadPresupuesto.clear();
//        cmbCodigoEmpresa.clear();3
        
    }
    
    public void generarReporte(){
    
        switch(tipoDeOperacion){
            
            case NINGUNO:
                
                imprimirReporte();
            
                break;
        }
    
    }
    
    public void imprimirReporte(){
        
        Map parametros = new HashMap();
        int codEmpresa = Integer.valueOf(((Empresa)cmbCodigoEmpresa.getSelectionModel().getSelectedItem()).getCodigoEmpresa());
        parametros.put("codEmpresa", codEmpresa);
        GeneralReporte.mostrarReporte("ReportePresupuesto.jasper", "Reporte de Presupuesto", parametros);
        
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal EscenarioPrincipal) {
        this.escenarioPrincipal = EscenarioPrincipal;
    }

    public void menuPrincipal(){
        escenarioPrincipal.menuPrincipal();
    }

    
}

    

