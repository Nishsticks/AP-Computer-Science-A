package src.ArrayFunHouse;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum= 0;

		for (int i = start; i <= stop; i++)
		{
			sum += numArray[i];
		}
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int times = 0;
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] == val)
			{
				times++;
			}
		}


		return times;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		int count = 0;
		int[] outArray = new int[numArray.length - getCount(numArray, val)];
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] != val)
			{
				outArray[count] = numArray[i];
				count++;
			}
		}
		return outArray;
	}
}