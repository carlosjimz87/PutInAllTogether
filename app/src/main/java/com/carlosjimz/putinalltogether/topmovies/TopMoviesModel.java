package com.carlosjimz.putinalltogether.topmovies;

import com.carlosjimz.putinalltogether.api.model.Result;

import rx.Observable;
import rx.functions.Func2;

/**
 * Created by carlosjimz on 27/09/2017.
 */

public class TopMoviesModel implements TopMoviesActivityMVP.Model {

    private Repository repository;

    public TopMoviesModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {

        return Observable.zip(repository.getResultData(), repository.getCountryData(), new Func2<Result, String, ViewModel>() {
            @Override
            public ViewModel call(Result result, String s) {
                return new ViewModel(result.title,s);
            }
        });
    }

}
