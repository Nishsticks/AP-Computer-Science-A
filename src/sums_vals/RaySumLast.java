package src.sums_vals;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		if(ray.length == 0)
		{
			return -1;
		}

		for(int i = 0; i < ray.length; i++)
		{
			if (ray[i] > ray[ray.length -1])
			{
				sum+= ray[i];
			}
		}
		if (sum==0)
		{
			return -1;
		}
		else
		{
			return sum;
		}
	}
}