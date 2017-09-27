package com.carlosjimz.putinalltogether.topmovies;

import com.carlosjimz.putinalltogether.api.model.Result;

import rx.Observable;

/**
 * Created by carlosjimz on 27/09/2017.
 */

public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
