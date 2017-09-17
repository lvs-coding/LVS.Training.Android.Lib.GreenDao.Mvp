package com.example.greendaomvptraining.application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

import com.example.greendaomvptraining.data.local.database.model.DaoMaster;
import com.example.greendaomvptraining.data.local.database.model.DaoSession;
import com.example.greendaomvptraining.data.local.database.util.DatabaseOpenHelper;
import com.example.greendaomvptraining.util.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    Context provideContext() {
        return context;
    }

    @Provides
    @ApplicationScope
    DatabaseOpenHelper provideDatabaseOpenHelper(Context context) {
        String databaseName = "plants.db";
        return new DatabaseOpenHelper(context, databaseName, null);
    }

    @Provides
    @ApplicationScope
    SQLiteDatabase provideSqliteDatabase(DatabaseOpenHelper databaseOpenHelper) {
        return  databaseOpenHelper.getReadableDatabase();

    }

    @Provides
    @ApplicationScope
    DaoMaster provideDaoMaster(SQLiteDatabase sqliteDatabase) {
        return new DaoMaster(sqliteDatabase);

    }

    @Provides
    @ApplicationScope
    DaoSession provideDaoSession(DaoMaster daoMaster) {
        return daoMaster.newSession();
    }
}
