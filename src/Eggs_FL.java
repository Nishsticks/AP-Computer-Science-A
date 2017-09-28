package src
/*
* Nishanth Mankame
* 9/28/17
* Unit 0 Problem set Eggs_FL
*
* This program tell you the number of gross, dozen and leftover eggs when given a number of eggs
*/
import java.util.Scanner;

public class Eggs_FL {


    public static void main(String args[]){

   //Defining Variables
    int numEggs;
    int numGross;
    int numDozen;
    int numLeft;
    int leftoversMath;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of eggs: ");
    numEggs = input.nextInt(); //Gathering the number of eggs

    //Calculations using Mod
    numGross = numEggs/144;
    leftoversMath = numEggs%144;
    numDozen = leftoversMath/12;
    leftoversMath = leftoversMath%12;
    numLeft = leftoversMath;

    System.out.println("Using Mod:");
    System.out.println(numEggs + " eggs is " + numGross + " gross, " + numDozen + " dozen, and " + numLeft + " leftover eggs.");
    System.out.println("Without Mod:");

    //Calculations without using Mod
    numGross = numEggs/144;
    numDozen = (numEggs - (numGross*144))/12;
    numLeft = (numEggs - (numGross*144) - (numDozen*12));

    System.out.println(numEggs + " eggs is " + numGross + " gross, " + numDozen + " dozen, and " + numLeft + " leftover eggs.");




    }



}
