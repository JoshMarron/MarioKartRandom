package com.me.joshua.mariokartrandom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class RandomKartActivity extends AppCompatActivity {

    int numPlayers;
    public static Integer[] partIndexes = new Integer[29];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    public void numberChosen(View view)
    {
        String buttonText = ((Button) view).getText().toString();
        numPlayers = Integer.parseInt(buttonText.split(" ")[0]);

        for (int i = 1; i <= numPlayers; i++)
        {
            int bodyIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_BODIES + 1);
            int wheelsIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_WHEELS + 1);
            int gliderIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_GLIDERS + 1);

            //These indexes are used because they will not repeat - they can be found simply
            //mathematically and do not require us to specify indexes based on the player number
            partIndexes[i * 3] = bodyIndex;
            partIndexes[i * 5] = wheelsIndex;
            partIndexes[i * 7] = gliderIndex;
        }

        Intent myIntent = new Intent(this, RandomSelectedActivity.class);
        myIntent.putExtra("players", numPlayers);
        startActivity(myIntent);
    }
}
