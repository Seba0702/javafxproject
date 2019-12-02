package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class BedroomController implements Initializable {

    @FXML
    private Button livingroom;
    @FXML
    private Button entrance;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        App.setRoot("Livingroom");
    }

    @FXML
    private void goEntrance(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
    }

}
