package com.example.greendaomvptraining.plants;

import com.example.greendaomvptraining.application.ApplicationComponent;
import com.example.greendaomvptraining.util.PlantsScope;

import dagger.Component;

@PlantsScope
@Component(dependencies = ApplicationComponent.class, modules = PlantsModule.class)
public interface PlantsComponent {
    void inject(PlantsFragment target);
}
