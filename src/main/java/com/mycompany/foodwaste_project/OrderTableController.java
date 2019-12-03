package com.mycompany.foodwaste_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author Cavra
 */
public class OrderTableController implements Initializable {


    @FXML
    private ChoiceBox<?> cbItems;
    @FXML
    private Label labelBalance;
    @FXML
    private Label labelHealth;
    @FXML
    private Label labelHunger;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
