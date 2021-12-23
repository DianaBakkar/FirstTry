package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Admin {
    public Admin(@JsonProperty ("username")String userName) {
        this.username = userName;
    }

    private final String username;

    public String getUsername() {
        return username;
    }
}
