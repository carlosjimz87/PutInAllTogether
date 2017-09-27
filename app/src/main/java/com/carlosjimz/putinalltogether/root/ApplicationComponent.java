package com.carlosjimz.putinalltogether.root;

import com.carlosjimz.putinalltogether.api.ApiModuleForInfo;
import com.carlosjimz.putinalltogether.api.ApiModuleForName;
import com.carlosjimz.putinalltogether.topmovies.TopMoviesActivity;
import com.carlosjimz.putinalltogether.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by carlosjimz on 27/09/2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
