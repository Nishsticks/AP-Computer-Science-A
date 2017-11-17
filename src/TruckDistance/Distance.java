package src.TruckDistance;//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;


public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;

	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne, xTwo, yOne, yTwo);

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		x2 = xTwo;
		y1 = yOne;
		y2 = yTwo;

	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";

		distanceA = Math.sqrt((x1*x1) + (y1*y1));
		distanceB = Math.sqrt((x2*x2) + (y2*y2));

		if (distanceA< distanceB)
		{
			result = "A is closer";

		}

		else
		{

			result = "B is closer";
		}


		return result;
	}
	
}