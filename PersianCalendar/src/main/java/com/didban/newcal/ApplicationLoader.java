package com.byagowi.didbanCal;

import android.app.Application;
import android.util.Log;

import me.cheshmak.android.sdk.core.Cheshmak;
import me.cheshmak.cheshmakplussdk.core.CheshmakPlus;

public class ApplicationLoader extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Cheshmak.with(this);
        Cheshmak.initTracker("YourCheshmakId");
        CheshmakPlus.with(this);
    }
}
