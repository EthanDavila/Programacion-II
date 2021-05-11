/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacion2.depresiacion.controller;

import com.mycompany.programacion2.depresiacion.pojo.Activo;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Sistemas-32
 */
public class DepresiacionFXMLController implements Initializable {

    @FXML
    public TextField TxtNombre;
    @FXML
    public TextField TxtValorActivo;
    @FXML
    public TextField TxtValorSalvamento;
    @FXML
    public ComboBox<String> cmbTipoActivo;
    @FXML
    public Button btnCalcular;
    @FXML
    public TableView<Activo> TblView;
    @FXML
    public TableColumn<Activo, String> TblCNombre;
    @FXML
    public TableColumn<Activo, String> TblC1;
    @FXML
    public TableColumn<Activo, String> TblC2;
    @FXML
    public TableColumn<Activo, String> TblC3;
    @FXML
    public TableColumn<Activo, String> TblC4;
    @FXML
    public TableColumn<Activo, String> TblC5;
    @FXML
    public TableColumn<Activo, String> TblC6;
    @FXML
    public TableColumn<Activo, String> TblC7;
    
    public ObservableList <Activo> Activos;
    
    public ObservableList<String> Items = FXCollections.observableArrayList("Edificio -> 20", "Vehiculo -> 5", "Maquinaria -> 8", "Mobiliario -> 2", "Equipo de Oficina -> 1");

    public static int Columns;
;    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Columns = TblView.getColumns().size();
        cmbTipoActivo.setItems(Items);
        Activos = FXCollections.observableArrayList ();
        TblCNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        TblView.setItems(Activos);
    }    

    @FXML
    public void btnCalcularAction(ActionEvent event) {
//        String Nombre, Tipo;
//        float ValorA, ValorS;
//        
//        Nombre = TxtNombre.getText();
//        ValorA = Float.parseFloat(TxtValorActivo.getText());
//        Tipo = cmbTipoActivo.getValue();
//        ValorS = Float.parseFloat(TxtValorSalvamento.getText());
//        
//        Activo A = new Activo(Nombre, ValorA, Tipo, ValorS);
//        Activos.add(A);

        switch(cmbTipoActivo.getValue().toString()){
            case "Edificio -> 20":
                
            case "Vehiculo -> 5":
                
            case "Maquinaria -> 8":
                
            case "Mobiliario -> 2":
                
            case "Equipo de Oficina -> 1":
                
        }
    }
}