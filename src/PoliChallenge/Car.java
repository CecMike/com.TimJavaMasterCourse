package PoliChallenge;



public class Car {

    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;
    private String color;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.color = pickColor();
    }

    public void accelarte() {
        System.out.println("The care is accelerating");
    }

    public void breaking() {
        System.out.println("The car is breaking");
    }

    public void startEngine() {
        System.out.println("The engine starts");
    }

    public String pickColor() {
        int randomColor = (int) (Math.random()*3)+1;

        switch (randomColor) {
            case 1:
                return "Red";
            case 2:
                return "Yellow";
            case 3:
                return "Blue";
        } return null;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }
}
