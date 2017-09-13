/*
 *   This class displays various info about time that has passed. It displays seconds since midnight, seconds remaining in the day,
 *   percent of day that has passed, and minutes that have passed sine programming
 */


public class Time
{
    public static void main(String args[])
    {
    // Insert current date, time, and seconds in 24 hr format below
    double hours = 12;
    double minutes = 3;
    double seconds = 0;
    double newHour = 12;

    //Insert time you finished programming below
    double newMinute = 49;
    double newSeconds =0;



    // Calculations for the time info
    double secMidnight = (hours * 60*60) + (minutes * 60) + seconds; // Calculates the amount of seconds since midnight
    double secRemain = (24*60*60) - secMidnight; // Calculates the amount of seconds that remain in the day
    double percentDay = (secMidnight / (24*60*60)) * 100;  //Calculates the percent of day that has passed
    double minutesPassed = ((newHour - newHour)*60*60) + (newMinute - minutes) + ((newSeconds - seconds)/60); // Calculates number of minutes that have passed



    // Here are the print statements for the time info
    System.out.println("The number of seconds since midnight is:" + " " + secMidnight);
    System.out.println("The number of seconds remaining in the day are:" + " " + secRemain);
    System.out.println("The percentage of day that has passed is:" + " " + percentDay + "%");
    System.out.println("The time that has passed while working on this lab is " + minutesPassed + " " + "minutes");


    }
}