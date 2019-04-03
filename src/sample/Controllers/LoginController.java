package sample.Controllers;

import com.jfoenix.controls.JFXSnackbar;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sample.Data.ApiService;
import sample.Data.User;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController{

//    @FXML
//    private AnchorPane upScreen;
//
//    public void another() throws Exception{
//        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Layouts/screen.fxml"));
//        upScreen.getChildren().setAll(pane);
//    }



    @FXML
    private Label profileLabel;

    @FXML
    private AnchorPane root;

    @FXML
    public void initialize() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://mykiosk-api.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<List<User>> call = apiService.allUser();

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> user = response.body();
                if (user != null) {
                    user.forEach(user1 ->
                            Platform.runLater(
                                    () -> profileLabel.setText(user1.getFirstName()+" "+user1.getLastName()+" "+user1.getUserName())
                            ));
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable throwable) {
                System.out.println("Nice Error!");
            }
        });
    }

}
