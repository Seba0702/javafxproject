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
public class KitchenController implements Initializable {


    @FXML
    private Button entrance;
    @FXML
    private Button livingroom;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goEntrance(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
    }

    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        App.setRoot("Livingroom");
    }

}
