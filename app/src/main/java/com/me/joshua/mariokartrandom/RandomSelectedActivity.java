package com.me.joshua.mariokartrandom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RandomSelectedActivity extends AppCompatActivity {

    private ViewGroup mainLayout;
    private int numPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_selected);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();
        numPlayers = extras.getInt("players");
        mainLayout = (LinearLayout) findViewById(R.id.linear_in_scroll_selected);

        createLayout();

    }

    private void createLayout()
    {
        /*View subLayout = LayoutInflater.from(this).inflate(R.layout.kart_layout, mainLayout, false);
        View subLayout2 = LayoutInflater.from(this).inflate(R.layout.kart_layout, mainLayout, false);

        TextView playerName = (TextView) subLayout.findViewById(R.id.player_name);
        playerName.setText("Player 21");

        mainLayout.addView(subLayout);
        mainLayout.addView(subLayout2);*/

        for (int i = 1; i <= numPlayers; i++)
        {
            View subLayout = LayoutInflater.from(this).inflate(R.layout.kart_layout, mainLayout, false);

            TextView playerName = (TextView) subLayout.findViewById(R.id.player_name);
            SpannableString name = new SpannableString("Player " + i + ":");
            name.setSpan(new UnderlineSpan(), 0, name.length(), 0);
            playerName.setText(name);

            int bodyIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_BODIES + 1);
            int wheelsIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_WHEELS + 1);
            int gliderIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_GLIDERS + 1);

            Kart8Vehicle randVehicle = PartsData.buildVehicle(bodyIndex, wheelsIndex, gliderIndex);

            TextView bodyName = (TextView) subLayout.findViewById(R.id.body_name);
            TextView wheelsName = (TextView) subLayout.findViewById(R.id.wheels_name);
            TextView gliderName = (TextView) subLayout.findViewById(R.id.glider_name);

            bodyName.setText(randVehicle.getBody().getPartName());
            wheelsName.setText(randVehicle.getWheels().getPartName());
            gliderName.setText(randVehicle.getGlider().getPartName());

            this.populateTable(subLayout, randVehicle);

            mainLayout.addView(subLayout);

        }
    }

    private void populateTable(View subLayout, Kart8Vehicle playerVehicle)
    {
        TextView speed = (TextView) subLayout.findViewById(R.id.speed);
        TextView acceleration = (TextView) subLayout.findViewById(R.id.acceleration);
        TextView weight = (TextView) subLayout.findViewById(R.id.weight);
        TextView handling = (TextView) subLayout.findViewById(R.id.handling);
        TextView traction = (TextView) subLayout.findViewById(R.id.traction);

        ArrayList<Integer> stats = playerVehicle.calculateStats();
        speed.setText("" + stats.get(0));
        acceleration.setText("" + stats.get(1));
        weight.setText("" + stats.get(2));
        handling.setText("" + stats.get(3));
        traction.setText("" + stats.get(4));
    }
}
