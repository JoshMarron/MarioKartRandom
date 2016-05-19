package com.me.joshua.mariokartrandom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Random;

public class FirstMenuActivity extends AppCompatActivity {

    public static Random rand = new Random();
    public static final int NUM_BODIES = 36;
    public static final int NUM_WHEELS = 20;
    public static final int NUM_GLIDERS = 13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PartsData.initialiseBodies();
        PartsData.initialiseGliders();
        PartsData.initialiseWheels();

    }

    public void openRandomMode(View view)
    {
        Intent intent = new Intent(this, RandomKartActivity.class);
        FirstMenuActivity.this.startActivity(intent);
    }

    public void openBuilderMode(View view)
    {
        Intent intent = new Intent(this, KartBuilderActivity.class);
        FirstMenuActivity.this.startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
