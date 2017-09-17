package com.example.greendaomvptraining.plants;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.greendaomvptraining.R;
import com.example.greendaomvptraining.application.App;

import javax.inject.Inject;

public class PlantsFragment extends Fragment {
    @Inject
    PlantsContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plant, container, false);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        PlantsComponent plantsComponent = ((App)getActivity().getApplication()).getPlantsCompoent();
        plantsComponent.inject(this);
    }
}
