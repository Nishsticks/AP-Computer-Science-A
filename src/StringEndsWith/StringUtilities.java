package src.StringEndsWith;//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Lab  -

//Precondition: string a will be longer than String b


import java.util.Scanner;

public class StringUtilities
{
 	public static boolean endsWith(String a, String b)

 	{
 		String ending = a.substring(a.length() - b.length(), a.length());

 		if (ending.compareTo(b) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}


	}
}