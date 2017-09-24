package src;
/*NOTE: Comment the above line out before compiling on another computer. This above line was used to compile in
InteliJ java IDE.

This program takes in the coordinates of two points and finds the distance between them.

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


        System.out.println("Enter x1: ");
        x1 = input.nextInt();

        System.out.println("Enter y1");
        y1 = input.nextInt();

        System.out.println("Enter x2");
        x2 = input.nextInt();

        System.out.println("Enter y2");
        y2 = input.nextInt();


        dist = Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));

        System.out.println("Distance: " + dist);









    }


}
