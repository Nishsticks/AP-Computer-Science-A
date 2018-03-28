package src.Monster_Interface_1;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Skeleton implements Monster
{
	//add instance variables	
    private String name;
    private int size;
	//add a constructor
    public Skeleton(String nam, int siz)
    {
        name = nam;
        size = siz;
    }

	//add code to implement the Monster interface

    @Override
    public int getHowBig() {
        return size;
    }

    @Override
    public boolean isBigger(Monster other) {
        if(size> other.getHowBig())
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSmaller(Monster other) {
        return false;
    }

    //add a toString
}