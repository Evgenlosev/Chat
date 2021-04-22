package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField myTextField;
    @FXML
    Button sendButton;


    public void sendMessage(ActionEvent actionEvent) {
        mainTextArea.appendText("Я: " + myTextField.getText()+"\n");
        myTextField.clear();
    }
}
