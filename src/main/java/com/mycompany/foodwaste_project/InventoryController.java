package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.*;
import com.mycompany.foodwaste_project.domain.Game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class InventoryController implements Initializable {

    Game g1 = Game.getInstance();
    @FXML
    private Button closeButton;
    @FXML
    private Button donateButton;
    @FXML
    private Button throwoutButton;
    @FXML
    private Button useButton;
    @FXML
    private Button eatButton;
    @FXML
    private Button dropButton;
    @FXML
    private ChoiceBox<?> cbItems;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void closeApp(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void donateItem(ActionEvent event) {
    }

    @FXML
    private void throwoutItem(ActionEvent event) {
    }

    @FXML
    private void useItem(ActionEvent event) {
    }

    @FXML
    private void eatItem(ActionEvent event) {
    }

    @FXML
    private void dropItem(ActionEvent event) {
    }
    
}
