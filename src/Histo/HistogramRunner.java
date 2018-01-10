package src.Histo;//(c) A+ Computer Science
//  This program is the clinet to the Histogram class.
//Name -

public class HistogramRunner
{
	public static void main(String args[])
	{
	    
	/* We will not create an array in the runner. Using an OO paradigm, we will
	 * create objects of the Histogram class.
	 */
	
	// Create an object of the Histogram class.
	Histogram dataSet = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3");
	// Print your object
	System.out.println( dataSet);
	
	/* invoke a method on your object in order to build the histogram for the data set
	 * "2 3 4 5 6 7 8 9 0 2 3 5 6 8 8 8 9 4 5". Print your result.
	 */

	// the last data setto be tested is "2 3 4 5 6 7 8 2 0 2 3 5 6 8 8 8 9 4 5".
	
	}
}