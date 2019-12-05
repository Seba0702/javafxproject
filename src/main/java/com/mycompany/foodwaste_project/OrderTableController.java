package com.mycompany.foodwaste_project;

import com.mycompany.foodwaste_project.domain.Game;
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

    Game g1 = Game.getInstance();
    @FXML
    private ChoiceBox<String> cbItems = new ChoiceBox<>();
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
        labelHealth.setText(String.valueOf(g1.getHealth()));
        labelHunger.setText(String.valueOf(g1.getHunger()));
        labelBalance.setText(String.valueOf(g1.getMoney()));
        
        //getItems returns the ObservableList object which you can add items to
        cbItems.getItems().addAll();
        

    }    
    
}
