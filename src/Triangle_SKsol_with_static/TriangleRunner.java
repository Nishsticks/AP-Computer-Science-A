//(c) A+ Computer Science
//www.apluscompsci.com

//Name - SK sol
//Date - Nov 2017
//Class - 
//Lab  -   Example of static field

import java.util.Scanner; 
import java.lang.Math.*;

public class TriangleRunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		
		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();


		Triangle test = new Triangle(a, b, c);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//ask for user input
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		test.setSides(a,b,c);
		test.calcPerimeter();
		test.calcArea();
		test.print();


		//add one more input section
        		//ask for user input
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		Triangle test2 = new Triangle(a, b, c);
		test2.calcPerimeter();
		test2.calcArea();
		test2.print();



	}
}