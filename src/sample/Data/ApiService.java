package sample.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ApiService {
    @GET("/api/users")
    Call<List<User>> allUser();
}
