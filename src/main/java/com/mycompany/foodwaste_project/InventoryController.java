package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.*;
import com.mycompany.foodwaste_project.domain.Game;
import java.net.URL;
import com.mycompany.foodwaste_project.domain.Item;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
    private ChoiceBox<Item> cbItems = new ChoiceBox<>();
    @FXML
    public Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbItems.getItems().addAll(g1.getInventory());
    }

    @FXML
    private void closeApp(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void donateItem(ActionEvent event) {
        g1.donate(cbItems.getValue().toString());
        
    }

    @FXML
    private void throwoutItem(ActionEvent event) {
        g1.throwout(cbItems.getValue().toString());

    }

    @FXML
    private void useItem(ActionEvent event) {
        g1.useItem(cbItems.getValue().toString());
    }

    @FXML
    private void eatItem(ActionEvent event) {
        g1.eat(cbItems.getValue().toString());
    }

    @FXML
    private void dropItem(ActionEvent event) {
        g1.getInventory().remove(cbItems.getValue());
        g1.dropItem(cbItems.getValue().toString());
        messageLabel.setText("You dropped some " + cbItems.getValue().getName());
        return;
    }

}
