package com.example.greendaomvptraining.application;


import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.greendaomvptraining.BuildConfig;
import com.example.greendaomvptraining.data.local.database.model.DaoMaster;
import com.example.greendaomvptraining.data.local.database.model.DaoSession;
import com.example.greendaomvptraining.data.local.database.util.DatabaseOpenHelper;
import com.facebook.stetho.Stetho;

public class App extends Application {
    DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DatabaseOpenHelper helper = new DatabaseOpenHelper(this, "plants.db", null);
        SQLiteDatabase db = helper.getReadableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

        if (BuildConfig.DEBUG) {
            initializeStetho();
        }
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    private void initializeStetho() {
        // Create an InitializerBuilder
        Stetho.InitializerBuilder initializerBuilder = Stetho.newInitializerBuilder(this);

        // Enable Chrome DevTools
        initializerBuilder.enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this));

        // Enable command line interface
        initializerBuilder.enableDumpapp(Stetho.defaultDumperPluginsProvider(this));

        // Use the InitializerBuilder to generate an Initializer
        Stetho.Initializer initializer = initializerBuilder.build();

        // Initialize Stetho with the Initializer
        Stetho.initialize(initializer);
    }
}
