package JavaDrills.Arrays2;

public class ExerciseRunner {
    public static void main(String[] args) {
        //1. Create a string array with the days of the week
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //2. Set an empty string variable to hold the day with the most letters
        String dayWithMostChars = "";

        //3. Create a loop to go through the days array and pull out the day with the most letters
        for(String day:daysOfWeek) {
            if (day.length() > dayWithMostChars.length()){
                dayWithMostChars = day;
            }
        }
        System.out.println("Day with most number of letters " + dayWithMostChars);
        //4. To print out the days of the week in reverse
        for ( int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
