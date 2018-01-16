package src.TriangleOne;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
		int count = 0;
		while (count <= size)
		{
			int row= 0;
			while (row <= count)
			{
				System.out.print(let);
				row ++;
			}
			System.out.println();
			count++;
		}

		return output;
	}
}