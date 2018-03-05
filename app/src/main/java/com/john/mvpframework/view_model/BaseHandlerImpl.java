package com.john.mvpframework.view_model;

import com.john.mvpframework.ui.views.BaseView;
import com.john.mvpframework.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;


public class BaseHandlerImpl<V extends BaseView> implements BaseHandler<V> {


    private SchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable;
    private V view;

    BaseHandlerImpl(SchedulerProvider schedulerProvider,
                    CompositeDisposable compositeDisposable) {

        this.schedulerProvider = schedulerProvider;
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        compositeDisposable.clear();
        view = null;
    }

    @Override
    public void onDestroy() {
        compositeDisposable.dispose();
    }

    boolean isViewAttached() {
        return view != null;
    }

    CompositeDisposable getCompositeDisposable(){
        return compositeDisposable;
    }

    SchedulerProvider getSchedulerProvider(){
        return schedulerProvider;
    }

    public V getView(){
        return view;
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.onAttach(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
