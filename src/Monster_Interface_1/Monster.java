package src.Monster_Interface_1;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public interface Monster
{
	public int getHowBig();
	public String getName();
	public boolean isBigger(Monster other);	
	public boolean isSmaller(Monster other);
	public boolean namesTheSame(Monster other);
}