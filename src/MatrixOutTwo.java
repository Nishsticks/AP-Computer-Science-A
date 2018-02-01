//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 2 -- INSTRUCTIONS below

public class MatrixOutTwo
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};


		//Predict/Run/Change the 2 to a 0/Predict/Run
		for(int c=0; c<mat[2].length; c++)
		{
			System.out.print(mat[2][c] + " ");
		}
		System.out.println();
	}
}
