package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Announcement {
    private final String type;
    private final String location;
    private final double price;
    private final String creator;

    public Announcement(@JsonProperty("type")String type, @JsonProperty ("location")String location, @JsonProperty ("price")double price, @JsonProperty ("creator")String creator) {
        this.type = type;
        this.location = location;
        this.price = price;
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getCreator() {
        return creator;
    }
}
