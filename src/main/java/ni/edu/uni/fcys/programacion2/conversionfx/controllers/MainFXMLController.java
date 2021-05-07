/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import ni.edu.uni.fcys.programacion2.conversionfx.App;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class MainFXMLController implements Initializable {
    @FXML
    public Button btnTemperature;
    @FXML
    public Button btnCurrency;
    @FXML
    public VBox vBoxCenter;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnTemperatureAction(){
        try {
            Node parent = App.loadFXML("TemperatureFXML");        
            vBoxCenter.getChildren().clear();
            vBoxCenter.getChildren().add(parent);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void btnCurrencyAction(){
        try {
            Node parent = App.loadFXML("CurrencyFXML");        
            vBoxCenter.getChildren().clear();
            vBoxCenter.getChildren().add(parent);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
