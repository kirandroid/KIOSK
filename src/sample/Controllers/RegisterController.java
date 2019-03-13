package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private TextField Username;

    @FXML
    private TextField Email;

    @FXML
    private Button RegisterButton;

    @FXML
    void RegisteClicked(ActionEvent event) {
        System.out.println("Hello"+ Username.getText());
    }


}
