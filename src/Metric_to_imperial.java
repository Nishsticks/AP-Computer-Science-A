/*
 * A simple program to convert a measurement in 
 * meters to the equivalent distance in miles, feet and inches.
 */


import java.util.Scanner;

public class Metric_to_imperial
{
   public static void main(String args[])
  {
  // Define your variables at the top
  double meters;
  double miles;
  double feet;
  double inches;



  Scanner keyboard = new Scanner(System.in);

  System.out.println("Enter your length in meters");
  meters = keyboard.nextInt();


  /*
   * Conversion statements here
   * This region will contain the bulk of your program logic.
   */
      miles = meters*0.000621371;
      feet = miles * 5280;
      inches = feet * 12;


	
    

   // Your print statement(s) should appear in this section.
      System.out.println("Miles: " + miles);
      System.out.println("Feet: " + feet);
      System.out.println("Inches: " + inches);
    
  }

}
