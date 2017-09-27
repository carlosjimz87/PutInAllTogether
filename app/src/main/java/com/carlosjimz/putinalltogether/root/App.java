package com.carlosjimz.putinalltogether.root;

import android.app.Application;

import com.carlosjimz.putinalltogether.api.ApiModuleForInfo;
import com.carlosjimz.putinalltogether.api.ApiModuleForName;
import com.carlosjimz.putinalltogether.topmovies.TopMoviesModule;

/**
 * Created by carlosjimz on 27/09/2017.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
