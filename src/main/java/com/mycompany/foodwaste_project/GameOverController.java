/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.domain.Game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author svane
 */
public class GameOverController implements Initializable {
    Game g1 = Game.getInstance();

    @FXML
    private Label pointLabel;
    @FXML
    private Button quitButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pointLabel.setText("Point:" + g1.getPoint());
    }    
    
    @FXML
    private void quitGame(ActionEvent event) {
        quitButton.setOnAction(e -> AlertBox.display("Alert!", "Thanks for playing"));
    }

}