package de.mm.aademo.android;

import android.content.Context;

import android.support.multidex.MultiDex;

/**
 * Created by michael on 30.01.2017.
 */
public class Application extends android.app.Application{

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
