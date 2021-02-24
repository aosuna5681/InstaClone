package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ubxt962DMPsjcWbC99jZuvEa5uI8Auxe27RuJ72z")
                .clientKey("nL7dUyK1CRgL4iNMWZmi2yivquj3HPZ7veZDSs3Q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
