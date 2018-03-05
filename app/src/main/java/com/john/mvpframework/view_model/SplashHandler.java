package com.john.mvpframework.view_model;

import com.john.mvpframework.di.scope.PerActivity;
import com.john.mvpframework.ui.views.SplashView;

@PerActivity
public interface SplashHandler<V extends SplashView> extends BaseHandler<V> {

}
