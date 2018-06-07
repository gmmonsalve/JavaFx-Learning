/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxexample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Gabriela
 */
public class Controller implements Initializable {
    
    @FXML
    private JFXTextField text;
    @FXML
    private JFXButton boton;
    
    @FXML
    private void click() {
        System.out.println("Click!");
        System.out.println(""+text.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       text.setFocusTraversable(false);
    }    
    
}
