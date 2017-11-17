package src.TruckDistance;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import java.util.Scanner;


public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		System.out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		System.out.println(test.determineClosest());
		
		//add more test cases
	}
}