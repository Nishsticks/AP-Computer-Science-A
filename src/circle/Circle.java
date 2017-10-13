package src.circle;//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;





	}

	public void calculateArea( )
	{

		area = Math.PI * radius * radius;



	}

	public double getRadius()
	{

		return radius;





	}

	public double getArea()
	{

		return area;


	}




	public void print( )
	{

		System.out.println("The area of the circle is: " + area);



	}
}