package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label nombre;
    @FXML
    private Label nota;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private void Guardar(ActionEvent e) throws IOException {

    }

    @FXML
    private void Mostrar(ActionEvent e) throws IOException {
        Stage stage;
        Parent root;
        /*String nombre=tf1.getText();
        lbl3.setText(nombre);*/


        if(e.getSource() == btn1) {
            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana2.fxml"));
        } else {
            stage = (Stage) btn2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana1.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
