package src.PrimeNumber;//(c) A+ Computer Science
//www.apluscompsci.com
//Your Name


public class Prime
{
	private int number;

	public Prime()
	{
		number=0;
	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{

		for (int divisor=1; divisor<=number; divisor++){

			if (divisor !=1 && divisor!=number && number%divisor==0){
				return false;
			}
		}

		return true;
	}

	public String toString()
	{
		String output= "" + number;

		return output;
	}
}