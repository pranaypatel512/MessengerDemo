package com.dagger.messengerdemo;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Harshit on 18/01/17.
 */

public class MessengerSendSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
        AppEventsLogger.activateApp(this);
    }
}