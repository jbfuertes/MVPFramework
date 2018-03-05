package com.john.mvpframework.di.component;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.john.mvpframework.App;
import com.john.mvpframework.di.module.ApplicationModule;
import com.john.mvpframework.di.qualifier.ApplicationContext;
import com.john.mvpframework.interactor.DataManager;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by john on 3/5/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager datamanager();

    Gson gson();

    Picasso picasso();

}
