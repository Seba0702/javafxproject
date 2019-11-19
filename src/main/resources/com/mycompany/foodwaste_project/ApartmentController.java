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
public class ApartmentController implements Initializable {


    @FXML
    private Button outside;
    @FXML
    private Button kitchen;
    @FXML
    private Button livingroom;
    @FXML
    private Button bedroom;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goOutside(ActionEvent event) throws IOException {
        App.setRoot("Outside");
    }

    @FXML
    private void goKitchen(ActionEvent event) throws IOException {
        App.setRoot("Kitchen");
    }

    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        App.setRoot("Livingroom");
    }

    @FXML
    private void goBedroom(ActionEvent event) throws IOException {
        App.setRoot("Bedroom");
    }

}
