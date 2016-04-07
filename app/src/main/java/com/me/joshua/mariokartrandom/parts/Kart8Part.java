package com.me.joshua.mariokartrandom.parts;

/**
 * Created by Joshua on 04/04/2016.
 */
public class Kart8Part
{
    private int speed;
    private int acceleration;
    private int weight;
    private int handling;
    private int traction;
    private String partName;

    public Kart8Part(String partName, int speed, int acceleration, int weight, int handling, int traction)
    {
        this.partName = partName;
        this.speed = speed;
        this.acceleration = acceleration;
        this.weight = weight;
        this.handling = handling;
        this.traction = traction;

    }

    public String getPartName()
    {
        return partName;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getWeight() {
        return weight;
    }

    public int getHandling() {
        return handling;
    }

    public int getTraction() {
        return traction;
    }
}
