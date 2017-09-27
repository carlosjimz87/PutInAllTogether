package com.carlosjimz.putinalltogether.api;

import com.carlosjimz.putinalltogether.api.model.TopRated;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by carlosjimz on 27/09/2017.
 */

public interface MovieApiService {

    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);





}
