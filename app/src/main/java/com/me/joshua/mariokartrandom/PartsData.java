package com.me.joshua.mariokartrandom;
import java.util.HashMap;
import com.me.joshua.mariokartrandom.parts.*;

/**
 * Created by Joshua on 04/04/2016.
 */
public class PartsData
{
    static HashMap<Integer, Kart8Body> bodies;
    static HashMap<Integer, Kart8Wheels> wheels;
    static HashMap<Integer, Kart8Glider> gliders;

    private PartsData()
    {

    }

    public static void initialiseBodies()
    {
        bodies = new HashMap<Integer, Kart8Body>();
        /**
         * Cars range from index 0 to index 22
         */
        bodies.put(0, new Kart8Car("Standard Kart", 0, 0, 0, 0, 0));
        bodies.put(1, new Kart8Car("Pipe Frame", 0, 25, -25, 50, -50));
        bodies.put(2, new Kart8Car("Mach 8", 50, -25, 25, 0, 100));
        bodies.put(3, new Kart8Car("Steel Driver", 0, -50, 50, -50, 50));
        bodies.put(4, new Kart8Car("Cat Cruiser", 0, 0, 0, 0, 0));
        bodies.put(5, new Kart8Car("Circuit Special", 50, -25, 25, 0, -100));
        bodies.put(6, new Kart8Car("Tri-Speeder", 0, -50, 50, -50, 50));
        bodies.put(7, new Kart8Car("Badwagon", 0, -50, 50, -50, 50));
        bodies.put(8, new Kart8Car("Prancer", 0, 0, 0, 0, 0));
        bodies.put(9, new Kart8Car("Buggybud", -75, 125, -50, 50, -25));
        bodies.put(10, new Kart8Car("Landship", -75, 125, -50, 50, -25));
        bodies.put(11, new Kart8Car("Bounder", 0, 0, 0, 0 ,0));
        bodies.put(12, new Kart8Car("Sports Coupe", 50, -25, 25, 0, -100));
        bodies.put(13, new Kart8Car("Gold Kart", 50, -25, 25, 0, -100));
        bodies.put(14, new Kart8Car("Mercedes GLA", 0, -50, 50, -50, 50));
        bodies.put(15, new Kart8Car("W 25 Silver Arrow", 0, 25, -25, 50, -50));
        bodies.put(16, new Kart8Car("300 SL Roadster", 0, 0, 0, 0, 0));
        bodies.put(17, new Kart8Car("Blue Falcon", 25, 25, -25, 0, -50));
        bodies.put(18, new Kart8Car("Tanooki Kart", 0, -25, 25, -25, 25));
        bodies.put(19, new Kart8Car("B Dasher", 50, -25, 25, 0, -100));
        bodies.put(20, new Kart8Car("Streetle", 25, 25, -25, 0, -50));
        bodies.put(21, new Kart8Car("P-Wing", 50, -25, 25, 0, -100));

        /**
         * Bikes are from index 22 to 32
         */
        bodies.put(22, new Kart8Bike("Standard Bike", 0, 25, -25, 50, -50, false));
        bodies.put(23, new Kart8Bike("Comet", 0, 75, -25, 75, -125, true));
        bodies.put(24, new Kart8Bike("Sport Bike", 0, 75, -25, 75, -125, true));
        bodies.put(25, new Kart8Bike("The Duke", 0, 0, 0, 0, 0, false));
        bodies.put(26, new Kart8Bike("Flame Rider", 0, 25, -25, 50, -50, false));
        bodies.put(27, new Kart8Bike("Varmint", 0, 25, -25, 50, -50, false));
        bodies.put(28, new Kart8Bike("Mr. Scooty", -75, 125, -50, 50, -25, false));
        bodies.put(29, new Kart8Bike("Jet Bike", 0, 75, -25, 75, -125, true));
        bodies.put(30, new Kart8Bike("Yoshi Bike", 0, 75, -25, 75, -125, true));
        bodies.put(31, new Kart8Bike("Master Cycle", 25, 0, 0, 50, -75, true));
        bodies.put(32, new Kart8Bike("City Tripper", 0, 25, -25, 50, -50, false));

        /**
         * ATVs are from index 33 to 36
         */
        bodies.put(33, new Kart8ATV("Standard Quad", 0, -50, 50, -50, 50));
        bodies.put(34, new Kart8ATV("Wild Wiggler", 0, 25, -25, 50, -50));
        bodies.put(35, new Kart8ATV("Teddy Buggy", 0, 0, 0, 0, 0));
        bodies.put(36, new Kart8ATV("Bone Rattler", 0, -25, 25, -25, 25));
    }

    public static void initialiseWheels()
    {
        wheels = new HashMap<Integer, Kart8Wheels>();

        /**
         * Wheels are indexed from 0 to 20
         */
        wheels.put(0, new Kart8Wheels("Standard", 0, 0, 0, 0, 0));
        wheels.put(1, new Kart8Wheels("Monster", 0, -50, 50, -75, 75));
        wheels.put(2, new Kart8Wheels("Roller", -50, 100, -50, 25, -25));
        wheels.put(3, new Kart8Wheels("Slim", 25, -25, 0, 25, -50));
        wheels.put(4, new Kart8Wheels("Slick", 50, -25, 25, 0, -100));
        wheels.put(5, new Kart8Wheels("Metal", 25, -50, 50, 0, -50));
        wheels.put(6, new Kart8Wheels("Button", -50, 100, -50, 25, -25));
        wheels.put(7, new Kart8Wheels("Off-Road", 0, 0, 0, 0, 0));
        wheels.put(8, new Kart8Wheels("Sponge", -25, 25, -25, -25, 50));
        wheels.put(9, new Kart8Wheels("Wood", -25, 25, -25, -25, 50));
        wheels.put(10, new Kart8Wheels("Cushion", -25, 25, -25, -25, 50));
        wheels.put(11, new Kart8Wheels("Blue Standard", 0, 0, 0, 0, 0));
        wheels.put(12, new Kart8Wheels("Hot Monster", 0, -50, 50, -75, 75));
        wheels.put(13, new Kart8Wheels("Azure Roller", -50, 100, -50, 25, -25));
        wheels.put(14, new Kart8Wheels("Crimson Slim", 25, -25, 0, 25, -50));
        wheels.put(15, new Kart8Wheels("Cyber Slick", 50, -25, 25, 0, -100));
        wheels.put(16, new Kart8Wheels("Retro Off-Road", 0, 0, 0, 0, 0));
        wheels.put(17, new Kart8Wheels("Gold Tyres", 25, -50, 50, 0, -50));
        wheels.put(18, new Kart8Wheels("Mercedes GLA Tyres", 0, 0, 0, 0, 0));
        wheels.put(19, new Kart8Wheels("Triforce Tyres", 25, -25, 0, 25, -50));
        wheels.put(20, new Kart8Wheels("Leaf Tyres", -50, 100, -50, 25, -25));
    }

    public static void initialiseGliders()
    {
        gliders = new HashMap<Integer, Kart8Glider>();
        /**
         * Gliders are indexed from 0 to 13
         */
        gliders.put(0, new Kart8Glider("Super Glider", 0, 0, 0));
        gliders.put(1, new Kart8Glider("Cloud Glider", 0, 25, -25));
        gliders.put(2, new Kart8Glider("Wario Wing", 0, 0, 0));
        gliders.put(3, new Kart8Glider("Waddle Wing", 0, 0, 0));
        gliders.put(4, new Kart8Glider("Peach Parasol", 0, 25, -25));
        gliders.put(5, new Kart8Glider("Parachute", 0, 25, -25));
        gliders.put(6, new Kart8Glider("Parafoil", 0, 25, -25));
        gliders.put(7, new Kart8Glider("Flower Glider", 0, 25, -25));
        gliders.put(8, new Kart8Glider("Bowser Kite", 0, 25, -25));
        gliders.put(9, new Kart8Glider("Plane Glider", 0, 0, 0));
        gliders.put(10, new Kart8Glider("MKTV Parafoil", 0, 25, -25));
        gliders.put(11, new Kart8Glider("Gold Glider", 0, 0, 0));
        gliders.put(12, new Kart8Glider("Hylian Kite", 0, 25, -25));
        gliders.put(13, new Kart8Glider("Paper Glider", 0, 0, 0));
    }

    public static Kart8Vehicle buildVehicle(int bodyIndex, int wheelsIndex, int gliderIndex)
    {
        Kart8Body body = bodies.get(bodyIndex);
        Kart8Wheels wheel = wheels.get(wheelsIndex);
        Kart8Glider glider = gliders.get(gliderIndex);

        return new Kart8Vehicle(body, wheel, glider);
    }
}
