package com.example.greendaomvptraining.base;


public interface BasePresenter<T> {
    void takeView(T view);
    void dropView();
}