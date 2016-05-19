package com.me.joshua.mariokartrandom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class KartBuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kart_builder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* CharSequence[] string = {"Hello", "Goodbye", "fartfartfart"};
        Spinner bodySpinner = (Spinner) findViewById(R.id.kart_builder_body_spinner);

        ArrayAdapter<CharSequence> bodyAdapter = ArrayAdapter.createFromResource(this, R.array.bodies_array, android.R.layout.simple_spinner_item);
        bodyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bodySpinner.setAdapter(bodyAdapter);*/


    }

}
