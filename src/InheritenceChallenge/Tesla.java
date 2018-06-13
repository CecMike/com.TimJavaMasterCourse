package InheritenceChallenge;

public class Tesla extends Car {

    private String model;

    public Tesla(int size, int power, String color, int wheels, String carType, String model) {
        super(size, power, color, wheels, carType);
        this.model = model;
    }

    @Override
    public void gearShift(int speed) {
        if (speed < 0) {
            System.out.println("The " + model + " is in reveres");
        } else if (speed > 0) {
            System.out.println("The " + model + " is in drive");
        } else {
            System.out.println("The " + model + " is in park");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
