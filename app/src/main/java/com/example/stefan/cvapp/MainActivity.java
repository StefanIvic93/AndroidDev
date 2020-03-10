package com.example.stefan.cvapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    public static final int OPSTI_PODACI = 0;
    public static final int OBRAZOVANJE = 1;
    public static final int RADNO_ISKUSTVO = 2;
    public static final int TEHNICKA_ZNANJA = 3;
    public static final int FOTOGRAFIJE = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            setContentView(R.layout.activity_opsti_podaci);
//        } else {
//            setContentView(R.layout.opsti_podaci_landscape);
//        }
        setContentView(R.layout.activity_main);
        findViewById(R.id.labelaOpstiPodaci).setOnClickListener(this);
        findViewById(R.id.labelaObrazovanje).setOnClickListener(this);
        findViewById(R.id.labelaTehnickaZnanja).setOnClickListener(this);
        findViewById(R.id.labelaRadnoIskustvo).setOnClickListener(this);
        findViewById(R.id.labelaFotografije).setOnClickListener(this);
        findViewById(R.id.imageTehnickaZnanja).setOnClickListener(this);
        findViewById(R.id.imageRadnoIskustvo).setOnClickListener(this);
        findViewById(R.id.imageObrazovanje).setOnClickListener(this);
        findViewById(R.id.imageOpstiPodaci).setOnClickListener(this);
        findViewById(R.id.imageFotografije).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.labelaOpstiPodaci:
                this.openOpstiPodaci();
                break;
            case R.id.imageOpstiPodaci:
                this.openOpstiPodaci();
                break;
            case R.id.labelaObrazovanje:
                this.openObrazovanje();
                break;
            case R.id.imageObrazovanje:
                this.openObrazovanje();
                break;
            case R.id.imageRadnoIskustvo:
                this.openRadnoIskustvo();
                break;
            case R.id.labelaRadnoIskustvo:
                this.openRadnoIskustvo();
                break;
            case R.id.imageTehnickaZnanja:
                this.openTehnickaZnanja();
                break;
            case R.id.labelaTehnickaZnanja:
                this.openTehnickaZnanja();
                break;
            case R.id.imageFotografije:
                this.openFotografije();
                break;
            case R.id.labelaFotografije:
                this.openFotografije();
                break;
        }
    }

    public void openRadnoIskustvo() {
        Intent RadnoIskustvo = new Intent(this, ChangeFragmentActivity.class);
        RadnoIskustvo.putExtra("from", RADNO_ISKUSTVO);
        startActivity(RadnoIskustvo);
    }

    public void openTehnickaZnanja() {
        Intent TehnickaZnanja = new Intent(this, ChangeFragmentActivity.class);
        TehnickaZnanja.putExtra("from", TEHNICKA_ZNANJA);
        startActivity(TehnickaZnanja);
    }

    public void openFotografije() {
        Intent Fotografije = new Intent(this, ChangeFragmentActivity.class);
        Fotografije.putExtra("from", FOTOGRAFIJE);
        startActivity(Fotografije);
    }

    public void openObrazovanje() {
        Intent Obrazovanje = new Intent(this, ChangeFragmentActivity.class);
        Obrazovanje.putExtra("from", OBRAZOVANJE);
        startActivity(Obrazovanje);
    }

    public void openOpstiPodaci() {
        Intent opstiPodaci = new Intent(this, ChangeFragmentActivity.class);
        opstiPodaci.putExtra("from", OPSTI_PODACI);
        startActivity(opstiPodaci);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            setContentView(R.layout.activity_opsti_podaci);
//        } else {
//            setContentView(R.layout.opsti_podaci_landscape);
//        }
    }
}
