package src.ExpressionSolver;// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver_SK
{
	//declare an array list field of type string with the name 'list'
	
	//declare a field of type String with the name 'expression'
	private String expression;

	public ExpressionSolver_SK(String s)
	{
		//create an array list of type string and assign it to 'list'
		
		//initialize the field 'expression' to the parameter s
		setExpression(s);
		
	}

	public void setExpression(String s)
	{
		// this does the same job as your constructor, but is callable at any point
		expression = s;
	}

	public void solveExpression()
	{
		//Use the Java API to decode this statement
		ArrayList<String>list = new ArrayList<String>(Arrays.asList(expression.split(" ")));
		
		
		
	}

	public String toString( )
	{
		return " ";
	}
}