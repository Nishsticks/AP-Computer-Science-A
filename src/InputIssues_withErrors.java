package src;/*
 * Beware of this Scanner behavior
 */
import java.util.Scanner;

public class InputIssues_withErrors		  
{
   public static void main(String args[])
	{
		// Define and initialize your variables here. 
	int num;
	String sentence;
	Scanner keyboard = new Scanner(System.in);
		
	System.out.print("Enter an integer :: ");
	num = keyboard.nextInt();
	keyboard.nextInt();
	
	System.out.print("Enter a sentence :: ");
	sentence = keyboard.nextLine();
	
	System.out.println(num + " " + sentence);
	
		
	
	}
}