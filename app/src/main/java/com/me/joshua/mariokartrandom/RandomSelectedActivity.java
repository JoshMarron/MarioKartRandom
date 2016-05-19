package com.me.joshua.mariokartrandom;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle extras = getIntent().getExtras();
        numPlayers = extras.getInt("players");
        mainLayout = (LinearLayout) findViewById(R.id.linear_in_scroll_selected);

        createLayout();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.random_selected_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.refresh)
        {
            this.reRandomise();
            mainLayout.removeAllViews();
            this.createLayout();
        }



        return super.onOptionsItemSelected(item);
    }

    private void createLayout()
    {
        for (int i = 1; i <= numPlayers; i++)
        {
            View subLayout = LayoutInflater.from(this).inflate(R.layout.kart_layout, mainLayout, false);

            TextView playerName = (TextView) subLayout.findViewById(R.id.player_name);
            SpannableString name = new SpannableString("Player " + i + ":");
            name.setSpan(new UnderlineSpan(), 0, name.length(), 0);
            playerName.setText(name);

            //Retrieve the indexes of the chosen parts
            int bodyIndex = RandomKartActivity.partIndexes[i * 3];
            int wheelsIndex = RandomKartActivity.partIndexes[i * 5];
            int gliderIndex = RandomKartActivity.partIndexes[i * 7];

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

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            TextView speedHead = (TextView) subLayout.findViewById(R.id.speed_head);
            TextView accelerationHead = (TextView) subLayout.findViewById(R.id.acceleration_head);
            TextView weightHead = (TextView) subLayout.findViewById(R.id.weight_head);
            TextView handlingHead = (TextView) subLayout.findViewById(R.id.handling_head);
            TextView gripHead = (TextView) subLayout.findViewById(R.id.grip_head);

            speedHead.setText(R.string.speed);
            accelerationHead.setText(R.string.acceleration);
            weightHead.setText(R.string.weight);
            handlingHead.setText(R.string.handling);
            gripHead.setText(R.string.grip);

            speedHead.setTextSize(25);
            accelerationHead.setTextSize(25);
            weightHead.setTextSize(25);
            handlingHead.setTextSize(25);
            gripHead.setTextSize(25);
        }
    }

    private void reRandomise()
    {
        for (int i = 1; i <= numPlayers; i++)
        {
            int bodyIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_BODIES + 1);
            int wheelsIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_WHEELS + 1);
            int gliderIndex = FirstMenuActivity.rand.nextInt(FirstMenuActivity.NUM_GLIDERS + 1);

            //Retrieves the selected parts using the same method as in RandomKartActivity
            RandomKartActivity.partIndexes[i * 3] = bodyIndex;
            RandomKartActivity.partIndexes[i * 5] = wheelsIndex;
            RandomKartActivity.partIndexes[i * 7] = gliderIndex;
        }
    }


}
