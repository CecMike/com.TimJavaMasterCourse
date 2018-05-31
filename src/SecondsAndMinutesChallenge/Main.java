package SecondsAndMinutesChallenge;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(182, 20));
        System.out.println(getDurationString(3654, 20));
        System.out.println(getDurationString(10, 59));
        System.out.println(getDurationString(92, 20));
        System.out.println(getDurationString(305, 60));
        System.out.println(getDurationString(-5, 20));
        System.out.println(getDurationString(182, -3));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(7200));
        System.out.println(getDurationString(3605641));
        System.out.println(getDurationString(300));
        System.out.println(getDurationString(652021));
        System.out.println(getDurationString(-3600));




    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || ((seconds <0) || (seconds >59))) {
            return "Invalid value";
        }

        int leftMinutes = minutes%60;
        int hours = minutes/60;
        String durationReturn = "null";

        if (hours > 9) {
        if ((leftMinutes <10) && (seconds < 10)) {
            durationReturn = Integer.toString(hours) + "h 0" + Integer.toString(leftMinutes) + "m 0" + Integer.toString(seconds) + "s";

        } else if ((leftMinutes <10) && (seconds >= 10)) {
            durationReturn = Integer.toString(hours) + "h 0" + Integer.toString(leftMinutes) + "m " + Integer.toString(seconds) + "s";
        } else if ((leftMinutes >=10) && (seconds < 10)) {
            durationReturn = Integer.toString(hours) + "h " + Integer.toString(leftMinutes) + "m 0" + Integer.toString(seconds) + "s";

        } else if ((leftMinutes >= 10) && (seconds >= 10)) {
            durationReturn = Integer.toString(hours) + "h " + Integer.toString(leftMinutes) + "m " + Integer.toString(seconds) + "s";
        }
        } else if (hours < 10) {
            if ((leftMinutes <10) && (seconds < 10)) {
                durationReturn = "0" + Integer.toString(hours) + "h 0" + Integer.toString(leftMinutes) + "m 0" + Integer.toString(seconds) + "s";

            } else if ((leftMinutes <10) && (seconds >= 10)) {
                durationReturn = "0" + Integer.toString(hours) + "h 0" + Integer.toString(leftMinutes) + "m " + Integer.toString(seconds) + "s";
            } else if ((leftMinutes >=10) && (seconds < 10)) {
                durationReturn = "0" + Integer.toString(hours) + "h " + Integer.toString(leftMinutes) + "m 0" + Integer.toString(seconds) + "s";

            } else if ((leftMinutes >= 10) && (seconds >= 10)) {
                durationReturn = "0" + Integer.toString(hours) + "h " + Integer.toString(leftMinutes) + "m " + Integer.toString(seconds) + "s";
            }

        } return  durationReturn;
    }

    public static String getDurationString(int seconds) {

        if (seconds <0 ) {
            return "Invalid value";
        }

        int minutes = seconds/60;
        int leftSeconds = seconds%60;

        return getDurationString(minutes, leftSeconds);

    }

}
