package src;/*
 * A program to solve the quadratic formula. (No boolean logic appears.)
 * test cases (1 0 -9 yields 3, -3) (5 6 1 yields -0.2 -1)
 */

import java.util.Scanner;

public class QFormula		  
{
   public static void main(String args[])
	{
		// Define and initialize your variables here. 
		
		Scanner in = new Scanner( System.in );
		
		// get user input
		System.out.print("Enter a, b and c (on a single line): ");

		double a;
		double b;
		double c;
		a = b = c = in.nextDouble();



		
		//do math
		double sol1 = ((-b) + Math.sqrt(Math.pow(2, b) - (4 * a * c))) / (2 * a);
		double sol2 = ((-b) - Math.sqrt(Math.pow(2, b) - (4 * a * c))) / (2 * a);
		
		//Write your print statements below this line

		System.out.println("Solution 1: " + sol1);
		System.out.println("Solution 2: " + sol2);
		
	}
}