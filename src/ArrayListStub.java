/*
 * ArrayList stub
 */
package src;
import java.util.ArrayList;

public class ArrayListStub	  
{
   public static void main(String args[])
	{
		ArrayList myArray = new ArrayList();
		for (int i = 0; i<10; i++)
		{
			myArray.add(new Integer((int)(10* Math.random())));
		}
		System.out.println(myArray);
		System.out.println(reverse(myArray));
	}

	public static ArrayList<Integer> reverse(ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size()/2; i++)
		{
			Integer myInt = arr.get(arr.size()-1-i);
			myInt.byteValue();
			arr.set(arr.size()-i-1, arr.get(i));
			arr.set(i, myInt);
		}
		return arr;
	}
	public static ArrayList append(ArrayList arr1, ArrayList arr2)
	{
		for (int i = 0; i < arr2.size(); i++)
		{
			arr1.add(arr2.get(i));
		}
		return arr1;
	}
	public static ArrayList merge(ArrayList arr1, ArrayList arr2)
	{
		ArrayList output = new ArrayList();
		boolean shortest;

		if (arr1.size() > arr2.size())
		{
			shortest = true;
		}
		else
		{
			shortest = false;
		}

		if (shortest)
		{
			for (int i = 0; i <arr1.size(); i++)
			{
				output.add(arr1.get(i));
				output.add(arr2.get(i));
			}
			//output.add(arr2.subList(arr2.size() - arr1.size() - 1, arr2.size()));
			for (int i = arr2.size() - arr1.size() -1; i <arr2.size(); i++)
			{
				output.add(arr2.get(i));
			}
			return output;
		}
		else
		{
			for (int i = 0; i <arr2.size(); i++)
			{
				output.add(arr2.get(i));
				output.add(arr1.get(i));
			}
			//output.add(arr1.subList(arr1.size() - arr2.size() - 1, arr1.size()));
			for (int i = arr1.size() - arr2.size() -1; i <arr1.size(); i++)
			{
				output.add(arr1.get(i));

			}
			return output;
		}
	}
}