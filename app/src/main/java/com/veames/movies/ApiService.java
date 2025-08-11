package com.veames.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {

    String TOKEN_HEADER = "X-API-KEY: BQ6H30E-HH5MXEN-N01MM35-JQSRE3A";

    @Headers(TOKEN_HEADER)
    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&limit=40")
//    @GET("movie?rating.kp=3-5&sortField=votes.kp&sortType=1&limit=100")
//    @GET("movie?rating.kp=3-5&sortField=votes.kp&sortType=-1&limit=200")
    Single<MovieResponse> loadMovies(@Query("page") int page);

}