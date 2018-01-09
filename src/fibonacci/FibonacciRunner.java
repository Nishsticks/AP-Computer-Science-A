package src.fibonacci;//� A+ Computer Science  -  www.apluscompsci.com
//Name - SK (modified)
//Date -
//Class -
//Lab  - 

public class FibonacciRunner
{
	public static void main(String args[])
	{
		// Create a Fibonacci object that can store the first 50 Fibonacci numbers.
Fibonacci fib = new Fibonacci(50);
		
		System.out.println("size 50");
		System.out.println("1: " + fib.getFibo(1));
		System.out.println("2: " +fib.getFibo(2));
		System.out.println("3: " +fib.getFibo(3));
		System.out.println("4: " +fib.getFibo(4));
		System.out.println("5: " +fib.getFibo(5));
		System.out.println("6: " +fib.getFibo(6));
		System.out.println("11: " +fib.getFibo(11));
		System.out.println("16: " +fib.getFibo(16));
		System.out.println("21: " +fib.getFibo(21));
		System.out.println("13: " +fib.getFibo(31));
		System.out.println("14: " +fib.getFibo(41));
		System.out.println("46: " +fib.getFibo(46));
		System.out.println();
		
		fib.setFibo(1);
		System.out.println("size 1");
		System.out.println("1: " +fib.getFibo(1));
		System.out.println();
		
		fib.setFibo(2);
		System.out.println("size 2");
		System.out.println("1: " +fib.getFibo(1));
		System.out.println("2: " +fib.getFibo(2));
		System.out.println("11: " +fib.getFibo(11));
	}
}



