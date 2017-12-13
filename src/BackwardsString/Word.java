package src.BackwardsString;//(c) A+ Computer Science
//www.apluscompsci.com
//Name

//import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word ="";
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirstLet()
	{
		return word.substring(0,1);
	}

	public String getLastLet()
	{
		return word.substring(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		for (int i = 0; i < word.length(); i++){
			back = word.substring(i, i+1) + back;
		}
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}