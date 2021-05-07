/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import ni.edu.uni.fcys.programacion2.conversionfx.controllers.Currency.CurrencyControllers;

/**
 * FXML Controller class
 *
 * @author Sistemas-32
 */
public class CurrencyFXMLController implements Initializable {

    @FXML
    private ComboBox<String> cmbCambios;
    @FXML
    private TextField TxtValor;
    @FXML
    private TextField TxtResultado;
    @FXML
    private Button btnConvertir;
    
    ObservableList<String> Items = Items = FXCollections.observableArrayList("Cordoba -> Dolar", "Cordoba -> Euro", "Dolar -> Cordoba", "Dolar -> Euro", "Euro -> Cordoba", "Euro -> Dolares");;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbCambios.setItems(Items);
    }    

    @FXML
    private void btnConvertirAction(ActionEvent event) {
        float f = 0;
        switch(cmbCambios.getValue().toString()){
            case "Cordoba -> Dolar":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionCaD(f)));
                break;
            case "Cordoba -> Euro":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionCaE(f)));
                break;
            case "Dolar -> Cordoba":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionDaC(f)));
                break;
            case "Dolar -> Euro":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionDaE(f)));
                break;
            case "Euro -> Cordoba":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionEaC(f)));
                break;
            case "Euro -> Dolar":
                f = Float.parseFloat(TxtValor.getText());
                TxtResultado.setText(String.valueOf(CurrencyControllers.ConversionDaC(f)));
                break;
        }
    }
}
