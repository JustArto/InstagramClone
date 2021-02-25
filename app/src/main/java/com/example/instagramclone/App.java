package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kRrtiyJ7uufjXnBsqcKSOoYxdMMXL17GSEHRiZvM")
                // if defined
                .clientKey("lCIvNZpM6Vn35eKkBm0pBzaY7XFVV60uNBBXIyl2")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
