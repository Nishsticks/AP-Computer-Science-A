//Modified from (c) A+ Computer Science
// www.apluscompsci.com

//Matrix instantiation example 

/*  Directions. Compile and run. Explain each line of output you see.
 *  Add code to answer the questions that appear at the bottom.
 */

//import static java.lang.System.*;
import java.util.*;

public class MatrixOne
{
	public static void main(String args[])
	{
		int[][] mat = new int[3][5];

		System.out.println(mat[2][1]);
		System.out.println(mat[1][2]);
		System.out.println(mat.length);					//what does name.length give you?
		System.out.println(mat[0].length);					//what does name[0].length give you?
		System.out.println();
		System.out.println( Arrays.toString( mat[0] ) );           //outs the first row
		System.out.println( Arrays.toString( mat[1] ) );			//outs the 2nd row
		System.out.println( Arrays.toString( mat[2] ) );			//outs the 3rd row
		System.out.println();

		System.out.println("Part 2:");
		mat[0] = new int[]{3,4,5};

		System.out.println( Arrays.toString( mat[0] ) );
		System.out.println( Arrays.toString( mat[1] ) );            //how is 'mat' different now?
		System.out.println( Arrays.toString( mat[2] ) );			 //must a matrix be square?
		System.out.println();
		
		int[][] aplus = {{6, 9, 2},{5, 3, 4, 6}};
		System.out.println( Arrays.toString( aplus[0] ) );
		System.out.println( Arrays.toString( aplus[1] ) );
		System.out.println();									//Describe aplus in row/column language
	
	   // What will be printed if you print aplus[1][2]? Try it
	   
	   // What is printed if you access aplus[0][1]? Try it.
	   
	   // How would you print the 5? Try it.
	
	
	}
}