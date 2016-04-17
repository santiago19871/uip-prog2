package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
//import javafx.scene.control.Button;

public class Controller {
    @FXML
   private Button btn1;
    @FXML
    private Label nombre;
    @FXML
    private Label edad;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;

    @FXML
    protected void imprimir (ActionEvent evento) {
        String nombre=txt1.getText();
        lbl4.setText(nombre);
        String valor = txt2.getText();
        int edad = Integer.parseInt(valor);

        if (edad >= 18) {
            lbl3.setText("Puede Votar");
        }
        else if (edad < 18){
            lbl3.setText("No Puede Votar");
        }



    }
}