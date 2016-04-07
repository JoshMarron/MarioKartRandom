package com.me.joshua.mariokartrandom;

import com.me.joshua.mariokartrandom.parts.*;

import java.util.ArrayList;

/**
 * Created by Joshua on 04/04/2016.
 */
public class Kart8Vehicle {
    private ArrayList<Kart8Part> parts;
    private Kart8Body body;
    private Kart8Wheels wheels;
    private Kart8Glider glider;

    public Kart8Vehicle(Kart8Body body, Kart8Wheels wheels, Kart8Glider glider) {
        this.body = body;
        this.wheels = wheels;
        this.glider = glider;

        parts = new ArrayList<Kart8Part>();

        parts.add(body);
        parts.add(wheels);
        parts.add(glider);

    }

    public Kart8Body getBody() {
        return this.body;
    }

    public Kart8Wheels getWheels() {
        return this.wheels;
    }

    public Kart8Glider getGlider() {
        return this.glider;
    }

    public ArrayList<Integer> calculateStats() {
        ArrayList<Integer> stats = new ArrayList<Integer>();

        int speed = body.getSpeed() + wheels.getSpeed() + glider.getSpeed();
        int acceleration = body.getAcceleration() + wheels.getAcceleration() + glider.getAcceleration();
        int weight = body.getWeight() + wheels.getWeight() + glider.getWeight();
        int handling = body.getHandling() + wheels.getHandling() + glider.getHandling();
        int traction = body.getTraction() + wheels.getTraction() + glider.getTraction();

        stats.add(speed);
        stats.add(acceleration);
        stats.add(weight);
        stats.add(handling);
        stats.add(traction);

        return stats;
    }
}
