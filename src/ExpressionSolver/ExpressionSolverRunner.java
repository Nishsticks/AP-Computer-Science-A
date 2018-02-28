package src.ExpressionSolver;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		ExpressionSolver_SK test = new ExpressionSolver_SK("3 + 5");
		test.solveExpression();
		out.println(test);

		test.setExpression("3 * 5");
		test.solveExpression();
		out.println(test);

		test.setExpression("3 - 5");
		test.solveExpression();
		out.println(test);

		test.setExpression("3 / 5");
		test.solveExpression();
	   out.println(test);

	   test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		test.solveExpression();
		out.println(test);

	   test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		test.solveExpression();
		out.println(test);
	}
}