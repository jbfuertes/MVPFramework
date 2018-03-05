package com.john.mvpframework.presenter;


import com.john.mvpframework.interactor.DataManager;

/**
 * Created by john on 11/29/17.
 */

class BasePresenterImpl implements BasePresenter {


    private DataManager dataManager;

    BasePresenterImpl(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    DataManager getDataManager(){
        return dataManager;
    }

}
