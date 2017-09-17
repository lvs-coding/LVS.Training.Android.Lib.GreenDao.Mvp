package com.example.greendaomvptraining.plants;

import com.example.greendaomvptraining.data.local.database.model.DaoSession;
import com.example.greendaomvptraining.util.PlantsScope;

import dagger.Module;
import dagger.Provides;

@Module
public class PlantsModule {

    @Provides
    @PlantsScope
    PlantsContract.Presenter providePlantsPresenter(DaoSession daoSession) {
        return  new PlantsPresenter(daoSession);
    }

}
