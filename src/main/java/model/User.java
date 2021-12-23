package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private final String username;
    private final int numberOfPosts;

    public User(@JsonProperty("username")String username,@JsonProperty ("numberOfPosts") int numberOfPosts) {
        this.username = username;
        this.numberOfPosts = numberOfPosts;
    }

    public String getUsername() {
        return username;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
