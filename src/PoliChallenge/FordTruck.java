package PoliChallenge;

public class FordTruck extends Car {

    public FordTruck() {
        super("Ford Truck", 16);
    }

    @Override
    public void accelarte() {
        System.out.println("The truck sluggishly accelerates");
    }

    @Override
    public void breaking() {
        System.out.println("The truck squeals as it trys to brake");
    }

    @Override
    public void startEngine() {
        System.out.println("The engine pops a ear drum as it comes to life");
    }
}
