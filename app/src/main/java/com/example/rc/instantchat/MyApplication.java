package com.example.rc.instantchat;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by rc on 20/3/15.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "ZABOn58g3Xp13eQdmA1A5z7aGMuwQC5MzGFAdVDa", "SyyrsWVtmC6ODx9oY92mFxXPZG2OsBmnzVrPSE3j");
    }
}
