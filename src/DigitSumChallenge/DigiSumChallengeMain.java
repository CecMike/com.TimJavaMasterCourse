package DigitSumChallenge;

public class DigiSumChallengeMain {

    public static void main(String[] args) {

        System.out.println(digiSum(10));
        System.out.println(digiSum(125));

    }

    public static int digiSum(int number) {

        int digitSum = 0;

        if (number < 10) {
            return -1;
        }

        while (number >= 1) {
            digitSum += (number % 10);
            number = number/10;
                    }
                    return digitSum;
    }
}
