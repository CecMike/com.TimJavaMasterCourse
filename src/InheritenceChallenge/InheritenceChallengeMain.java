package InheritenceChallenge;

public class InheritenceChallengeMain {

    public static void main(String[] args) {

        Tesla modelX = new Tesla(5, 256, "White", 4, "SUV", "Model X");
        modelX.accelDecel(50);
        modelX.steer("right");
        modelX.accelDecel(120);
        modelX.accelDecel(-70);
        modelX.steer("dadsadasdas");
        modelX.setSpeed(0);
        modelX.move();
    }
}
