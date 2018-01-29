package src.SelectionSort;/*
 * This class serves as the driver for the Arrayminimax class
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortRunner
{
	public static void main( String args[] )
	{
		//add test cases
		SelectionSort mySort = new SelectionSort();

		int[] testArray = new int[] {9,8,7,6,5,-4,3,2,0,-2};

		System.out.println(Arrays.toString(mySort.sort(testArray)));
	}
}