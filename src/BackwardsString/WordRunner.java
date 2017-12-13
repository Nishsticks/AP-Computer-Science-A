package src.BackwardsString;//(c) A+ Computer Science
//www.apluscompsci.com
//Name

//import javax.security.auth.Subject;

//import static java.lang.System.*;
import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		String word;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word :: ");
		word = in.next();
		Word myWord = new Word(word);

		System.out.println(myWord.getFirstLet());
		System.out.println(myWord.getLastLet());
		System.out.println(myWord.getBackWards());
		System.out.println(myWord.toString());

		
		//Create an object of the Word class
		
		//Print out the first and last letters and the word backwards
		
		// Here you go: System.out.println();				
	}
}