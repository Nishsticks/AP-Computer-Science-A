package src.fibonacci;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Fibonacci
{
	// declare an integer array instance variable. Declare it only - it should just be null; no array yet.
	private int[] list;

	public Fibonacci()
	{
		list = new int[0];
							  // it seems pointless, but this no arg constructor should set your
							 // instance variable to an array of length 0. avoids Null Exception Errors.
	}

	public Fibonacci(int size)
	{
		setFibo(size);
	   						// use setFibo to CREATE and populate your array.
	}
	
	/* Assume that the size of the field will always be >= 1. I've pre-populated the
	 * first two elements (I had to make an assumption about the field name - you can change it.)
	 */ 
	public void setFibo(int size)
	{
		list = new int[size];
		list[0]=1;
		if (size >1)
		{
			list[1] = 1;
		}
		for (int i = 0; i< list.length-2; i++)
		{
			list[i+2] = list[i] + list[i+1];
		}
							//Complete the code to populate your instance variable
	}
	
	/* 
	 * Get a desired Fibonacci number. Recall the value to return if out of range.
	 */ 
	public int getFibo(int num)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == num)
			{
				return i;
			}
		}
		return -1;
	}

	/* 
	 * What should the toString method do? What does it mean to print this object?
	 */ 
	public String toString()
	{
		String output="";
		for (int i = 0; i<list.length; i++)
		{
			output+= i+ " - " + list[i] + "\n";
		}
		return output;
	}
}