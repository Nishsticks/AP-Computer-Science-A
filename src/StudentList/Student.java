package src.StudentList;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class Student
{
	private String name;
	private double gpa;	

	public Student()
	{
		name = "";
		gpa = 0;
	  
	}

	public Student(String n, double x)
	{
		name = n;
		gpa = x;
	  
	}

	public String getName()
	{
		return name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public String toString()
	{
		return name + " " + gpa;
	}
}