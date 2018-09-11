package InheritenceChallenge;

public class Car extends Vehicle {

    private String color;
    private int wheels;
    private String carType;

    public Car(int size, int power, String color, int wheels, String carType) {
        super(size, true, power, 0);
        this.color = color;
        this.wheels = wheels;
        this.carType = carType;
    }


    public void accelDecel(int amount) {
        int initalSpeed = getSpeed();
        if (amount > 0) {
            setSpeed(getSpeed()+amount);
            System.out.println("You accelerate by " + amount + "kph" + " from " + initalSpeed + "kph");
            move();
            } else if (amount < 0) {
            setSpeed(getSpeed()+amount);
            System.out.println("You decelerate by " + amount + "kph" + " from " + initalSpeed + "kph");
            move();
        } else {
            System.out.println("You maintain your speed at" + getSpeed());
        }
    }

    @Override
    public void move() {
        System.out.println("The car is moving at " + getSpeed() + "kph");
        gearShift(getSpeed());
    }

    public void gearShift(int speed) {

        if (speed < 0) {
            System.out.println("Car is in reveres");
        } else if (speed == 0) {
            System.out.println("car is in park");
        } else if ((speed > 0) && (speed < 30)) {
            System.out.println("Car is in 1st gear");
        } else if ((speed >30) && (speed <50)) {
            System.out.println("Car is in 2nd gear");
        } else if ((speed > 50) && (speed < 70)) {
            System.out.println("car is in 3rd gear");
        } else if ((speed > 70) && (speed < 100)) {
            System.out.println("car is in 4th gear");
        } else {
            System.out.println("Car is in 5th gear");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
