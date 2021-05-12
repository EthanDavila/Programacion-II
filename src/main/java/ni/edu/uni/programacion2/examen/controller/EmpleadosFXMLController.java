/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.examen.controller;

import static ni.edu.uni.programacion2.examen.controller.Salario.Salarios.*;
import ni.edu.uni.programacion2.examen.pojo.Empleado;
import ni.edu.uni.programacion2.examen.pojo.EmpleadoTable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Sistemas-32
 */
public class EmpleadosFXMLController implements Initializable {
    
    @FXML
    public TextField TxtNombre;
    @FXML
    public TextField TxtApellidos;
    @FXML
    public TextField TxtCedula;
    @FXML
    public TextField TxtSalario;
    @FXML
    public TextField TxtFechaContra;
    @FXML
    public Button btnAgregar;
    @FXML
    public Button btnEliminar;
    @FXML
    public TableView<EmpleadoTable> TblEmpleadso;
    @FXML
    public TableColumn<EmpleadoTable, String> TblCDatos;
    @FXML
    public TableColumn<EmpleadoTable, String> TblCINSS;
    @FXML
    public TableColumn<EmpleadoTable, String> TblCIR;
    @FXML
    public TableColumn<EmpleadoTable, String> TblCAntiguedad;
    @FXML
    public TableColumn<EmpleadoTable, String> TblCSalarioNeto;
    
    private ObservableList<Empleado> Empleados;
    private ObservableList<EmpleadoTable> EmpleadosTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Empleados = FXCollections.observableArrayList();
        EmpleadosTable = FXCollections.observableArrayList();
        TblCDatos.setCellValueFactory(new PropertyValueFactory("DatosEmpleado"));
        TblCINSS.setCellValueFactory(new PropertyValueFactory("INSS"));
        TblCIR.setCellValueFactory(new PropertyValueFactory("IR"));
        TblCAntiguedad.setCellValueFactory(new PropertyValueFactory("Antiguedad"));
        TblCSalarioNeto.setCellValueFactory(new PropertyValueFactory("Salario_Neto"));
        
        TblEmpleadso.setItems(EmpleadosTable);
    }    
    
    @FXML
    public void btnAgregarAction(ActionEvent event) {
        String Nombre = TxtNombre.getText();
        String Apellidos = TxtApellidos.getText();
        String Cedula = TxtCedula.getText();
        float Salario = Float.parseFloat(TxtSalario.getText());
        int FechaContra = Integer.parseInt(TxtFechaContra.getText());
        
        Empleado E = new Empleado(Nombre, Apellidos, Cedula, Salario, FechaContra);
        Empleados.add(E);
        
        EmpleadoTable ET = new EmpleadoTable(Nombre, CalcularINSS(Salario), CalcularIR(Salario), CalcularAntiguedad(FechaContra), CalcularSalarioNeto(Salario));
        EmpleadosTable.add(ET);
    }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
        EmpleadoTable selectedItem = TblEmpleadso.getSelectionModel().getSelectedItem();
        TblEmpleadso.getItems().remove(selectedItem);
    }
}
