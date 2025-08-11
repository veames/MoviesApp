package com.veames.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {

    @GET("movie?field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=2&limit=5")
    @Headers("X-API-KEY: BQ6H30E-HH5MXEN-N01MM35-JQSRE3A")
    Single<MovieResponse> loadMovies();

}