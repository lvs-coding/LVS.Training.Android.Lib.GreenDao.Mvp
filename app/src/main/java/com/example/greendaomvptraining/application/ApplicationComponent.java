package com.example.greendaomvptraining.application;

import com.example.greendaomvptraining.util.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
}
