package com.veames.movies;

import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("author")
    private String author;

    @SerializedName("type")
    private String type;

    @SerializedName("review")
    private String review;

    public Review(String author, String type, String review) {
        this.author = Review.this.author;
        this.type = type;
        this.review = review;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Review {" +
                "author = '" + author + '\'' +
                ", type = '" + type + '\'' +
                ", review = '" + review + '\'' +
                '}';
    }

}
