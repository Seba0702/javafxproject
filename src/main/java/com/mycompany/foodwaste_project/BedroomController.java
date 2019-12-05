package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.domain.Game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class BedroomController implements Initializable {
    
    Game g1 = Game.getInstance();
    
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
        g1.goLivingroom();
    }

    @FXML
    private void goEntrance(ActionEvent event) throws IOException {
        App.setRoot("Apartment");
        g1.goApartment();
    }

}
