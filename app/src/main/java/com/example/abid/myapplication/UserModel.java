package com.example.abid.myapplication;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("name")
    private String name;
    @SerializedName("location")
    private String location;
    @SerializedName("age")
    private float age;
    @SerializedName("url")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
