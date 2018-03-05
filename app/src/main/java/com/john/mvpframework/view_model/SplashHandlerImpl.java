package com.john.mvpframework.view_model;

import com.john.mvpframework.presenter.SplashPresenter;
import com.john.mvpframework.ui.views.SplashView;
import com.john.mvpframework.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SplashHandlerImpl<V extends SplashView> extends BaseHandlerImpl<V>
        implements SplashHandler<V>{

    @Inject
    SplashPresenter presenter;

    @Inject
    SplashHandlerImpl(SchedulerProvider schedulerProvider,
                      CompositeDisposable compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
    }


    @Override
    public void onAttach(V view) {
        super.onAttach(view);

        /*getCompositeDisposable().add(presenter.getAppStatus()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(aBoolean -> {
                    if(aBoolean){
                        getView().userLoggedIn();
                    }else getView().userLoggedOut();
                }));*/

    }

}
