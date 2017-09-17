package com.example.greendaomvptraining.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.greendaomvptraining.R;
import com.example.greendaomvptraining.application.App;
import com.example.greendaomvptraining.data.local.database.model.PlantDefinition;
import com.example.greendaomvptraining.plants.PlantsFragment;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        PlantDefinition plantDefinition = ((App)getApplication()).getDaoSession().getPlantDefinitionDao().load(1L);
//
//        if (plantDefinition != null) {
//            Log.d(TAG, plantDefinition.getPlantDefinition());
//        }

        FragmentManager fm = getSupportFragmentManager();

        Fragment plantsFragment = fm.findFragmentById(R.id.fl_container);
        if(plantsFragment == null) {
            plantsFragment = new PlantsFragment();
            fm.beginTransaction()
                    .add(R.id.fl_container, plantsFragment)
                    .commit();
        }


    }
}
