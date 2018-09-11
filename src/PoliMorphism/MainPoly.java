package PoliMorphism;

public class MainPoly {

    public static void main(String[] args) {

for (int i = 1; i<11; i++) {
    Movie movie = randomMovie();
    System.out.println("Movie #" + i + "\n" +
    ": " + movie.getName() + "\n" +
    "Plot: " + movie.plot());
}

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number is" + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndepedeceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new forgetableMovie();

        } return null;
    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        return "Kids run through a maze to escape";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("StarWars");
    }

    public String plot() {
        return "Piu Piu, I am your papa, UNLIMITED POWEEEEEER!!!!";
    }
}

class forgetableMovie extends Movie {

    public forgetableMovie() {
        super("You know, that one with the aaaa");
    }

    @Override
    public String plot() {
        return "It was with the guy and stuff";
    }
}