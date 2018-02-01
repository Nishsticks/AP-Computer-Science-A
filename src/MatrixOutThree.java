//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 3 



public class MatrixOutThree
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};

		
		//add in a nested loop to print out mat
		//loop for row
			//loop for col
				//print stuff  -- print elements in a row on same line;println to end row
		for (int i = 0; i <mat.length; i++)
		{
			System.out.print("row " + i + " ");
			for (int a = 0; a<mat[i].length; a++)
			{
				System.out.print(mat[i][a] +" ");
			}
			System.out.println();
		}
		
		
		//expected output
		/*
			row 0   5  6  8  9
			row 1   2  3  5  0
			row 2   4  5  9  3
		*/
	}
}
