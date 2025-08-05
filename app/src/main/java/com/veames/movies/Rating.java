package com.veames.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("kp")
    private String kpRating;

    public Rating(String kpRating) {
        this.kpRating = kpRating;
    }

    public String getKpRating() {
        return kpRating;
    }

    @Override
    public String toString() {
        return "Rating {" +
                "kpRating = '" + kpRating + '\'' +
                '}';
    }

}
