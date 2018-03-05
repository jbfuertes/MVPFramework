package com.john.mvpframework.presenter;


import com.john.mvpframework.interactor.DataManager;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by john on 11/29/17.
 */

public class SplashPresenterImpl extends BasePresenterImpl implements SplashPresenter {


    @Inject
    SplashPresenterImpl(DataManager dataManager) {
        super(dataManager);
    }



}
