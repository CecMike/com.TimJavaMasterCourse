package ForLoop;

public class MainForLoop {

    public static void main(String[] args) {

        for (int i = 2; i<9; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        for (int i = 8; i>1; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        primeNumberinRange(3, 23);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }

        for (int i=2; i<= n/2; i++) {
            if(n%i == 0) {
                return false;
            }


        } return true;
    }

    public static void primeNumberinRange(int rangeStart, int rangeEnd) {

        if (rangeStart > rangeEnd) {
            int placeHolder = rangeEnd;
            rangeEnd = rangeStart;
            rangeStart = placeHolder;
        }

        int count = 0;

        for (int i = rangeStart; i<= rangeEnd; i++) {

                if (isPrime(i)) {
                    System.out.println(i + " is a prime number");
                    count++;
                    if (count >= 3) {
                        break;
                    }
                }

        }

    }

}
