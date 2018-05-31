package dayOfTheWeekChallenge;

public class MainDayOfTheWeekChallenge {

    public static void main(String[] args) {

        printDayOfTheWeek(1);
        printDayOfTheWeek(4);
        printDayOfTheWeek(453454354);
        printDayOfWeekIfElse(1);
        printDayOfWeekIfElse(5);
        printDayOfWeekIfElse(-1);


    }

    public static void printDayOfTheWeek (int day) {

        switch (day) {

            case 0:
                System.out.println("It is Sunday");
                break;
            case 1:
                System.out.println("It is Monday");
                break;

            case 2:
                System.out.println("It is Tuesday");
                break;

            case  3:
                System.out.println("It is Wednesday");
                break;

            case 4:
                System.out.println("It is Thursday");
                break;

            case 5:
                System.out.println("It is Friday");
                break;

            case 6:
                System.out.println("It is Saturday");
                break;

            default:
                System.out.println("Input value is not a valid day of the week");
                break;
        }



    }

    public static void printDayOfWeekIfElse(int day) {

        if (day == 0) {
            System.out.println("It is Sunday");

        } else if (day == 1) {
            System.out.println("It is Monday");

        } else if (day == 2) {
            System.out.println("It is Tuesday");

        } else if (day == 3) {
            System.out.println("It is Wednesday");

        } else if (day == 4) {
            System.out.println("It is Thursday");

        } else if (day == 5) {
            System.out.println("It is Friday");

        } else if (day == 6) {
            System.out.println("It is Saturday");

        } else {
            System.out.println("Input value is not a valid day of the week");

        }
     }

}
