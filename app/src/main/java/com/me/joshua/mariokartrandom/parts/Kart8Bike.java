package com.me.joshua.mariokartrandom.parts;

/**
 * Created by Joshua on 04/04/2016.
 */
public class Kart8Bike extends Kart8Body
{
    //True if the bike can perform an inside drift
    private boolean insideDrift;

    public Kart8Bike(String partName, int speed, int acceleration, int weight, int handling, int traction, boolean insideDrift)
    {
        super(partName, Kart8Body.BIKE_BODY, speed, acceleration, weight, handling, traction);

        this.insideDrift = insideDrift;
    }

    public boolean isInsideDrift()
    {
        return insideDrift;
    }
}
