package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ubxt962DMPsjcWbC99jZuvEa5uI8Auxe27RuJ72z")
                .clientKey("nL7dUyK1CRgL4iNMWZmi2yivquj3HPZ7veZDSs3Q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
