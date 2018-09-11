package InheritenceChallenge;

import java.sql.SQLOutput;

public class Vehicle {

    private int size;
    private boolean engine;
    private int power;
    private int speed;

    public Vehicle(int size, boolean engine, int power, int speed) {
        this.size = size;
        this.engine = engine;
        this.power = power;
        this.speed = speed;
    }

    public void move() {
        System.out.println("The vehicle is moving at " + getSpeed() + "kph");
    }


    public void steer(String direction) {
        if (direction.equals("right")) {
            System.out.println("You steer right");
        } else if (direction.equals("left")) {
            System.out.println("You steer left");
        } else {
            System.out.println("You are unshure of what you are dooing and in your confusion you drive off the road");
            setSpeed(0);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
