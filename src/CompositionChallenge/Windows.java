package CompositionChallenge;

public class Windows {

    private int numberOfWindows;
    private boolean doublePly;
    private boolean opened = false;

    public Windows(int numberOfWindows, boolean doublePly) {
        this.numberOfWindows = numberOfWindows;
        this.doublePly = doublePly;
    }

    public void openOrClose() {


        if (opened) {
            this.opened = false;
            System.out.println("Windows were closed");
        } else {
            this.opened = true;
            System.out.println("Windows were opened");
        }
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public boolean isDoublePly() {
        return doublePly;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
