package com.example.greendaomvptraining.plants;


import android.util.Log;

import com.example.greendaomvptraining.data.local.database.model.DaoSession;
import com.example.greendaomvptraining.data.local.database.model.PlantDefinition;

public class PlantsPresenter implements PlantsContract.Presenter {
    private static final String TAG = PlantsPresenter.class.getSimpleName();

    private PlantsContract.View view;
    private DaoSession daoSession;

    public PlantsPresenter(DaoSession daoSession) {
        this.daoSession = daoSession;

       PlantDefinition pd = daoSession.getPlantDefinitionDao().load(1L);
       Log.d(TAG,pd.getPlantDefinition());
    }

    @Override
    public void takeView(PlantsContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        this.view = null;
    }
}
