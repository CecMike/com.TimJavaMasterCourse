package PoliChallenge;

public class Toyota extends Car {

    public Toyota() {
        super("Toyota", 6);
    }

    @Override
    public void accelarte() {
        System.out.println("Toyota cheerfully accelerates");
    }

    @Override
    public void breaking() {
        System.out.println("Precisely breaking the Toyota comes to a stop");
    }

    @Override
    public void startEngine() {
        System.out.println("Toyotas engine comes joyfully to life");
    }
}
