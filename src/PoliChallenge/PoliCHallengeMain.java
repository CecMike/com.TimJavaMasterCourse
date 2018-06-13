package PoliChallenge;

public class PoliCHallengeMain {

    public static void main(String[] args) {

        for (int i =1; i<10; i++) {
            Car carPick = radomCar();
            System.out.println("The " + carPick.getCylinders() + " cylinder " + carPick.getColor() +" " + carPick.getName() + " was chosen");
            carPick.startEngine();
            carPick.accelarte();
            carPick.breaking();
            System.out.println("*********************");
        }

    }

    public static Car radomCar() {

        int randomNumber = (int) (Math.random()*3)+1;

        switch (randomNumber) {

            case 1:
                return new Lambo();
            case 2:
                return  new Toyota();
            case 3:
                return  new FordTruck();
        } return null;
    }
}
