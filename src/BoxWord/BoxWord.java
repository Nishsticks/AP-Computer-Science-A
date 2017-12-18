package src.BoxWord;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
		setWord(s);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{

		String output = word + "\n";
		int count = 0;

		for (int i = 0; i<=word.length()-3; i++)
		{
			count = 0;

			String partA = word.substring(i+1,i+2);
			String partB = word.substring(word.length() -(i+2), word.length()-(i+1));
			output = output + partA;
			while (count < word.length()-2)
			{
				output = output+ " ";
				count++;
			}
			output = output + partB + "\n";
		}

		for (int a = word.length(); 0<a; a--)
		{
			output = output + word.substring(a-1, a);
		}

		return output;
	}
}