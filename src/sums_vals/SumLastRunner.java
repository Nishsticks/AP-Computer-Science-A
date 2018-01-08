package src.sums_vals;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

/*
 *  So that you can focus on  building your skills with arrays, I'm providing you 
 *  the solution for the runner. You can skip right over it. However, if you want to 
 *  inspect it, ask yourself a few questions, such as
 *  There is no constructor in class raySumLast so how can we issue the new stmt here?
 *  Is 's' an array?
 *  What is the expected input to the 'go' method of RaySumLast?
 *  For the curious, the arguments sent to 'go' from this runner are examples of what's
 *  known in Java as 'anonymous arrays' - they are sort of created on the fly if you will.
 *  (For the super-duper doubly curious - Java also supports anonymous classes.)
 */

public class SumLastRunner
{
	public static void main( String args[] )
	{
		RaySumLast s = new RaySumLast();
		
		System.out.println( s.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,5} ) );
		System.out.println( s.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( s.go( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
		System.out.println( s.go( new int[]{32767} ) );
		System.out.println( s.go( new int[]{255,255} ) );
		System.out.println( s.go( new int[]{9,10,-88,100,-555,2} ) );
		System.out.println( s.go( new int[]{10,10,10,11,456} ) );
		System.out.println( s.go( new int[]{-111,1,2,3,9,11,20,1} ) );
		System.out.println( s.go( new int[]{9,8,7,6,5,4,3,2,0,-2,6} ) );
		System.out.println( s.go( new int[]{12,15,18,21,23,1000} ) );
		System.out.println( s.go( new int[]{250,19,17,15,13,11,10,9,6,3,2,1,0} ) );	
		System.out.println( s.go( new int[]{9,10,-8,10000,-5000,-3000} ) );											
	}
}



/*

40
55
230
-1
-1
119
-1
45
24
-1
356
10011



*/