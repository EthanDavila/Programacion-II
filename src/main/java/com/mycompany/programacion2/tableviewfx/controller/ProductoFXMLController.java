/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacion2.tableviewfx.controller;

import com.mycompany.programacion2.tableviewfx.pojo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Sistemas-32
 */
public class ProductoFXMLController implements Initializable {

    @FXML
    public TextField TxtNombre;
    @FXML
    public TextField TxtDescripcion;
    @FXML
    public Spinner<Integer> SpnCantidad;
    @FXML
    public TextField TxtPrecio;
    @FXML
    public TextField TxtImagen;
    @FXML
    public Button btnAgregar;
    @FXML
    public Button btnEliminar;
    @FXML
    public TableView<Producto> TblViewProductos;
    @FXML
    public TableColumn<Producto, String> TblCId;
    @FXML
    public TableColumn<Producto, String> TblCNombre;
    @FXML
    public TableColumn<Producto, String> TblCDescripcion;
    @FXML
    public TableColumn<Producto, String> TblCCantidad;
    @FXML
    public TableColumn<Producto, String> TblCPrecio;
    
    private ObservableList<Producto> Productos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Productos = FXCollections.observableArrayList();
        Productos.add(new Producto(1, "Coca Cola", "Producto refrescante e hidratante de Coca-Cola's Company", 10, 13.5f, ""));
        TblCId.setCellValueFactory(new PropertyValueFactory<>("id"));
        TblCNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TblCDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        TblCCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        TblCPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        SpnCantidad.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100));
        
        TblViewProductos.setItems(Productos);
    }    

    @FXML
    public void btnAgregarAction(ActionEvent event) {
        String Nombre = TxtNombre.getText();
        String Descripcion = TxtDescripcion.getText();
        int Cantidad = Integer.parseInt(SpnCantidad.getValue().toString());
        float Precio = Float.parseFloat(TxtPrecio.getText());
        String Imagen = TxtImagen.getText();
        int id = 0;
        Producto last = Productos.get(Productos.size() - 1);
        if (last == null){
            id = 1;
        }
        Producto p = new Producto(last.getId() + 1, Nombre, Descripcion, Cantidad, Precio, Imagen);
        Productos.add(p);
   }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
        
    }
}
