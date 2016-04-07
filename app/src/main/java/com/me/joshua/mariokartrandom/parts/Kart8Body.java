package com.me.joshua.mariokartrandom.parts;

/**
 * Created by Joshua on 04/04/2016.
 */
public class Kart8Body extends Kart8Part
{
    public static final int CAR_BODY = 1;
    public static final int BIKE_BODY = 2;
    public static final int ATV_BODY = 3;


    private int bodyType;

    public Kart8Body(String partName, int bodyType, int speed, int acceleration, int weight, int handling, int traction)
    {
        super(partName, speed, acceleration, weight, handling, traction);

        this.bodyType = bodyType;
    }

    public int getBodyType()
    {
        return this.bodyType;
    }
}
