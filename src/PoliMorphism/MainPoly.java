package PoliMorphism;

public class MainPoly {

    public static void main(String[] args) {

    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats people";
    }
}

class IndepedeceDay extends Movie{

    public IndepedeceDay() {
        super("Idependence day");
    }

    @Override
    public String plot() {
        return "Aliens take over";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids run through a maze to excape"
    }
}