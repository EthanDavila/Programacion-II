/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import ni.edu.uni.fcys.programacion2.conversionfx.controllers.Temperature.TemperatureConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {

    @FXML
    public TextField TxtCelsius;
    @FXML
    public TextField TxtFha;
    @FXML
    public RadioButton rbtnCelsius;
    @FXML
    public ToggleGroup Temperature;
    @FXML
    public RadioButton rbtnFharenheit;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void rbtnCelsiusAction(ActionEvent event) {
        ActivateTxtField();
    }

    @FXML
    public void rbtnFharenheitAction(ActionEvent event) {
        ActivateTxtField();
    }

    @FXML
    public void btnComputeAction(ActionEvent event) {
        float Temp;
        if (rbtnCelsius.isSelected()){
            Temp = Float.parseFloat(TxtCelsius.getText());
            TxtFha.setText(String.valueOf(TemperatureConversion.ConversionF(Temp)));
        }
        else if (rbtnFharenheit.isSelected()){
            Temp = Float.parseFloat(TxtFha.getText());
            TxtCelsius.setText(String.valueOf(TemperatureConversion.ConversionC(Temp)));
        }
    }

    @FXML
    public void btnCleanAction(ActionEvent event) {
        CleanTxtField();
    }

    public void ActivateTxtField(){
        if(rbtnCelsius.isSelected()){
            TxtCelsius.setEditable(true);
            TxtFha.setEditable(false);
            
            TxtCelsius.requestFocus();
        }
        else if(rbtnFharenheit.isSelected()){
            TxtCelsius.setEditable(false);
            TxtFha.setEditable(true);
            
            TxtFha.requestFocus();
        }
        CleanTxtField();
    }

    public void CleanTxtField() {
        TxtCelsius.setText("");
        TxtFha.setText("");
    }
}
