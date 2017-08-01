package com.robillo.mvpone.ui.base;

/**
 * Created by robinkamboj on 01/08/17.
 */

interface SubMvpView extends MvpView {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(MvpView mvpView);
}
