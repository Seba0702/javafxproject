package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ApartmentController implements Initializable {

    @FXML
    private Button outside;
    @FXML
    private Button kitchen;
    @FXML
    private Button livingroom;
    @FXML
    private Button bedroom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void goOutside(ActionEvent event) throws IOException {
        App.setRoot("Outside");
    }

    @FXML
    private void goKitchen(ActionEvent event) throws IOException {
        App.setRoot("Kitchen");
    }

    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        App.setRoot("Livingroom");
    }

    @FXML
    private void goBedroom(ActionEvent event) throws IOException {
        App.setRoot("Bedroom");
    }

}
