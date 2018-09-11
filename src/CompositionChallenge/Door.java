package CompositionChallenge;

public class Door {

    private int height;
    private int lenght;
    private boolean opened = false;

    public Door(int height, int lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public void opendShutDoor() {
        if (isOpened()) {
            System.out.println("It is drafty in here so you close the door");
            setOpened(false);
        } else {
            System.out.println("You open the door wide");
            setOpened(true);
        }
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
