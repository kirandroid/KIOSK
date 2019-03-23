package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.SnapshotParameters;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class test {

    @FXML
    private Circle avatar;

    @FXML
    public void initialize() {
        Image image = new Image("http://collider.com/wp-content/uploads/lego-batman-movie-dc-super-heroes-unite-1.jpg");
        avatar.setFill(new ImagePattern(image));

    }

}
