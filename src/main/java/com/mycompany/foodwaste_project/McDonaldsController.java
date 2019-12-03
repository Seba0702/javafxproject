package com.mycompany.foodwaste_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class McDonaldsController implements Initializable {

    @FXML
    private Button outside;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void goOutside(ActionEvent event) throws IOException {
        App.setRoot("Outside");
    }

}
