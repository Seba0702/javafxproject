package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import com.mycompany.foodwaste_project.OnKeyClicked;

public class OutsideController implements Initializable {

    @FXML
    private Button apartment;
    @FXML
    private Button mcDonalds;
    @FXML
    private Button fakta;
    @FXML
    private Button naturmarket;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    @FXML
    private void goApartment(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
    }

    @FXML
    private void goMcDonalds(ActionEvent event) throws IOException {
        App.setRoot("mcDonalds");
    }

    @FXML
    private void goFakta(ActionEvent event) throws IOException {
        App.setRoot("Fakta");
    }

    @FXML
    private void goNaturmarket(ActionEvent event) throws IOException {
        App.setRoot("Naturmarket");
    }

}
