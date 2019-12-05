package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.domain.Game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ApartmentController implements Initializable {
    
    Game g1 = Game.getInstance();
    
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
        g1.goToRoom("outside");
    }

    @FXML
    private void goKitchen(ActionEvent event) throws IOException {
        App.setRoot("Kitchen");
        g1.goToRoom("kitchen");
    }

    @FXML
    private void goLivingroom(ActionEvent event) throws IOException {
        App.setRoot("Livingroom");
        g1.goToRoom("livingroom");
    }

    @FXML
    private void goBedroom(ActionEvent event) throws IOException {
        App.setRoot("Bedroom");
        g1.goToRoom("bedroom");
    }

}
