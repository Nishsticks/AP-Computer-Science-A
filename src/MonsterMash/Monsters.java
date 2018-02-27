package src.MonsterMash;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import java.util.Arrays;
//import java.util.Scanner;
//import static java.lang.System.*;
//import static java.lang.Math.*;
//import static java.util.Arrays.*;
//import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
	    myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
        myMonsters[spot] = m;
	}

	public Monster getLargest( )
	{
	    int largeIndex= 0;
	    for (int i = 0; i<myMonsters.length; i++)
        {
            if (myMonsters[largeIndex].isBigger(myMonsters[i].getHeight()) && !myMonsters[largeIndex].isSmaller(myMonsters[i].getHeight()))
            {
                largeIndex = i;
            }
        }
		return myMonsters[largeIndex];
	}

	public Monster getSmallest( )
	{
        int smallIndex= 0;
        for (int i = 0; i<myMonsters.length; i++)
        {
            if (!myMonsters[smallIndex].isBigger(myMonsters[i].getHeight()) && myMonsters[smallIndex].isSmaller(myMonsters[i].getHeight()))
            {
                smallIndex = i;
            }
        }
        return myMonsters[smallIndex];
	}

	public String toString()
	{
		return "";
	}
}