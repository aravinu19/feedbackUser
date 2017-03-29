package com.ivara.aravi.feedbackuser;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Aravi on 29-03-2017.
 */

public class feedbackuser extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
