//(c) A+ Computer Science
// www.apluscompsci.com

/* setting matrix values example 2 
*  INSTRUCTIONS:  Predict the exact contents of the matrix. Then compile, run, review.
*/



public class MatrixSetTwo
{
	public static void main(String args[])
	{
		int[][] mat = new int[5][5];

		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				mat[r][c] = r*c;
			}
		}

       /* the code below just prints out a nicely formatted matrix. Review
       *  but don't dwell on it.
       */


		for(int r=0; r<mat.length; r++)
		{
			System.out.print("row "+ r + " ");
			for(int c=0; c<mat[0].length; c++)
			{
				System.out.printf("%3d",mat[r][c]);
			}
			System.out.println();
		}
	}
}