package com.me.joshua.mariokartrandom.parts;

/**
 * Created by Joshua on 04/04/2016.
 */
public class Kart8Glider extends Kart8Part
{
    public Kart8Glider(String partName, int speed, int acceleration, int weight)
    {
        //All gliders have a handling and traction value of zero
        super(partName, speed, acceleration, weight, 0, 0);

    }
}
