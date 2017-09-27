package com.carlosjimz.putinalltogether.api;

import com.carlosjimz.putinalltogether.api.model.OmdbApi;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by carlosjimz on 27/09/2017.
 */

public interface MoreInfoApiService {

    @GET("/")
    Observable<OmdbApi> getCountry(@Query("t") String title);


}
