/*
 *   Replace this comment with a descriptive comment.
 */


public class Time		  // a general Java outline.
{
    public static void main(String args[])
    {
        // Define and initialize your variables here.
    double hours = 23; // Insert current time in hours and seconds in 24hr format
    double minutes = 8;
    System.out.println(System.currentTimeMillis());

    double secMidnight = (hours * 60*60) + (minutes * 60); // Calculates the amount of seconds since midnight


    double secRemain = (24*60*60) - secMidnight; // Calculates the amount of seconds that remain in the day



    double percentDay = (secMidnight / (24*60*60)) * 100;  //Calculates the percent of day that has passed





        // Write the main body of your program below this line
        System.out.println("The number of seconds since midnight is:" + " " + secMidnight);

        System.out.println("The number of seconds remaining in the day are:" + " " + secRemain);

        System.out.println("The percentage of day that has passed is:" + " " + percentDay + "%");



    }
}