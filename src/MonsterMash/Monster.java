package src.MonsterMash;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import java.util.Arrays;
//import java.util.Scanner;
//import static java.lang.System.*;
//import static java.lang.Math.*;
//import static java.util.Arrays.*;
//import static java.util.Collections.*;

public class Monster
{
    private int weight;
    private int height;
    private int age;
	//build your own Monster class 
	//with methods like isBigger and isSmaller
	//or use your Monster class from
	//lab18 lab set 1
    public Monster(int wt, int ht, int ag)
    {
        weight = wt;
        height = ht;
        age = ag;
    }

    public boolean isBigger(int h)
    {
        if (height > h)
        {
            return true;
        }
        return false;
    }

    public boolean isSmaller(int h)
    {
        if (height < h)
        {
            return true;
        }
        return false;
    }

    public int getHeight()
    {
        return height;
    }

}

