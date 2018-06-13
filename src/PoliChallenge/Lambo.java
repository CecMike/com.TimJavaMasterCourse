package PoliChallenge;

public class Lambo extends Car {

    public Lambo() {
        super("Lambo",12);
    }

    @Override
    public void accelarte() {
        System.out.println("The Lambo accelerates furiously");
    }

    @Override
    public void breaking() {
        System.out.println("The Lambo breaks wildly");
    }

    @Override
    public void startEngine() {
        System.out.println("The Lambo engine roars to life");
    }
}
