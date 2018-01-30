//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix instantiation example 

//import static java.lang.System.*;

public class MatrixTwo
{
	public static void main(String args[])
	{
		int[][] mat = {{5,7,9,2,1,9},
									{5,3,4},
									{3,7,0,8,9}};

		System.out.println(mat[2][1]);
		System.out.println(mat[1][2]);
		System.out.println(mat[0][3]);
		System.out.println(mat[2][4]);
		System.out.println(mat[7/4][0]);
		System.out.println(mat[1*2][2]);
		System.out.println(mat.length);
		System.out.println(mat[0].length);
	}
}