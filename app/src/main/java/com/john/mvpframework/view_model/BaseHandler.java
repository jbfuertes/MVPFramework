package com.john.mvpframework.view_model;


import com.john.mvpframework.ui.views.BaseView;

public interface BaseHandler<V extends BaseView> {

    void onAttach(V view);

    void onDetach();

    void onDestroy();

}
