/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author svane
 */
public class OutsideController implements Initializable {


    @FXML
    private Button apartment;
    @FXML
    private Button mcDonalds;
    @FXML
    private Button fakta;
    @FXML
    private Button naturmarket;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goApartment(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
    }

    @FXML
    private void goMcDonalds(ActionEvent event) throws IOException {
        App.setRoot("mcDonalds");
    }

    @FXML
    private void goFakta(ActionEvent event) throws IOException {
        App.setRoot("Fakta");
    }

    @FXML
    private void goNaturmarket(ActionEvent event) throws IOException {
        App.setRoot("Naturmarket");
    }

}
