package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.domain.Game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ApartmentController implements Initializable {

    DonateNotificationController d1 = new DonateNotificationController();
    Game g1 = Game.getInstance();

    @FXML
    private Button outside;
    @FXML
    private Button kitchen;
    @FXML
    private Button livingroom;
    @FXML
    private Button bedroom;
    @FXML
    private Button statsButton;
    @FXML
    private Button smartphoneButton;
    @FXML
    private Button inventoryButton;
    @FXML
    private Button buttonSleep;
    @FXML
    private Button roomInventoryButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void goOutside(ActionEvent event) throws IOException {
        if (g1.checkTimeIsZero() == !true) {
            App.setRoot("Outside");
            g1.goToRoom("outside");
        } else {
            d1.makeNotification();
        }
        if (g1.getDay() >= 8 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
        }
    }

    @FXML
    private void goKitchen(ActionEvent event) throws IOException {
        if (g1.checkTimeIsZero() == !true) {
            App.setRoot("Kitchen");
            g1.goToRoom("kitchen");
        } else {
            d1.makeNotification();
        }
        if (g1.getDay() >= 8 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
        }
    }

    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        if (g1.checkTimeIsZero() == !true) {
            App.setRoot("Livingroom");
            g1.goToRoom("livingroom");
        } else {
            d1.makeNotification();
        }
        if (g1.getDay() >= 8 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
        }
    }

    @FXML
    private void goBedroom(ActionEvent event) throws IOException {
        if (g1.checkTimeIsZero() == !true) {
            App.setRoot("Bedroom");
            g1.goToRoom("bedroom");
        } else {
            d1.makeNotification();
        }
        if (g1.getDay() >= 8 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
        }
    }

    private void goMcDonalds(ActionEvent event) throws IOException {
        if (g1.checkTimeIsZero() == !true) {
            App.setRoot("mcDonalds");
            g1.goToRoom("mcdonalds");
        } else {
        }
        if (g1.getDay() >= 8 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
        }

    }

    @FXML
    private void openSmartphone(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Smartphone.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        //stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.setScene(new Scene(parent, 277, 661));
        stage.show();
    }

    @FXML
    private void viewStats(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Stats.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(parent, 600, 241));
        stage.show();
    }

    @FXML
    private void openInventory(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inventory.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(parent, 600, 241));
        stage.show();
    }

    @FXML
    private void sleep(ActionEvent event) throws IOException {

        if (g1.getDay() >= 7 || g1.getHealth() <= 0) {
            App.setRoot("GameOver");
            return;
        }

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sleepNotification.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(parent, 600, 241));
        stage.show();
    }

    @FXML
    private void onActionRoomInventoryButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RoomInventory.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(parent, 600, 241));
        stage.show();
    }

}
