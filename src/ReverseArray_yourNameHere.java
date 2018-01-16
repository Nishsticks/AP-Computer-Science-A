/*
 * Reverse an array in situ
 */



public class ReverseArray_yourNameHere {
	public static void main(String args[]) {

		int[] myArr = new int[]{5, 4, 3, 2, 1, 0};   //use even and odd length arrays
		revArray(myArr);


		for (int i = 0; i <myArr.length; i++)
			System.out.print(myArr[i] + " ");

		System.out.println();

	}

	public static void revArray(int[] a) {

		//Using a for loop reverse the array
		int placeHolder;

		for (int i = 0; i < a.length / 2; i++)
		{
			placeHolder = a[i];
			a[i] = a[a.length - (i+1)];
			a[a.length - (i+1)] = placeHolder;

		}
	}
}