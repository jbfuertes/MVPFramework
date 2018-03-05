package com.john.mvpframework.di.module;

import android.app.Application;
import android.content.Context;

import com.john.mvpframework.App;
import com.john.mvpframework.di.qualifier.ApplicationContext;
import com.john.mvpframework.interactor.AppData;
import com.john.mvpframework.interactor.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 3/5/18.
 */

@Module(includes = NetworkModule.class)
public class ApplicationModule {

    private App app;

    public ApplicationModule(App app) {
        this.app = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return app;
    }

    @Provides
    Application provideApplication(){
        return app;
    }

    @Singleton
    @Provides
    DataManager provideDataManager(AppData appData){
        return appData;
    }


    /*@Singleton
    @Provides
    PreferenceManager providePreferenceManager(AppPreference appPreference){
        return appPreference;
    }*/

}
