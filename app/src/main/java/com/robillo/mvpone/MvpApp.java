package com.robillo.mvpone;

import android.app.Application;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by robinkamboj on 01/08/17.
 */

public class MvpApp extends Application {

    @Inject
    CalligraphyConfig mCalligraphyConfig;

}
