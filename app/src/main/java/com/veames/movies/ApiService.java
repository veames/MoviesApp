package com.veames.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=BQ6H30E-HH5MXEN-N01MM35-JQSRE3A&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=5")
    Single<MovieResponse> loadMovies(@Query("page") int page);

}
