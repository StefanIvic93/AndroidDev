package com.example.stefan.cvapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

public class ChangeFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_fragments);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getToolbarTitle());
        } else {
            Log.e("Toolbar: ", "Null");
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, replaceFragment())
                .commitAllowingStateLoss();
    }

    private String getToolbarTitle() {
        if (getIntent() == null) {
            finish();
        }

        int from = getIntent().getIntExtra("from", MainActivity.OPSTI_PODACI);

        switch (from) {
            case MainActivity.OPSTI_PODACI:
                return "Opsti podaci";
            case MainActivity.OBRAZOVANJE:
                return "Obrazovanje";
            case MainActivity.RADNO_ISKUSTVO:
                return "Radno iskustvo";
            case MainActivity.TEHNICKA_ZNANJA:
                return "Tehnicka znanja";
            case MainActivity.FOTOGRAFIJE:
                return "Fotografije";
            default:
                return "";
        }
    }

    private Fragment replaceFragment() {
        if (getIntent() == null) {
            finish();
        }

        int from = getIntent().getIntExtra("from", MainActivity.OPSTI_PODACI);

        switch (from) {
            case MainActivity.OPSTI_PODACI:
                return OpstiPodaciFragment.newInstance();
            case MainActivity.OBRAZOVANJE:
                return ObrazovanjeFragment.newInstance();
            case MainActivity.RADNO_ISKUSTVO:
                return RadnoIskustvoFragment.newInstance();
            case MainActivity.TEHNICKA_ZNANJA:
                return TehnickaZnanjaFragment.newInstance();
            case MainActivity.FOTOGRAFIJE:
                return NoveFotografijeFragment.newInstance();
            default:
                return OpstiPodaciFragment.newInstance();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
