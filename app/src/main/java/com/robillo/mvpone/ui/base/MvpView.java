package com.robillo.mvpone.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by robinkamboj on 01/08/17.
 */

interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
