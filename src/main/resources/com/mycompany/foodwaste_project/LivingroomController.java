package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class LivingroomController implements Initializable {

    @FXML
    private Button kitchen;
    @FXML
    private Button entrance;
    @FXML
    private Button bedroom;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void goKitchen(ActionEvent event) throws IOException {
        App.setRoot("Kitchen");
    }

    @FXML
    private void goEntrance(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
    }

    @FXML
    private void goBedroom(ActionEvent event) throws IOException {
        App.setRoot("Bedroom");
    }

}
