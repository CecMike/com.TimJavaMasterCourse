package MethodOerloading;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(70));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = 0;
        if ((feet <= 0) || ((inches < 0) || (inches >=12))) {
            centimeters = -1;
        } else {
            if ((feet >= 0) && ((inches >= 0) && (inches < 12))) {
                double totalInches = (feet*12) + inches;
                centimeters = totalInches* 2.54;
            }
        } return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double centimeters = 0;
        int feet = 0;
        double leftInches = 0;
        if (inches <0) {
            centimeters = -1;
        } else {
            if (inches >= 0) {
                feet = (int) (inches/12);
                leftInches = inches%12;
                centimeters = calcFeetAndInchesToCentimeters(feet, leftInches);
            }
        }return centimeters;
    }

}
