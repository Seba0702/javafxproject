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
import javafx.scene.layout.GridPane;
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
    @FXML
    private Button inventoryButton;
    @FXML
    private GridPane sleep;
    @FXML
    private Button buttonSleep;
    @FXML
    private Button roomInventoryButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goApartment(ActionEvent event) throws IOException {
    if(g1.checkTimeIsZero()==!true)
    {
        App.setRoot("Apartment");
        g1.goToRoom("apartment");
         
    }
    else 
    {
        
    }
    }
    @FXML
    private void goMcDonalds(ActionEvent event) throws IOException {
    if(g1.checkTimeIsZero()==!true)
    {
        App.setRoot("mcDonalds");
        g1.goToRoom("mcdonalds");
    }
    else 
    {
        
    }
    }
    @FXML
    private void goFakta(ActionEvent event) throws IOException {
    if(g1.checkTimeIsZero()==!true)
    {
        
        App.setRoot("Fakta");
        g1.goToRoom("fakta");
    }
    else
    {
        
    }
    }
    @FXML
    private void goNaturmarket(ActionEvent event) throws IOException {
    if(g1.checkTimeIsZero()==!true)
    {
        App.setRoot("Naturmarket");
        g1.goToRoom("naturmarket");
    }
    else{
        
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
