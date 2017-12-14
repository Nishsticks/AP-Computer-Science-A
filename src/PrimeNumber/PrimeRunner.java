package src.PrimeNumber;//(c) A+ Computer Science
//www.apluscompsci.com
//Your Name


public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime test = new Prime(24);
		System.out.println(test.isPrime());

		test.setPrime(7);
		System.out.println(test.isPrime());

		test.setPrime(100);
		System.out.println(test.isPrime());
		//add more test cases
		
	}	
}