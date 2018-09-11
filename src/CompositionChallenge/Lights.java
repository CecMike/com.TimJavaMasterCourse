package CompositionChallenge;

public class Lights {

    private int number;
    private int power;
    private boolean powered = false;

    public Lights(int number, int power) {
        this.number = number;
        this.power = power;
    }


    public void lightSwitch() {
        if (isPowered()) {
            setPowered(false);
            System.out.println("The lights have been turned off");
        } else {
            setPowered(true);
            System.out.println("The lights have been turned on");
            }

        }
    public int getNumber() {
        return number;
    }

    public int getPower() {
        return power;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }
}
