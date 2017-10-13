package src.circle;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class CircleRunner
{
	public static void main( String[] args )
   {
		//add test cases


       Circle test = new Circle();

       test.setRadius(5);
       test.calculateArea();
       test.print();
       System.out.println(test.getRadius());
       System.out.println("Area via getArea method: " + test.getArea());



	}
}