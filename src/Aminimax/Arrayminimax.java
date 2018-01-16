package src.Aminimax;/*
 * This class will find the min and max of an array
 */

public class Arrayminimax
{
	/*
	 * max will return the maximum value of the array
	 */
	public static int max(int[] numArray)
	{
		int maxVal = 0;
		for (int i = 0; i < numArray.length; i++)
		{

			for (int a = i+1; a < numArray.length; a++)
			{
				if (numArray[i] > numArray[a])
				{
					maxVal = numArray[i];
				}
			}
		}

		return maxVal;
	}

	/*
	 * min will return the minimum value of the array
	 */
	public static int min(int[] numArray)
	{
		int minVal = 0;
		for (int i = 0; i < numArray.length; i++)
		{

			for (int a = i+1; a < numArray.length; a++)
			{
				if (numArray[i] < numArray[a])
				{
					minVal = numArray[i];
				}
			}
		}

		return minVal;
    }
}