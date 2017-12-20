package src.PrimeFact_PS.PrimeFact_PS;//(c) A+ Computer Science
//www.apluscompsci.com
/*
This program prints out the prime factorization of a few example numbers

@author Nishanth Mankame
Date: 12/19/17
 */
public class PrimeFactRunner
{
	public static void main ( String[] args )
	{
		// Notice I am not asking for user input -- that's a hassle.
		
		PrimeFact test = new PrimeFact(150);
		test.getPrimeFactors();
		System.out.println(test);
		test.setNum(24);
		test.getPrimeFactors();
		System.out.println(test);
		test.setNum(7);
		test.getPrimeFactors();
		System.out.println(test);
		test.setNum(6);
		test.getPrimeFactors();
		System.out.println(test);
		test.setNum(2);
		test.getPrimeFactors();
		System.out.println(test);
		//Use a for loop to add more test cases (perhaps 24 -> 2)
		
	}	
}