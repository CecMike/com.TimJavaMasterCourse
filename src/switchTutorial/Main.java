package switchTutorial;

public class Main {

    public static void main(String[] args) {


//        int value = 1;
//        if (value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 1;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Value was 3 or 4 or 5");
//                break;
//
//            default:
//                System.out.println("Value was not 1, 2, 3, 4 or 5");
//                break;
//        }

        char switchChar = 'A';

        switch (switchChar) {

            case 'A':
                System.out.println("The character was A");
                break;

            case 'B':
                System.out.println("The character was B");
                break;

            case 'C':
                System.out.println("The character was C");
                break;

            case 'D':
                System.out.println("The character was D");
                break;

            case 'E':
                System.out.println("The character was E");
                break;

            default:
                System.out.println("The character was not found");
                break;
        }

    }
}
