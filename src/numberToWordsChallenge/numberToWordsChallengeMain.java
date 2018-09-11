package numberToWordsChallenge;

public class numberToWordsChallengeMain {

    public static void main(String[] args) {


        System.out.println(getDigitCount(123));
        System.out.println(reverse(123));
        numberToWords(123);
        numberToWords(0);
        numberToWords(321);
        System.out.println(getDigitCount(10100));
        System.out.println(reverse(10100));
        numberToWords(10100);
        System.out.println(reverse(-12));

    }

    public static void numberToWords(int number){

        if (getDigitCount(number) < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int revNumber = reverse(number);
        int revNumberZero = getDigitCount(number) - getDigitCount(revNumber);
        boolean quit = false;
        while (!quit) {
            if(revNumber == 0) {
                quit = true;
                if (revNumber == 0) {
                    for (int i = 0; i < (revNumberZero); i++) {
                        System.out.println("Zero");
                    }
                }
                break;
            }

                switch (revNumber%10) {
                    case 0:
                        System.out.println("Zero");
                        revNumber = revNumber/10;
                        break;

                    case 1:
                        System.out.println("One");
                        revNumber = revNumber/10;
                        break;
                    case 2:
                        System.out.println("Two");
                        revNumber = revNumber/10;
                        break;

                    case 3:
                        System.out.println("Three");
                        revNumber = revNumber/10;
                        break;
                    case 4:
                        System.out.println("Four");
                        revNumber = revNumber/10;
                        break;
                    case 5:
                        System.out.println("Five");
                        revNumber = revNumber/10;
                        break;
                    case 6:
                        System.out.println("Six");
                        revNumber = revNumber/10;
                        break;
                    case 7:
                        System.out.println("Seven");
                        revNumber = revNumber/10;
                        break;
                    case 8:
                        System.out.println("Eight");
                        revNumber = revNumber/10;
                        break;
                    case 9:
                        System.out.println("Nine");
                        revNumber = revNumber/10;
                        break;

                }
                }


        System.out.println("****************************************");

            }





    public static int getDigitCount(int number){

        if (number == 0) {
            return 1;
        }

        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        while (number > 0) {
            digitCount++;
            number = number/10;
        }
        return digitCount;
    }

    public static int reverse(int number){

        int returnNumber = 0;

        if (number == 0) {
            returnNumber = 0;
        }

        while (number != 0) {
            returnNumber = ((returnNumber*10) + (number%10));
            number = number/10;
        }

        return returnNumber;
    }

}
