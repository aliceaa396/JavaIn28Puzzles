package JavaDrills.SwitchExercises;

import java.util.Scanner;

public class SwitchExercise {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        System.out.println(determineNameOfDay(1));
        System.out.println();

    }

    public static String determineNameOfDay(int dayNum) {
        //switch on day number
        String result = "";
        switch (dayNum) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;

        }
        return result;
    }

    public static String determineNameOfMonth(int monthNum) {
        String result = "";

        switch (monthNum) {
            case 0:
                result = "January";
                break;
            case 1:
                result = "February";
                break;
            case 2:
                result = "March";
                break;
            case 3:
                result = "April";
                break;
            case 4:
                result = "May";
                break;
            case 5:
                result = "June";
                break;
            case 6:
                result = "July";
                break;
            case 7:
                result = "August";
                break;
            case 8:
                result = "September";
                break;
            case 9:
                result = "October";
                break;
            case 10:
                result = "November";
                break;
            case 11:
                result = "December";
                break;
        }
        return result;
    }

    public static boolean isWeekday(int dayNum) {
        //Could take advantage of fall through and only return true on case 5 all others will default to false
        switch (dayNum){
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
        }
        return false;
    }
}
