/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 * FXML Controller class
 *
 * @author Cavra
 */
public class OutsideController implements Initializable {
    
    Game g1 = Game.getInstance();

    @FXML
    private Button apartment;
    @FXML
    private Button mcDonalds;
    @FXML
    private Button fakta;
    @FXML
    private Button naturmarket;
    @FXML
    private Button smartphoneButton;
    @FXML
    private Button statsButton;
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
        g1.goApartment();
    }

    @FXML
    private void goMcDonalds(ActionEvent event) throws IOException {
        App.setRoot("mcDonalds");
        g1.goMcDonalds();
    }

    @FXML
    private void goFakta(ActionEvent event) throws IOException {
        App.setRoot("Fakta");
        g1.goSupermarked();
    }

    @FXML
    private void goNaturmarket(ActionEvent event) throws IOException {
        App.setRoot("Naturmarket");
        g1.goLoesMarket();
    }

    @FXML
    private void openSmartphone(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Smartphone.fxml"));
        Parent parent = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        //stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(parent, 618, 661));
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

}
