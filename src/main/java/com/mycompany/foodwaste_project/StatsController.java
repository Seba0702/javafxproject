package com.mycompany.foodwaste_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.foodwaste_project.domain.Game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author Cavra
 */
public class StatsController implements Initializable {

    Game g1 = Game.getInstance();
    @FXML
    private Label labelHealth;
    @FXML
    private Label labelHunger;
    
    @FXML
    private Button closeButton;
    @FXML
    private Label labelMoney;
  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        labelHealth.setText(String.valueOf(g1.getHealth()));
        labelHunger.setText(String.valueOf(g1.getHunger()));
        labelMoney.setText(String.valueOf(g1.getMoney()));
    }    
    
    @FXML
    private void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}
