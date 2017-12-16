//(c) A+ Computer Science
// www.apluscompsci.com

//Name - SK sol
//Date -
//Class -
//Lab  -  Uses Heron's formula to determine the area of a triangle  --with static field example

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
    private int sideA, sideB, sideC, uniqueID;
    private double theArea, perimeter;
    private static int lastIDAssigned = 0;
    

    public Triangle()
    {
       lastIDAssigned++;
       uniqueID = lastIDAssigned;
       setSides(0,0,0);
       perimeter=0;
       theArea=0;
    }

    public Triangle(int a, int b, int c)
    {
      lastIDAssigned++;
      uniqueID = lastIDAssigned;
      setSides(a, b, c);
      calcPerimeter();
      calcArea();

    }


    public void setSides(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;

    }

    public void calcPerimeter( )
    {
        perimeter = sideA + sideB + sideC;

    }

    public void calcArea( )
    {
        double s = perimeter / 2;
        theArea = Math.sqrt( s * (s - sideA) * (s - sideB) * (s - sideC) );

    }

    public void print( )
    {
        System.out.println();
        System.out.println("Triangle ID: " + uniqueID);
        System.out.println(sideA + " " + sideB + " " + sideC);
        System.out.println("Area == " + theArea);
        System.out.println("\n\n");
    }
}