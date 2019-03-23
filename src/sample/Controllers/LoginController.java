package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private AnchorPane upScreen;

    public void another() throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Layouts/screen.fxml"));
        upScreen.getChildren().setAll(pane);
    }
}
