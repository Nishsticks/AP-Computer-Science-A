package src.Doggies_Starter;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		int oldIndex = 0;
		for (int i = 0; i<pups.length; i++)
		{
			if (pups[i].getAge() > pups[oldIndex].getAge())
			{
				oldIndex = i;
			}
		}
		return pups[oldIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngIndex = 0;
		for (int i = 0; i<pups.length; i++)
		{
			if (pups[i].getAge() < pups[youngIndex].getAge())
			{
				youngIndex = i;
			}
		}
		return pups[youngIndex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}