package sample.Data;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("firstname")
    private String firtName;

    @SerializedName("lastname")
    private String lastName;

    @SerializedName("username")
    private String userName;

    public String getFirtName(){
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }


}
