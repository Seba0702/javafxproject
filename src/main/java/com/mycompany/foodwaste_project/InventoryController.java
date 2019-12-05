package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.*;
import com.mycompany.foodwaste_project.domain.Game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class InventoryController implements Initializable {

    Game g1 = Game.getInstance();
    @FXML
    private Button closeButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void closeApp(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
    
}
