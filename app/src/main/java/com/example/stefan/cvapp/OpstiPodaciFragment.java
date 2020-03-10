package com.example.stefan.cvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OpstiPodaciFragment extends Fragment implements View.OnClickListener {

    public static OpstiPodaciFragment newInstance() {
        return new OpstiPodaciFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_opsti_podaci, container, false);

        view.findViewById(R.id.labelaAdresa).setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.labelaAdresa:
                this.openMap();
                break;
        }

    }

    public void openMap () {
        Intent mapa = new Intent(getActivity(), MapsActivity.class);
        startActivity(mapa);
    }
}