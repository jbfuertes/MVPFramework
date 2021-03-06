package com.john.mvpframework.di.component;

import com.john.mvpframework.di.module.ActivityModule;
import com.john.mvpframework.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by john on 3/5/18.
 */

@PerActivity
@Component(modules = ActivityModule.class,dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    /*void inject(ActivitySplash activity);*/
}
