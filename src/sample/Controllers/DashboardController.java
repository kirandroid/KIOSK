package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private Label homeName;

    @FXML
    private Label eventName;

    @FXML
    private Label notificationName;

    @FXML
    private Label profileName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        homeName.setText("HOME NAME");
        eventName.setText("EVENT NAME");
        notificationName.setText("NOTIFICATION NAME");
        profileName.setText("PROFILE TEXT");
    }
}
