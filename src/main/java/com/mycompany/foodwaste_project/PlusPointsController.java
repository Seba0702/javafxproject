/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.foodwaste_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
/**
 * FXML Controller class
 *
 * @author Sebastian Bendz
 */
public class PlusPointsController implements Initializable {


    @FXML
    private Button closeButton;
    @FXML
    private Label labelTitel;
    @FXML
    private TextArea textAreaMSG;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void closeApp(ActionEvent event) {
    }

}
