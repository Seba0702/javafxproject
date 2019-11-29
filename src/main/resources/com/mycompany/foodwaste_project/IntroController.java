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
import com.mycompany.foodwaste_project.AlertBox;
import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author svane
 */
public class IntroController implements Initializable {


    @FXML
    private Button yes;
    @FXML
    private Button no;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void ifYes(ActionEvent event) throws IOException {
        App.setRoot("Intro2");
    }

    @FXML
    private void ifNo(ActionEvent event) {
        no.setOnAction(e -> AlertBox.display("Alert!", "Are you sure you want to leave?"));
    }

}
