package com.veames.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {

    @SerializedName("kp")
    private double kpRating;

    public Rating(double kpRating) {
        this.kpRating = kpRating;
    }

    public double getKpRating() {
        return kpRating;
    }

    @Override
    public String toString() {
        return "Rating {" +
                "kpRating = '" + kpRating + '\'' +
                '}';
    }

}
