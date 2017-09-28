package src
/*
* Nishanth Mankame
* 9/28/17
* Unit 0 Problem set Distance_FL
*
* This program takes in the coordinates of two points and finds the distance between them.
*/
import java.util.Scanner;

public class Distance_FL {

    public static void  main(String args[]){
        Scanner input = new Scanner(System.in);

        int x1;
        int y1;
        int x2;
        int y2;

        double dist;

        //Obtaining coordinates of points
        System.out.println("Enter x1: ");
        x1 = input.nextInt();

        System.out.println("Enter y1");
        y1 = input.nextInt();

        System.out.println("Enter x2");
        x2 = input.nextInt();

        System.out.println("Enter y2");
        y2 = input.nextInt();

        //Calculating distance between points
        dist = Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));

        //Displaying points
        System.out.println("Distance: " + dist);



    }


}
