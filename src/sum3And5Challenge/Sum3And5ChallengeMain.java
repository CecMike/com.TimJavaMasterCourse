package sum3And5Challenge;

public class Sum3And5ChallengeMain {

    public static void main(String[] args) {

    printDivNumbersAndSum();

    }

    public static void printDivNumbersAndSum() {

        int count= 0;
        int sum = 0;

        for (int i = 1; i<= 1000; i ++) {

            if (count < 5) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    count++;
                    sum += i;
                    System.out.println("Number " + i + " is dividable by 3 and 5");

                }

            } else {
                System.out.println("The sum of the found numbers is = " + sum);
                break;
            }
        }

    }



}
