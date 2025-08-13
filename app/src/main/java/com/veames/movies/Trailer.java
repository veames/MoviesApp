package com.veames.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Trailer {

    @SerializedName("name")
    private String name;


    @SerializedName("url")
    private String url;

    public Trailer(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Trailer {" +
                "name = '" + name + '\'' +
                ", url = '" + url + '\'' +
                '}';
    }

}
