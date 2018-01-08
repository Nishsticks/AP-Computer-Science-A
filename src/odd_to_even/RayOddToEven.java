package src.odd_to_even;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		boolean foundOdd = false;
		boolean foundEven = false;
		int oddIndex = 0;
		int evenIndex = 0;

		while (!foundOdd && oddIndex < ray.length)
		{
			if (ray[oddIndex] %2 != 0)
			{
				foundOdd = true;
			}
			oddIndex++;
		}
		evenIndex = oddIndex;

		while (!foundEven && evenIndex < ray.length)
		{
			if (ray[evenIndex] %2 == 0)
			{
				foundEven= true;
			}
			evenIndex++;
		}

		if (foundOdd && foundEven)
		{
			return (evenIndex - oddIndex);
		}
		else
		{
			return -1;
		}
	}
}