package com.veames.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    @SerializedName("docs")
    private List<Movie> moviesList;

    public MovieResponse(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

}
