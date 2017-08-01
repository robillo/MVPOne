package com.robillo.mvpone.ui.base;

import com.androidnetworking.error.ANError;

/**
 * Created by robinkamboj on 01/08/17.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(ANError error);

    void setUserAsLoggedOut();
}
