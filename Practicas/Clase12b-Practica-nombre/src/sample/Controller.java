package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import javafx.scene.control.Button;

public class Controller {
    //@FXML private Button btn1;

   @FXML private Label lbl1;


    @FXML private void imprimir(ActionEvent evento){
lbl1.setText("Luis Delgado");
        
    }


}