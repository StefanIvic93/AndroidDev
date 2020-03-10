package com.example.stefan.cvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NoveFotografijeFragment extends Fragment implements View.OnClickListener{

    public static NoveFotografijeFragment newInstance() {
        return new NoveFotografijeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nove_fotografije, container, false);
        view.findViewById(R.id.imageFotografija).setOnClickListener(this);
        view.findViewById(R.id.imageFotografija2).setOnClickListener(this);
        view.findViewById(R.id.imageFotografija3).setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.imageFotografija:
                    this.openFoto1();
                    break;
                case R.id.imageFotografija2:
                    this.openFoto2();
                    break;
                case R.id.imageFotografija3:
                        this.openFoto3();
                    break;
            }
        }
        public void openFoto1 () {
        Intent foto1 = new Intent(getActivity(), Slika1Activity.class);
        startActivity(foto1);
        }
        public void openFoto2 () {
        Intent foto2 = new Intent(getActivity(), Slika2Activity.class);
        startActivity(foto2);
    }
        public void openFoto3 () {
        Intent foto3 = new Intent(getActivity(), Slika3Activity.class);
        startActivity(foto3);
    }
}


