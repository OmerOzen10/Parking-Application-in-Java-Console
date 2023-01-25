import java.util.Arrays;

public class Time {

    private static int hours;
    private static int minutes;
    private static boolean afternoon;

    public Time() {
    }

    public Time(String militaryTime) {
        hours = Integer.parseInt(String.valueOf(militaryTime.split(":")[0]));
        minutes = Integer.parseInt(String.valueOf(militaryTime.split(":")[1]));

        if (hours > 12) {
            hours = hours - 12;
            afternoon = true;
        } else if (hours == 0) {
            hours = 12;
        } else if (hours == 12) {
            afternoon = true;
        }
    }


    public static boolean errorCheck(String militaryTime) {
        hours = Integer.parseInt(String.valueOf(militaryTime.split(":")[0]));
        minutes = Integer.parseInt(String.valueOf(militaryTime.split(":")[1]));

        if (militaryTime == null) {
            System.out.println(militaryTime + " is not a valid military time");
            return false;
        } else if (militaryTime.length() != 5) {
            System.out.println(" is not a valid military time. ");
            return false;
        } else if (militaryTime.charAt(2) != ':') {
            System.out.println(" is not a valid military time. ");
            return false;
        } else if (!Character.isDigit(militaryTime.charAt(0))) {
            System.out.println(" is not a valid military time. ");
            return false;
        } else if (!Character.isDigit(militaryTime.charAt(1))) {
            System.out.println(" is not a valid military time. ");
            return false;
        } else if (!Character.isDigit(militaryTime.charAt(3))) {
            System.out.println(" is not a valid military time. ");
            return false;
        } else if (!Character.isDigit(militaryTime.charAt(4))) {
            System.out.println(" is not a valid military time. ");
            return false;

        } else {
            if (hours > 23) {
                System.out.println(militaryTime + " is not a valid military time.");
                return false;
            } else if (minutes > 59) {
                System.out.println(militaryTime + " is not a valid military time.");
                return false;
            } else{return true;}
        }
    }

        public String toString () {
            String am_pm;
            String zero = "";
            if (afternoon)
                am_pm = "PM";
            else
                am_pm = "AM";
            if (minutes < 10)
                zero = "0";
            return hours + ":" + zero + minutes  + am_pm  + " ";
        }
}
