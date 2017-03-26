package com.abasscodes.hockeyserver;

import com.google.gson.annotations.SerializedName;

public class Contact {
    private String name;
    private String position;
    @SerializedName("image_url")
    private String imageUrl;

    public Contact(String name, String position, String imageUrl) {
        this.name = name;
        this.position = position;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPosition() {
        return position;
    }
}