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
    private Label messageLabel;

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

        if (!cbItems.getValue().isFood()) {

            messageLabel.setText("This is not food!");
            return;
        }

        if (cbItems.getValue().getSpoiledStatus()) {

            messageLabel.setText("You can't donate spoiled food.. You should just throw the spoiled food in the trash.");

            return;
        } else {
            messageLabel.setText("Thanks! You just donated some " + cbItems.getValue().getName() + " to the foodbank. The food will now be used to feed people in need!");
            return;
        }

    }

    @FXML
    private void throwoutItem(ActionEvent event) {
        g1.throwout(cbItems.getValue().toString());

        if (!cbItems.getValue().isFood()) {
            messageLabel.setText("You just threw some " + cbItems.getValue().getName() + " out");
            return;
        }

        if (cbItems.getValue().getSpoiledStatus()) {
            messageLabel.setText("You just lost 10 points, because you threw something spoiled in the trash.");
            return;
        } else {
            messageLabel.setText("You just lost 10 points, because you threw something ediable in the trash.");
            return;
        }

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
