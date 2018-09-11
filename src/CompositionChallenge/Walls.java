package CompositionChallenge;

public class Walls {

    private int numberOfWalls;
    private int height;
    private int lenght;


    public Walls(int numberOfWalls, int height, int lenght) {
        this.numberOfWalls = numberOfWalls;
        this.height = height;
        this.lenght = lenght;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }
}
