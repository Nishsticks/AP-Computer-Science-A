package src.PrimeFact_PS.PrimeFact_PS;//(c) A+ Computer Science
//www.apluscompsci.com
/*
This program prints out the prime factorization of a few example numbers

@author Nishanth Mankame
Date: 12/19/17
*/

public class PrimeFact
{
	private int number;

	public PrimeFact()
	{
		number = 0;
	}

	public PrimeFact(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}

	public void getPrimeFactors()
	{
		int divisor = 1;
		int math = number;

		while (math/divisor > 1)
		{
			if (math%divisor == 0 && divisor!=1 && divisor != math)
			{
				System.out.print(divisor + "*");
				math = math/divisor;
				divisor =1;
			}
			divisor++;
		}
		System.out.print(math);
		// print your results (or make a helper method to do this)
	}

	public String toString()
	{
		String output="\nThe number under consideration is " + number;

		return output;
	}
}